package com.tom.spring.transaction;

import com.tom.spring.transaction.service.BookService;
import com.tom.spring.transaction.service.BookServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: TransactionTest
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/7 13:22
 */
public class TransactionTest {

    private BookService bookService;
    @Before
    public void init(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("com/tom/spring/transaction/spring-transaction.xml");
        bookService =
                applicationContext.getBean("bookServiceImpl", BookService.class);
    }

    @Test
    public void transactionTest(){
        System.out.println(bookService.getClass().getName());
        bookService.buyBook("user",1);
    }
}
