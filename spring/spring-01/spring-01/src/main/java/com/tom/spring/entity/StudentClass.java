package com.tom.spring.entity;

import java.util.List;

/**
 * ClassName: StudentClass
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/4 21:57
 */
public class StudentClass {
    private Integer classId;
    private String className;
    private List<Student> studentList;

    public StudentClass() {
    }

    public StudentClass(Integer classId, String className, List<Student> studentList) {
        this.classId = classId;
        this.className = className;
        this.studentList = studentList;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "StudentClass{" +
                "classId=" + classId +
                ", className='" + className + '\'' +
                '}';
    }
}
