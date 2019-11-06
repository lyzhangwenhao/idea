package com.tom.ssm.mapper;

import com.tom.ssm.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ClassName: UserMapper
 * Description:
 *
 * @date 2019/10/30 21:32
 * @author: Mi_dad
 */
@Mapper
public interface UserMapper {
    /**
     * 查询所有user
     * @return
     */
    List<User> findAllUser();
}
