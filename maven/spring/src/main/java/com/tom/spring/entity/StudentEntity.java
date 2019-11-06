package com.tom.spring.entity;

/**
 * ClassName: StudentEntity
 * Description:
 *
 * @date 2019/9/29 20:32
 * @author: Mi_dad
 */
public class StudentEntity {

    private Integer studentId;
    private String name;
    private Integer classId;

    public StudentEntity() {
    }

    public StudentEntity(Integer studentId, String name, Integer classId) {
        this.studentId = studentId;
        this.name = name;
        this.classId = classId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", classId=" + classId +
                '}';
    }
}
