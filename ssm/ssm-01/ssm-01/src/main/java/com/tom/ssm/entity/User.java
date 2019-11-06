package com.tom.ssm.entity;

import org.springframework.stereotype.Component;

/**
 * ClassName: User
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/10 21:36
 */
@Component
public class User {
    private Integer userId;
    private String username;
    private String password;

    private Integer status;

    public User() {
        System.out.println("User创建 ========>");
    }

    public User(Integer userId, String username, String password, Integer status) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.status = status;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                '}';
    }
}
