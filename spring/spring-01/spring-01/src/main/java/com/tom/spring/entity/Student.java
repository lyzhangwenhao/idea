package com.tom.spring.entity;

/**
 * ClassName: student
 * Description:
 *
 * @author Mi_dad
 * @date 2019/9/28 21:46
 */
public class Student {
    /**
     * id:  数据库中数据的Id
     * number:  学号
     * name:    姓名
     * major:   专业
     * classId:   班级Id
     * */
    private Integer id;
    private Integer number;
    private String name;
    private String major;

    private Computer computer;
    public Student() {
    }

    public Student(Integer id, Integer number, String name, String major) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.major = major;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", number=" + number +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}
