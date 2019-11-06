package com.tom.springtest.controller;

import com.tom.springtest.entity.Dept;
import com.tom.springtest.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ClassName: DeptHandler
 * Description:
 *
 * @date 2019/11/1 19:35
 * @author: Mi_dad
 */
@RestController
public class DeptHandler {

    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<Dept> list(){
        return deptService.list();
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public Integer save(Dept dept){
        return deptService.save(dept);
    }

}
