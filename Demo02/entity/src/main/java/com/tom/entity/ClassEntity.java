package com.tom.entity;

import java.util.List;

/**
 * ClassName: ClassEntity
 * Description:
 *
 * @author Mi_dad
 * @date 2019/9/26 20:18
 */
public class ClassEntity {
    private Integer id;
    private String className;
    private Integer classNumber;

    private List<UserInfoEntity> userInfoEntityList;

    public List<UserInfoEntity> getUserInfoEntityList() {
        return userInfoEntityList;
    }

    public void setUserInfoEntityList(List<UserInfoEntity> userInfoEntityList) {
        this.userInfoEntityList = userInfoEntityList;
    }

    public Integer getId() {
        return id;
    }

    public String getClassName() {
        return className;
    }

    public Integer getClassNumber() {
        return classNumber;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setClassNumber(Integer classNumber) {
        this.classNumber = classNumber;
    }

    @Override
    public String toString() {
        return "ClassEntity{" +
                "id=" + id +
                ", className='" + className + '\'' +
                ", classNumber=" + classNumber +
                '}';
    }
}
