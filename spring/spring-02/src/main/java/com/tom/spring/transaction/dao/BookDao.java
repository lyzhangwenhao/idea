package com.tom.spring.transaction.dao;

/**
 * ClassName: BookDao
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/7 12:55
 */
public interface BookDao {

    Double getPriceById(Integer id);

    Integer updateBookStock(Integer id);

    Integer updateAccount(String username,double price);
}
