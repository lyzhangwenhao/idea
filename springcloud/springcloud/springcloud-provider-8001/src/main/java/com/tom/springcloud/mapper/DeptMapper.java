package com.tom.springcloud.mapper;

import com.tom.springcloud.entities.Dept;

import java.util.List;

/**
 * ClassName: DeptMapper
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/18 0:16
 */
public interface DeptMapper {
    /**
     * 查询所有部门
     * @return
     */
    List<Dept> findAllDept();
}
