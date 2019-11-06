package com.tom.entity;

/**
 * ClassName: UserInfoEntity
 * Description:
 *
 * @author Mi_dad
 * @date 2019/9/26 20:07
 */
public class UserInfoEntity {
    private Integer id;
    private String username;
    private String password;
    private String birthday;

    private ClassEntity classEntity;

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getBirthday() {
        return birthday;
    }

    public ClassEntity getClassEntity() {
        return classEntity;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }


    public void setClassEntity(ClassEntity classEntity) {
        this.classEntity = classEntity;
    }

    @Override
    public String toString() {
        return "UserInfoEntity{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
