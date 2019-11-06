package com.tom.mapper;

import com.tom.entity.UserEntity;
import com.tom.entity.UserInfoEntity;

import java.util.List;

/**
 * ClassName: UserMapper
 * Description:
 *
 * @author Mi_dad
 */
public interface UserMapper {
    /**
     * 用来查询全部的用户信息
     *
     * @return 返回全部user,并且封装到list中
     * */
    List<UserEntity> findAllUser();
    /**
     * 添加一个用户,返回一个int类型数据
     *
     * @param user 传入的参数
     * @return int类型的返回值，判断是否插入成功
     * */
    int addUser(UserEntity user);
    /**
     * 模糊查询
     * @param username 模糊查询的条件
     * @return 返回一个泛型为UserEntity的list集合
     * */
    List<UserEntity> findUserLike(String username);
    /**
     * 使用自定义映射将所有的user查询出来
     *
     * @return 返回一个list集合
     * */
    List<UserEntity> findUserByResultMap();
    /**
     * 使用自定义映射将所有的user查询出来
     *
     * @param userEntity1
     * @param userEntity2
     * @return 返回一个list集合
     * */
    void insertUser(UserEntity userEntity1,UserEntity userEntity2);

}
