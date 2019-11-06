package com.tom.ssm.mapper.admin;

import com.tom.ssm.entity.UserEntity;

/**
 * ClassName: AdminMapper
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/11 22:46
 */
public interface AdminMapper {
    /**
     * 根据username和password查询UserEntity
     * @param userEntity 前台传入的UserEntity
     * @return
     */
    UserEntity getUserEntityByUsernameAndPassword(UserEntity userEntity);
}
