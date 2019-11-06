package com.tom.test.service.impl;

import com.tom.test.entity.Student;
import com.tom.test.mapper.StudentMapper;
import com.tom.test.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: StudentServiceImpl
 * Description:
 *
 * @date 2019/10/31 14:45
 * @author: Mi_dad
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;
    /**
     * 查询所有学生信息
     *
     * @return
     */
    @Override
    public List<Student> findAll() {
        return studentMapper.findAll();
    }

    /**
     * 添加学生信息
     *
     * @param student
     */
    @Override
    public Integer add(Student student) {
        return studentMapper.add(student);
    }
}
