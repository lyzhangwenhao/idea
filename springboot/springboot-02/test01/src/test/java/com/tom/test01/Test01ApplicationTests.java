package com.tom.test01;

import com.tom.test01.entity.Student;
import com.tom.test01.mapper.TestTableMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tk.mybatis.mapper.entity.Example;

import java.util.HashMap;
import java.util.List;


class Test01ApplicationTests {

    @Autowired
    private TestTableMapper testTableMapper;
    @Test
    void selectAll() {
        List<Student> students = testTableMapper.selectAll();
        System.out.println(students);
    }

    @Test
    void select(){
        Student student = new Student();
        student.setStuId(2);
        List<Student> select = testTableMapper.select(student);
        System.out.println(select);
    }

    @Test
    void select02(){
        Student student = testTableMapper.selectByPrimaryKey(3);
        System.out.println(student);
    }
    @Test
    void select03(){
        Student student = new Student();
        student.setStuId(1);
        int i = testTableMapper.selectCount(student);
        System.out.println(i);
    }

    @Test
    void select04(){
        // 创建Example
        Example example = new Example(Student.class);
        // 创建Criteria
        Example.Criteria criteria = example.createCriteria();
        // 添加条件
//        criteria.andEqualTo("stuId", 0);
        criteria.andLike("stuName", "%张%");

        List<Student> list = testTableMapper.selectByExample(example);
        System.out.println(list);

    }
    @Test
    void string(){
        HashMap<String, String> map = new HashMap<>();
        String a = map.put("a", "123");
        String a1 = map.put("a", "234");
        System.out.println(a1);
    }
}
