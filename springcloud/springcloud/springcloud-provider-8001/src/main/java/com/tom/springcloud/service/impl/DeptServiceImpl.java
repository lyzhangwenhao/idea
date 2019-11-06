package com.tom.springcloud.service.impl;

import com.tom.springcloud.entities.Dept;
import com.tom.springcloud.mapper.DeptMapper;
import com.tom.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: DeptServiceImpl
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/18 0:19
 */
@Service
public class DeptServiceImpl implements DeptService {
    /**
     * 查询所有部门
     *
     * @return
     */
    @Override
    public List<Dept> findAllDept() {
        return null;
    }
    /*@Autowired
    private DeptMapper deptMapper;
    *//**
     * 查询所有部门
     *
     * @return
     *//*
    @Override
    public List<Dept> findAllDept() {
        return deptMapper.findAllDept();
    }*/
}
