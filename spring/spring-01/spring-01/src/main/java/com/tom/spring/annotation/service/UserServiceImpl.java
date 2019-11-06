package com.tom.spring.annotation.service;

import com.tom.spring.annotation.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: UserServiceImp
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/5 19:07
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void addUser() {
        //处理业务
        System.out.println("-----进入Service层");
        userDao.addUser();
    }
}
