package com.tom.cloud.service.impl;

import com.tom.cloud.entities.User;
import com.tom.cloud.mapper.UserMapper;
import com.tom.cloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: UserServiceImpl
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/18 20:05
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 查询全部的user
     *
     * @return
     */
    @Override
    public List<User> findAllUser() {
        return userMapper.findAllUser();
    }
}
