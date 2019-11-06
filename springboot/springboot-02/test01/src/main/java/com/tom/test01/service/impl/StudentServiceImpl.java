package com.tom.test01.service.impl;

import com.tom.test01.entity.Student;
import com.tom.test01.mapper.StudentMapper;
import com.tom.test01.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: StudentServiceImpl
 * Description:
 *
 * @date 2019/11/1 15:16
 * @author: Mi_dad
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    /**
     * 查询所有的Student信息
     *
     * @return
     */
    @Override
    public List<Student> list() {
        return studentMapper.list();
    }

    /**
     * 插入一条Student信息
     *
     * @param student
     * @return
     */
    @Override
    public Integer insert(Student student) {
        return studentMapper.insert(student);
    }
}
