package com.tom.ssm.entity;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * ClassName: StockEntity
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/11 16:10
 */
@Component
@Order(1)
public class StockEntity {
    private Integer stockId;
    private Integer bookId;
    private Integer bookStock;

    public StockEntity() {
    }

    public StockEntity(Integer stockId, Integer bookId, Integer bookStock) {
        this.stockId = stockId;
        this.bookId = bookId;
        this.bookStock = bookStock;
    }

    public Integer getStockId() {
        return stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getBookStock() {
        return bookStock;
    }

    public void setBookStock(Integer bookStock) {
        this.bookStock = bookStock;
    }

    @Override
    public String toString() {
        return "StockEntity{" +
                "stockId=" + stockId +
                ", bookId=" + bookId +
                ", bookStock=" + bookStock +
                '}';
    }
}
