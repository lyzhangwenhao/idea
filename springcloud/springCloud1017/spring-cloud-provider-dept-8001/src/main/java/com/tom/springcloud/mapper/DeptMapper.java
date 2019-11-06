package com.tom.springcloud.mapper;

import com.tom.springcloud.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.math.BigInteger;
import java.util.List;

/**
 * ClassName: DeptMapper
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/17 19:58
 */
//@Mapper
public interface DeptMapper {

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
