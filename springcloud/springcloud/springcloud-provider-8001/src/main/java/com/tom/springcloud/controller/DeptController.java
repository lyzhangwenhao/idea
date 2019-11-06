package com.tom.springcloud.controller;

import com.tom.springcloud.entities.Dept;
import com.tom.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ClassName: DeptController
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/18 0:24
 */
@RestController
public class DeptController {

   @Autowired
    private DeptService deptService;

    @RequestMapping(value = "/dept/all")
    public List<Dept> findAllDept(){
        return deptService.findAllDept();
    }
}
