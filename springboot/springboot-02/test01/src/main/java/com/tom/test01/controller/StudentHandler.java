package com.tom.test01.controller;

import com.tom.test01.entity.Student;
import com.tom.test01.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * ClassName: StudentHandler
 * Description:
 *
 * @date 2019/11/1 15:17
 * @author: Mi_dad
 */
@Controller
@RequestMapping(value = "/student")
public class StudentHandler {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String list(Model model){
        List<Student> list = studentService.list();
        model.addAttribute("stuList",list);
        System.out.println(list);
        return "list";
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String list(Student student){
        System.out.println(student);
        Integer result = studentService.insert(student);
        //可以通过result判断添加成功与否
        return "redirect:/student/list";
    }
}
