package com.tom.ssm.mapper.admin;

import com.tom.ssm.entity.BookEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ClassName: BookMapper
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/11 18:53
 */
public interface BookMapper {

    /**
     * 查询所有的图书
     * @return
     */
    List<BookEntity> findAllBook();

    /**
     * 添加图书
     * @param bookEntity
     * @return 返回int
     */
    int addBook(@Param("bookEntity") BookEntity bookEntity);

    /**
     * 通过BookId删除Book
     * @param bookId
     * @return
     */
    int delBookByBookId(Integer bookId);




}
