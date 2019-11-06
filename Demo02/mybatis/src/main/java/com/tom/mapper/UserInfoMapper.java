package com.tom.mapper;

import com.tom.entity.UserInfoEntity;

import java.util.List;

/**
 * ClassName: UserInfoMapper
 * Description:
 *
 * @author Mi_dad
 * @date 2019/9/26 21:51
 */
public interface UserInfoMapper {
    /**
     * 级联方式查询userInfo的所有数据,通过两张表
     *
     * @return 返回一个UserInfoEntity类型的list集合
     * */
    List<UserInfoEntity> findUserInfoByCascade();
    /**
     * association方式查询userInfo的所有数据,通过两张表
     *
     * @return 返回一个UserInfoEntity类型的list集合
     * */
    List<UserInfoEntity> findUserInfoByAssociation();

    /**
     * 分步查询UserInfo
     *
     * @return 返回一个UserInfoEntity类型的list集合
     * */
    List<UserInfoEntity> findUserInfoStep();
    /**
     * 通过id值查询UserInfo信息
     *
     * @param id 传入的查询的id
     * @return 返回一个UserInfoEntity
     * */
    UserInfoEntity getUserInfoById(Integer id);
}
