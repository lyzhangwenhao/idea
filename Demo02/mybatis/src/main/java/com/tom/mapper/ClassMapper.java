package com.tom.mapper;

import com.tom.entity.ClassEntity;

import java.util.List;

/**
 * ClassName: ClassMapper
 * Description:
 *
 * @author Mi_dad
 * @date 2019/9/26 22:02
 */
public interface ClassMapper {
    /**
     * 通过id值查询class
     *
     * @param id 传入的id条件
     * @return 返回查询到的一个ClassEntity对象
     * */
    ClassEntity getClassById(Integer id);

}
