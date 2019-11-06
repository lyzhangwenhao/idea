package com.tom.ssm.mapper.user;

import com.tom.ssm.entity.UserEntity;

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
    List<UserEntity> findAllUser();
}
