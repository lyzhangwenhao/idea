package com.tom.ssm.service;

import com.tom.ssm.entity.BookEntity;
import com.tom.ssm.entity.StockEntity;
import com.tom.ssm.mapper.StockMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: StockServiceImpl
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/12 14:33
 */
@Service
public class StockServiceImpl implements StockService {
    @Autowired
    private StockMapper stockMapper;
    /**
     * 根据书的Id查库存
     *
     * @param id
     * @return
     */
    @Override
    public StockEntity getStockByBookId(Integer id) {
        StockEntity stockEntity = stockMapper.getStockByBookId(id);
        return stockEntity;
    }

    /**
     * 插入库存
     *
     * @param bookEntity
     * @return
     */
    @Override
    public int addStock(BookEntity bookEntity) {
        int result = stockMapper.addStock(bookEntity);
        return result;
    }

    /**
     * 通过BookId删除库存信息
     *
     * @param bookId
     * @return
     */
    @Override
    public int delStockByBookId(Integer bookId) {
        int result = stockMapper.delStockByBookId(bookId);
        return result;
    }
}
