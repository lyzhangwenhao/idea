package com.tom.spring.test;

import com.tom.spring.entity.StudentEntity;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: Test01
 * Description:
 *
 * @date 2019/9/29 21:32
 * @author: Mi_dad
 */
public class Test01 {
    @Test
    public void studentTest(){
        ApplicationContext cxt = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentEntity studentEntity1 = cxt.getBean("studentEntity1", StudentEntity.class);
        System.out.println(studentEntity1);
    }

    @Test
    public void studentTest01(){
        ApplicationContext cxt =
                new ClassPathXmlApplicationContext("com/tom/spring/entity/spring-student.xml");
        StudentEntity studentEntity1 = cxt.getBean("studentEntity1", StudentEntity.class);
        System.out.println(studentEntity1);
    }

    @Test
    public void studentTest02(){
        ApplicationContext cxt =
                new ClassPathXmlApplicationContext("com/tom/spring/entity/spring-student.xml");
        StudentEntity studentEntity2 = cxt.getBean("studentEntity2", StudentEntity.class);
        System.out.println(studentEntity2);
    }
}
