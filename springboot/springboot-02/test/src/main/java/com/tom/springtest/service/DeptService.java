package com.tom.springtest.service;

import com.tom.springtest.entity.Dept;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ClassName: DeptService
 * Description:
 *
 * @date 2019/11/1 19:34
 * @author: Mi_dad
 */
public interface DeptService {

    /**
     * 查询全部
     * @return
     */
    List<Dept> list();

    /**
     * 添加
     * @param dept
     * @return
     */
    Integer save(@Param("dept") Dept dept);
}
