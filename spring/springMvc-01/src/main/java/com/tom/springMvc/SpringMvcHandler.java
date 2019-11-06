package com.tom.springMvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.beans.PropertyEditorSupport;

/**
 * ClassName: SpringMvcHandler
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/7 16:20
 */
@Controller
public class SpringMvcHandler {

    @RequestMapping(value = "/hello")
    public String handlerHello(){
        System.out.println("进入com.tom.springMvc.SpringMvcHandler");
        return "success";
    }
    @RequestMapping(value = "/pathVariable/{username}/{password}")
    public String pathVariable(@PathVariable("username")String username,
                               @PathVariable("password")String password){
        System.out.println("username:"+username);
        System.out.println("password:"+password);
        return "success";
    }

    /**
     * 查询
     * @return
     */
    @RequestMapping(value = "/order/{id}",method = RequestMethod.GET)
    public String restGet(@PathVariable("id")String id){
        System.out.println("查询:"+id);
        return "success";
    }

    /**
     * 删除
     * @return
     */
    @RequestMapping(value = "/order/{id}",method = RequestMethod.DELETE)
    public String restDelete(@PathVariable("id")String id){
        System.out.println("删除:"+id);
        return "success";
    }

    /**
     * 添加
     * @return
     */
    @RequestMapping(value = "/order",method = RequestMethod.POST)
    public String restInsert(){
        System.out.println("添加:");
        return "success";
    }

    /**
     * 更新
     * @return
     */
    @RequestMapping(value = "/order",method = RequestMethod.PUT)
    public String restUpdate(){
        System.out.println("更新:");
        return "success";
    }

    @RequestMapping(value = "/requestParam")
    public String requestParam(@RequestParam("username")String username,@RequestParam("password")String password){
        System.out.println("username:"+username+",password:"+password);
        return "success";
    }
}
