package com.tom.mapper;

import com.tom.bean.UserBean;

import java.util.List;

/**
 * ClassName: UserMapper
 * Description:
 *
 * @date 2019/9/25 10:36
 * @author: Mi_dad
 */
public interface UserMapper {
    /**
     * 通过传入的用户名和密码进行验证、
     *
     * @param username 参数1用户名
     * @param password 参数2密码
     * @return UserBean返回值为UserBean
     *
     * */
    UserBean getUserByUsernameAndPassword(String username, String password);
    /**
     * 通过传入的用户名和密码进行验证、
     *
     * @return List<UserBean>返回UserBean的list集合
     *
     * */
    List<UserBean> findAdd();
}
