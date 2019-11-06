package com.tom.spring.proxy;

import com.tom.spring.annotation.dao.UserDao;
import com.tom.spring.annotation.dao.UserDaoImpl;

/**
 * ClassName: Test
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/5 23:26
 */
public class Test {
    public static void main(String[] args) {
        //目标对象
        Calculator target = new CalculatorImpl();
        //获取代理对象
        Object obj = new CalculatorProxy(target).getProxy();
        //转回具体的对象
        Calculator proxy = (Calculator) obj;

        int add = proxy.add(2, 13);
        System.out.println(add);

        System.out.println("----------------");

        int sub = proxy.sub(23, 12);
        System.out.println(sub);

        /*
        UserDao userDao = new UserDaoImpl();
        Object obj = new CalculatorProxy(userDao).getProxy();
        UserDao proxy = (UserDao)obj;

        proxy.addUser();
        */
    }
}
