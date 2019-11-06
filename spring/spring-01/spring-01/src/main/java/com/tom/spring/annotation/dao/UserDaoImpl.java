package com.tom.spring.annotation.dao;

import org.springframework.stereotype.Repository;

/**
 * ClassName: UserDaoImp
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/5 19:07
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void addUser() {
        System.out.println("-----进入Dao层");
        System.out.println("调用成功！");
    }
}
