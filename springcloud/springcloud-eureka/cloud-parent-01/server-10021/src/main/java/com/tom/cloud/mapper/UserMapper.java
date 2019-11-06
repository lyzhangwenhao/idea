package com.tom.cloud.mapper;

import com.tom.cloud.entities.User;

import java.util.List;

/**
 * ClassName: UserMapper
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/18 18:48
 */
public interface UserMapper {
    /**
     * 查询全部的user
     * @return
     */
    List<User> findAllUser();
}
