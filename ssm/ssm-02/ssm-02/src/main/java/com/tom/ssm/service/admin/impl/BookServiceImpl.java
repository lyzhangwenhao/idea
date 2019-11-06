package com.tom.ssm.service.admin.impl;

import com.tom.ssm.entity.BookEntity;
import com.tom.ssm.mapper.admin.BookMapper;
import com.tom.ssm.service.admin.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: BookServiceImpl
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/12 14:17
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    /**
     * 查询所有的图书
     *
     * @return
     */
    @Override
    public List<BookEntity> findAllBook() {
        List<BookEntity> bookList = bookMapper.findAllBook();
        return bookList;
    }

    /**
     * 插入图书
     *
     * @param bookEntity
     * @return
     */
    @Override
    public int addBook(BookEntity bookEntity) {
        int result = bookMapper.addBook(bookEntity);
        return result;
    }

    /**
     * 通过BookId删除Book
     *
     * @param bookId
     * @return
     */
    @Override
    public int delBookByBookId(Integer bookId) {
        int result = bookMapper.delBookByBookId(bookId);
        return result;
    }
}
