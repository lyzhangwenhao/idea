package com.tom.spring.transaction.service;

import com.tom.spring.transaction.dao.BookDao;
import com.tom.spring.transaction.exception.BookStockException;
import com.tom.spring.transaction.exception.UserAccountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * ClassName: BookServiceImpl
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/7 13:20
 */

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookDao bookDao;

    @Transactional(isolation = Isolation.READ_COMMITTED,rollbackFor = {UserAccountException.class, BookStockException.class})
    @Override
    public void buyBook(String username, Integer id) {
        Double price = bookDao.getPriceById(id);

        System.out.println("价格:"+price);

        Integer account = bookDao.updateAccount(username, price);
        System.out.println("更新账户条数:"+account);

        Integer stock = bookDao.updateBookStock(id);
        System.out.println("更新库存条数:"+stock);
    }
}
