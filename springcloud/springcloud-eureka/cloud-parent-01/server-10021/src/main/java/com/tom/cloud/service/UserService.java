package com.tom.cloud.service;

import com.tom.cloud.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: UserService
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/18 20:05
 */
public interface UserService {
    /**
     * 查询全部的user
     * @return
     */
    List<User> findAllUser();
}
