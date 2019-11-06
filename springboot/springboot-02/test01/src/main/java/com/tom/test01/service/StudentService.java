package com.tom.test01.service;

import com.tom.test01.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ClassName: StudentService
 * Description:
 *
 * @date 2019/11/1 15:16
 * @author: Mi_dad
 */
public interface StudentService {
    /**
     * 查询所有的Student信息
     * @return
     */
    List<Student> list();

    /**
     * 插入一条Student信息
     * @param student
     * @return
     */
    Integer insert(@Param("stu") Student student);
}
