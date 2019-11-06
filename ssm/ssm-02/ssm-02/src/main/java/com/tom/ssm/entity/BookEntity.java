package com.tom.ssm.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * ClassName: BookEntity
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/11 16:04
 */
@Component
//@DependsOn({"com.tom.ssm.entity.CategoryEntity","com.tom.ssm.entity.StockEntity"})
public class BookEntity {
    private Integer bookId;
    private String bookName;
    private Double bookPrice;
    private String bookDesc;

    @Autowired
    private CategoryEntity categoryEntity;
    @Autowired
    private StockEntity stockEntity;

    public BookEntity() {
    }

    public BookEntity(Integer bookId, String bookName, Double bookPrice, String bookDesc, CategoryEntity categoryEntity, StockEntity stockEntity) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.bookDesc = bookDesc;
        this.categoryEntity = categoryEntity;
        this.stockEntity = stockEntity;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookDesc() {
        return bookDesc;
    }

    public void setBookDesc(String bookDesc) {
        this.bookDesc = bookDesc;
    }

    public CategoryEntity getCategoryEntity() {
        return categoryEntity;
    }

    public void setCategoryEntity(CategoryEntity categoryEntity) {
        this.categoryEntity = categoryEntity;
    }

    public StockEntity getStockEntity() {
        return stockEntity;
    }

    public void setStockEntity(StockEntity stockEntity) {
        this.stockEntity = stockEntity;
    }

    @Override
    public String toString() {
        return "BookEntity{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookPrice=" + bookPrice +
                ", bookDesc='" + bookDesc + '\'' +
                ", categoryEntity=" + categoryEntity +
                ", stockEntity=" + stockEntity +
                '}';
    }
}
