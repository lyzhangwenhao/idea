package com.tom.ssm.mapper;

import com.tom.ssm.entity.User;

import java.util.List;

/**
 * ClassName: UserMapper
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/10 21:50
 */
public interface UserMapper {
    /**
     * 查询所有的用户信息
     * @return
     */
    List<User> findAllUser();
}
