package com.tom.spring.test;

import com.tom.spring.autowire.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: AutowireTest
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/5 17:07
 */
public class AutowireTest {
    @Test
    public void autowireTest(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("com/tom/spring/test/autowireApplication.xml");
        Person person = applicationContext.getBean("person", Person.class);
        System.out.println(person);
    }
}
