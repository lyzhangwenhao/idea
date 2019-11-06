package com.tom.ssm.controller;

import com.tom.ssm.entity.User;
import com.tom.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ClassName: UserHandler
 * Description:
 *
 * @date 2019/10/30 23:01
 * @author: Mi_dad
 */
@RestController
public class UserHandler {

    @Autowired
    UserService userService;
    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public void findAllUser(){
        List<User> allUser = userService.findAllUser();
        for (User user:allUser){
            System.out.println(user);
        }
    }
}
