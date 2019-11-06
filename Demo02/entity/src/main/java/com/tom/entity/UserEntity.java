package com.tom.entity;

import java.io.Serializable;

/**
 * ClassName: UserEntity
 * Description:
 *
 * @author Mi_dad
 * @date 2019/9/26 14:06
 */
public class UserEntity implements Serializable {
    private Integer id;
    private String username;
    private  String password;

    @Override
    public String toString() {
        return "UserBean{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

}
