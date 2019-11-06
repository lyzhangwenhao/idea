package com.tom.ssm.service.impl;

import com.tom.ssm.entity.User;
import com.tom.ssm.mapper.UserMapper;
import com.tom.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: UserServiceImpl
 * Description:
 *
 * @date 2019/10/30 21:32
 * @author: Mi_dad
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    /**
     * 查询所有user
     *
     * @return
     */
    @Override
    public List<User> findAllUser() {
        return userMapper.findAllUser();
    }
}
