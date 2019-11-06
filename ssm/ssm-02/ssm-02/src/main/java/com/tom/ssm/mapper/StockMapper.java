package com.tom.ssm.mapper;

import com.tom.ssm.entity.BookEntity;
import com.tom.ssm.entity.StockEntity;
import org.apache.ibatis.annotations.Param;

/**
 * ClassName: StockMapper
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/11 18:54
 */
public interface StockMapper {
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
    int addStock(@Param("bookEntity") BookEntity bookEntity);

    /**
     * 通过BookId删除库存信息
     * @param bookId
     * @return
     */
    int delStockByBookId(Integer bookId);
}
