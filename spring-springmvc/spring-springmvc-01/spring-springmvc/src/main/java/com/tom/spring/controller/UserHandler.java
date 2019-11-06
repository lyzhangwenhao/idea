package com.tom.spring.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import com.tom.spring.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;

/**
 * ClassName: UserHandler
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/10 19:33
 */
@Controller
public class UserHandler {

    @RequestMapping("/userTest")
    public String userTest(HttpSession session){
        ServletContext servletContext = session.getServletContext();
        ApplicationContext attribute = (ApplicationContext)servletContext.getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
        User user = attribute.getBean("user", User.class);
        System.out.println(user);
        return "success";
    }
}
