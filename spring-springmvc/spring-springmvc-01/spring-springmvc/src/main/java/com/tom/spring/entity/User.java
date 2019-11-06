package com.tom.spring.entity;

import org.springframework.stereotype.Component;

/**
 * ClassName: User
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/10 19:22
 */
@Component
public class User {
    private int userId;
    private String username;
    private String password;

    public User() {
        System.out.println("User ========>");
    }

    public User(int userId, String username, String password) {
        this.userId = userId;
        this.username = username;
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
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

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
