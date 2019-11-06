package com.tom.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;

/**
 * ClassName: HelloHandler
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/8 9:53
 */
@Controller
public class HelloHandler {

    @RequestMapping(value = "/hello")
    public String helloTest(){
        System.out.println("hello");
        return "success";
    }

    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){
        //创建ModelAndView对象
        ModelAndView modelAndView = new ModelAndView();
        //添加模型数据
        modelAndView.addObject("username","testModelAndView");
        modelAndView.addObject("password","testModelAndView");
        //设置视图信息
        modelAndView.setViewName("success");

        //测试代码
        System.out.println("getViewName:"+modelAndView.getViewName());
        System.out.println(modelAndView.getView());
        System.out.println(modelAndView.getModelMap());

        return modelAndView;
    }

    @RequestMapping("/testMap")
    public String testMap(Map<String,Object> map){
        map.put("username","testMap");
        map.put("password","testMap");
        return "success";
    }

    @RequestMapping("/testModel")
    public String testModel(Model model){
        model.addAttribute("username","testModel");
        model.addAttribute("password","testModel");

        System.out.println(model.getClass().getName());
        Map<String, Object> stringObjectMap = model.asMap();
        System.out.println(stringObjectMap);
        return "success";
    }

    @RequestMapping(value = "/testRedirect")
    public String testRedirect(){
        return "redirect:index.jsp";
    }
}
