package com.tom.test.service;

import com.tom.test.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ClassName: StudentService
 * Description:
 *
 * @date 2019/10/31 14:44
 * @author: Mi_dad
 */
public interface StudentService {
    /**
     * 查询所有学生信息
     * @return
     */
    List<Student> findAll();

    /**
     * 添加学生信息
     * @param student
     */
    Integer add(@Param("stu") Student student);
}
