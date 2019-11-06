package com.tom.spring.test;

import com.tom.spring.entity.TestBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

/**
 * ClassName: TestBeanTest
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/5 15:05
 */
public class TestBeanTest {
    @Test
    public void testBeanTest(){
//        使用ApplicationContext不能调用close方法
//        ApplicationContext applicationContext =
//                new ClassPathXmlApplicationContext("com/tom/spring/test/testApplicationContext.xml");
        ConfigurableApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("com/tom/spring/test/testApplicationContext.xml");
        TestBean test01 = applicationContext.getBean("test01", TestBean.class);
        System.out.println("===>4.使用bean对象:"+test01);
        applicationContext.close();
    }

    @Test
    public void testC3p0() throws Exception{
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("com/tom/spring/test/c3p0ApplicationContext.xml");
        DataSource dataSource = applicationContext.getBean("dataSource", DataSource.class);
        System.out.println(dataSource);
        System.out.println("--------");
        System.out.println(dataSource.getConnection());
    }
}
