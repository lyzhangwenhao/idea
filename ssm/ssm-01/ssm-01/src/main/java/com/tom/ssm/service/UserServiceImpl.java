package com.tom.ssm.service;

import com.tom.ssm.entity.User;
import com.tom.ssm.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: UserServiceImpl
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/10 21:51
 */
@Service
public class UserServiceImpl implements UserService {

    public UserServiceImpl() {
        System.out.println("UserServiceImpl =====>");
    }

    @Autowired
    private UserMapper userMapper;
    /**
     * 查询所有的用户信息
     *
     * @return
     */
    @Override
    public List<User> findAllUser() {
        List<User> userList = userMapper.findAllUser();

        return userList;
    }
}
