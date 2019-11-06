package com.tom.test.mapper;

import com.tom.test.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ClassName: StudentMapper
 * Description:
 *
 * @date 2019/10/31 14:44
 * @author: Mi_dad
 */
@Mapper
public interface StudentMapper {
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
