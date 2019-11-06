package com.tom.springcloud.service.impl;

import com.tom.springcloud.entity.Dept;
import com.tom.springcloud.mapper.DeptMapper;
import com.tom.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

/**
 * ClassName: DeptServiceImpl
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/17 20:01
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    /**
     * 查询全部部门信息
     *
     * @return
     */
    @Override
    public List<Dept> findAllDept() {
        return deptMapper.findAllDept();
    }

    /**
     * 通过id查询部门信息
     *
     * @param id
     * @return
     */
    @Override
    public Dept getDeptById(BigInteger id) {
        return deptMapper.getDeptById(id);
    }
}
