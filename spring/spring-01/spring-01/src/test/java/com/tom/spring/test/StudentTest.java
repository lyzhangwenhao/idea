package com.tom.spring.test;

import com.tom.spring.entity.Student;
import com.tom.spring.factory.StudentFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.security.krb5.internal.APOptions;

/**
 * ClassName: StudentTest
 * Description:
 *
 * @author Mi_dad
 * @date 2019/9/28 21:54
 */
public class StudentTest {
    @Test
    public void springTest(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("com/tom/spring/test/applicationContext.xml");
        /*方式一*/
        Student stu = (Student)applicationContext.getBean("student");
        System.out.println(stu);
        /*方式二*/
        Student stu2 = applicationContext.getBean("student", Student.class);
        System.out.println(stu2);
        /*方式三
        * 如果存在连个相同或者同一个父类的bean，则会报错：expected single matching bean but found 2
        * */
        Student bean = applicationContext.getBean(Student.class);
        System.out.println(bean);
    }

    @Test
    public void constructorTest(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("com/tom/spring/test/applicationContext.xml");
        Student stu = applicationContext.getBean("student02", Student.class);
        System.out.println(stu);
    }

    @Test
    public void xmlTest(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("com/tom/spring/test/applicationContext.xml");
        Student student04 = applicationContext.getBean("student03", Student.class);
        System.out.println(student04);
    }

    /*测试引用内部bean*/
    @Test
    public void beanTest(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("com/tom/spring/test/applicationContext.xml");
        Student student04 = applicationContext.getBean("student04", Student.class);
        System.out.println(student04);
        System.out.println(student04.getComputer());
    }
    /*测试使用内部bean*/
    @Test
    public void inBeanTest(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("com/tom/spring/test/applicationContext.xml");
        Student student05 = applicationContext.getBean("student05", Student.class);
        System.out.println(student05);
        System.out.println(student05.getComputer());
    }

    @Test
    public void factoryStudent(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("com/tom/spring/test/applicationContext.xml");
        Student factoryStudent = applicationContext.getBean("factoryStudent", Student.class);
        System.out.println(applicationContext);
        System.out.println(factoryStudent);
        System.out.println(factoryStudent.getComputer());
    }

}
