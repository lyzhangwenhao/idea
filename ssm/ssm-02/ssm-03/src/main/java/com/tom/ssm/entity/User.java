package com.tom.ssm.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * ClassName: User
 * Description:
 *
 * @date 2019/10/30 21:29
 * @author: Mi_dad
 */
@Component
public class User implements Serializable {

    private Integer userId;
    private String userName;
    private Integer userAge;

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userAge=" + userAge +
                '}';
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }
}
