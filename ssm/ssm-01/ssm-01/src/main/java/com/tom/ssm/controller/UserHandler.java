package com.tom.ssm.controller;

import com.tom.ssm.entity.User;
import com.tom.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * ClassName: UserHandler
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/10 21:39
 */
@Controller
public class UserHandler {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/userTest")
    public String userTest(HttpSession session){

        ServletContext sc = session.getServletContext();

        ApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(sc);
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);
        return "success";
    }

    @RequestMapping(value = "/findAllUser")
    public String findAllUser(Model model){
        List<User> userList = userService.findAllUser();
        model.addAttribute("userList",userList);
        return "success";
    }
}
