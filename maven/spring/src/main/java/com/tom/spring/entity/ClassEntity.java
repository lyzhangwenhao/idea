package com.tom.spring.entity;

import java.util.List;

/**
 * ClassName: ClassEntity
 * Description:
 *
 * @date 2019/9/29 20:36
 * @author: Mi_dad
 */
public class ClassEntity {
    private Integer classId;
    private String name;
    private Integer count;
    private List<StudentEntity> studentEntity;

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<StudentEntity> getStudentEntity() {
        return studentEntity;
    }

    public void setStudentEntity(List<StudentEntity> studentEntity) {
        this.studentEntity = studentEntity;
    }

    @Override
    public String toString() {
        return "ClassEntity{" +
                "classId=" + classId +
                ", name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}
