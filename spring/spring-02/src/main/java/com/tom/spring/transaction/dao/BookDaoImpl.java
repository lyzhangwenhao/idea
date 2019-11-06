package com.tom.spring.transaction.dao;

import com.tom.spring.transaction.exception.BookStockException;
import com.tom.spring.transaction.exception.UserAccountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * ClassName: BookDaoImpl
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/7 12:56
 */
@Repository
public class BookDaoImpl implements BookDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Double getPriceById(Integer id) {
        String sql = "select price from book where id = ?";
        Double price = jdbcTemplate.queryForObject(sql, Double.class, id);

        return price;
    }

    @Override
    public Integer updateBookStock(Integer id) {

        String s = "select stock from book_stock where book_id = ?";
        Integer stock = jdbcTemplate.queryForObject(s, Integer.class, id);
        if(stock<=0){
           throw  new BookStockException("库存不足......");
        }

        String sql = "update book_stock set stock = stock - 1 where book_id = ?";
        Integer update = jdbcTemplate.update(sql, id);
        return update;
    }

    @Override
    public Integer updateAccount(String username, double price) {
        String s = "select balance from account where username = ?";
        Integer balance = jdbcTemplate.queryForObject(s, Integer.class, username);
        if(balance<price){
            throw new UserAccountException("余额不足");
        }

        String sql = "update account set balance = balance - ? where username = ?";
        Integer update = jdbcTemplate.update(sql, price, username);
        return update;
    }
}
