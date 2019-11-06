package com.tom.ssm.service;

import com.tom.ssm.entity.BookEntity;
import com.tom.ssm.entity.StockEntity;

/**
 * ClassName: StockService
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/12 14:33
 */
public interface StockService {
    /**
     * 根据书的Id查库存
     * @param id
     * @return
     */
    StockEntity getStockByBookId(Integer id);

    /**
     * 插入库存
     * @param bookEntity
     * @return
     */
    int addStock(BookEntity bookEntity);

    /**
     * 通过BookId删除库存信息
     * @param bookId
     * @return
     */
    int delStockByBookId(Integer bookId);
}
