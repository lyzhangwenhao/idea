package com.tom.ssm.controller.user;

import com.tom.ssm.entity.UserEntity;
import com.tom.ssm.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * ClassName: UserHandler
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/10 21:39
 */
@Controller
@RequestMapping(value = "/user")
public class UserHandler {
    @Autowired
    private UserService userService;



    /**
     * 查询所有用户信息
     * @param model
     * @return
     */
    @RequestMapping(value = "/findAllUser")
    public String findAllUser(Model model){
        List<UserEntity> userList = userService.findAllUser();
        model.addAttribute("userList",userList);
        return "success";
    }
}
