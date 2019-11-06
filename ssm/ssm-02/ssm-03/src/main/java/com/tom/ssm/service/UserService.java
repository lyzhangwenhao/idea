package com.tom.ssm.service;

import com.tom.ssm.entity.User;

import java.util.List;

/**
 * ClassName: UserService
 * Description:
 *
 * @date 2019/10/30 21:30
 * @author: Mi_dad
 */
public interface UserService {
    /**
     * 查询所有user
     * @return
     */
    List<User> findAllUser();
}
