package com.tom.springtest.service.impl;

import com.tom.springtest.entity.Dept;
import com.tom.springtest.mapper.DeptMapper;
import com.tom.springtest.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: DeptServiceImpl
 * Description:
 *
 * @date 2019/11/1 19:35
 * @author: Mi_dad
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    /**
     * 查询全部
     *
     * @return
     */
    @Override
    public List<Dept> list() {
        return deptMapper.list();
    }

    /**
     * 添加
     *
     * @param dept
     * @return
     */
    @Override
    public Integer save(Dept dept) {
        return deptMapper.save(dept);
    }
}
