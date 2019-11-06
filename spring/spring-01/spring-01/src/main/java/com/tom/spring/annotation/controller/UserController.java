package com.tom.spring.annotation.controller;

import com.tom.spring.annotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * ClassName: UserController
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/5 19:07
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public void register(){
        System.out.println("-----进入Controller层");
        userService.addUser();
    }
}
