package com.tom.cloud.controller;

import com.tom.cloud.entities.User;
import com.tom.cloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ClassName: UserController
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/18 20:08
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 查询全部的user
     * @return
     */
    @RequestMapping(value = "/user/all")
    public List<User> findAllUser(){
        return userService.findAllUser();
    }
}
