package com.tom.ssm.service.admin.impl;

import com.tom.ssm.entity.BookEntity;
import com.tom.ssm.entity.UserEntity;
import com.tom.ssm.exception.BookException;
import com.tom.ssm.exception.StockException;
import com.tom.ssm.mapper.admin.AdminMapper;
import com.tom.ssm.service.StockService;
import com.tom.ssm.service.admin.AdminService;
import com.tom.ssm.service.admin.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * ClassName: AdminServiceImpl
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/11 22:43
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;
    @Autowired
    private BookService bookService;
    @Autowired
    private StockService stockService;


    /**
     * 用户登录，根据获取的UserEntity对象返回响应的UserEntity类型数据，判断是否能够登录
     *
     * @param userEntity
     * @return
     */
    @Override
    public UserEntity getUserEntityByUsernameAndPassword(UserEntity userEntity) {
        UserEntity user = adminMapper.getUserEntityByUsernameAndPassword(userEntity);
        return user;
    }

    /**
     * 管理员添加图书
     *
     * @param bookEntity
     * @return
     */
    @Override
    @Transactional(rollbackFor = {Exception.class})
    public boolean addBook(BookEntity bookEntity) {
        int bookResult = bookService.addBook(bookEntity);
        System.out.println("AddminServiceImpl ====> bookResult:"+bookResult);
        if (bookResult!=1){
            throw new BookException("Book插入失败！");
        }
        int stockResult = stockService.addStock(bookEntity);
        System.out.println("AddminServiceImpl ====> stockResult:"+stockResult);
        if(stockResult!=1){
            throw new StockException("Stock插入失败！");
        }
        return true;
    }

    /**
     * 通过bookId删除图书相关信息
     *
     * @param bookId
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean delBook(Integer bookId) {
        int bookResult = bookService.delBookByBookId(bookId);
        if(bookResult!=1){
            throw new BookException("Book表数据删除错误......");
        }
        int stockResult = stockService.delStockByBookId(bookId);
        if(stockResult!=1){
            throw new StockException("Stock表数据删除失败......");
        }
        return true;
    }
}
