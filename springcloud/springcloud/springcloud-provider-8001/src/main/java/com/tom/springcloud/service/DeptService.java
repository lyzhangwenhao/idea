package com.tom.springcloud.service;

import com.tom.springcloud.entities.Dept;

import java.util.List;

/**
 * ClassName: DeptService
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/18 0:19
 */
public interface DeptService {
    /**
     * 查询所有部门
     * @return
     */
    List<Dept> findAllDept();
}
