package com.tom.test.controller;

import com.tom.test.entity.Student;
import com.tom.test.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

/**
 * ClassName: StudentHandler
 * Description:
 *
 * @date 2019/10/31 14:46
 * @author: Mi_dad
 */
@Controller
public class StudentHandler {

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public String findAll(Model model){
        Collection<Student> stuList = studentService.findAll();
        model.addAttribute("stuList",stuList);
        return "list";
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String add(Student student,Model model){
        System.out.println(student);
        Integer result = studentService.add(student);
        if (result==1){
            model.addAttribute("msg","添加成功！");
            System.out.println("添加成功："+result);
            return "result";
        }else{
            model.addAttribute("msg","添加失败!");
            System.out.println("添加失败："+result);
            return "result";
        }
    }
}
