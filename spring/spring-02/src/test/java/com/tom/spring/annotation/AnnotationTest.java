package com.tom.spring.annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: AnnotationTest
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/6 14:08
 */
public class AnnotationTest {

    @Test
    public void addTest(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("com/tom/spring/annotation/spring-annotation.xml");
        Calculator calculator = applicationContext.getBean("calculatorImpl", Calculator.class);
        int add = calculator.add(12, 13);
//        System.out.println(calculator.getClass().getName());
        System.out.println(add);
    }

    @Test
    public void subTest(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("com/tom/spring/annotation/spring-annotation.xml");
        Calculator calculator = applicationContext.getBean("calculatorImpl", Calculator.class);
        int add = calculator.sub(12, 13);
//        System.out.println(calculator.getClass().getName());
        System.out.println(add);
    }


    @Test
    public void divTest(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("com/tom/spring/annotation/spring-annotation.xml");
        Calculator calculator = applicationContext.getBean("calculatorImpl", Calculator.class);
        int div = calculator.div(3, 0);
        System.out.println(div);
    }
}
