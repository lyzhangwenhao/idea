package com.tom.springcloud.controller;

import com.tom.springcloud.entity.Dept;
import com.tom.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;

/**
 * ClassName: DeptController
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/17 20:02
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    /**
     * 查询全部部门
     * @return
     */
    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public List<Dept> findAllDept(){
        return deptService.findAllDept();
    }

    /**
     * 通过部门Id插叙部门信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/getById/{id}")
    public Dept getDeptById(@PathVariable("id") BigInteger id){
        return deptService.getDeptById(id);
    }
}
