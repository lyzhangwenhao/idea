package com.tom.spring.test;

import com.tom.spring.annotation.controller.UserController;
import com.tom.spring.annotation.dao.UserDao;
import com.tom.spring.annotation.dao.UserDaoImpl;
import com.tom.spring.annotation.service.UserService;
import com.tom.spring.annotation.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: AnnotationTest
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/5 19:13
 */
public class AnnotationTest {
    @Test
    public void test01(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring-annotation.xml");

//        UserDao userDao = applicationContext.getBean("userDaoImpl", UserDao.class);
//        System.out.println(userDao);

        UserService userService = applicationContext.getBean("userServiceImpl", UserService.class);
        System.out.println(userService);

//        UserController userController = applicationContext.getBean("userController", UserController.class);
//        System.out.println(userController);
    }

    @Test
    public void test02(){
        ApplicationContext applicationContext=
                new ClassPathXmlApplicationContext("spring-annotation.xml");
        UserController userController = applicationContext.getBean("userController", UserController.class);
        userController.register();
    }
}
