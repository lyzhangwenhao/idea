package com.tom.springcloud.service;

import com.tom.springcloud.entity.Dept;

import java.math.BigInteger;
import java.util.List;

/**
 * ClassName: DeptService
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/17 20:00
 */
public interface DeptService {
    /**
     * 查询全部部门信息
     * @return
     */
    List<Dept> findAllDept();

    /**
     * 通过id查询部门信息
     * @param id
     * @return
     */
    Dept getDeptById(BigInteger id);
}
