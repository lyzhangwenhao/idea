package com.tom.ssm.service.admin;

import com.tom.ssm.entity.BookEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: BookService
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/12 14:17
 */
@Service
public interface BookService {
    /**
     * 查询所有的图书
     * @return
     */
    List<BookEntity> findAllBook();

    /**
     * 插入图书
     * @param bookEntity
     * @return
     */
    int addBook(BookEntity bookEntity);

    /**
     * 通过BookId删除Book
     * @param bookId
     * @return
     */
    int delBookByBookId(Integer bookId);
}
