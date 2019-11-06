package com.tom.ssm.service.admin;

import com.tom.ssm.entity.BookEntity;
import com.tom.ssm.entity.UserEntity;

/**
 * ClassName: AdminService
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/11 22:43
 */
public interface AdminService {
    /**
     * 用户登录
     * @param userEntity
     * @return
     */
    UserEntity getUserEntityByUsernameAndPassword(UserEntity userEntity);

    /**
     * 管理员添加图书
     * @param bookEntity
     * @return
     */
    boolean addBook(BookEntity bookEntity);

    /**
     * 通过bookId删除图书相关信息
     * @param bookId
     * @return
     */
    boolean delBook(Integer bookId);
}
