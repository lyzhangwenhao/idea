package com.tom.spring.factory;

import com.tom.spring.entity.Computer;
import com.tom.spring.entity.Student;
import org.springframework.beans.factory.FactoryBean;

import java.util.List;

/**
 * ClassName: StudentFactory
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/4 22:39
 */
public class StudentFactory implements FactoryBean<Student> {

    @Override
    public Student getObject() throws Exception {
        Student stu = new Student(10, 1010, "王五", "土木工程");
        stu.setComputer(new Computer(1,"联想","黑色"));
        return stu;
    }

    @Override
    public Class<?> getObjectType() {
        return Student.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
