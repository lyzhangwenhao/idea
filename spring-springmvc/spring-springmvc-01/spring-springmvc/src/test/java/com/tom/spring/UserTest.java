package com.tom.spring;

import com.tom.spring.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: UserTest
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/10 19:25
 */
public class UserTest {
    @Test
    public void userTest01(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);
    }

}
