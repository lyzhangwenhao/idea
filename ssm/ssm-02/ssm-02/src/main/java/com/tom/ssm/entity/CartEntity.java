package com.tom.ssm.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * ClassName: CartEntity
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/11 16:11
 */
@Component
public class CartEntity {
    private Integer cartId;
    private Integer userId;
    @Autowired
    private BookEntity bookEntity;
    private Integer bookCount;

    public CartEntity() {
    }

    public CartEntity(Integer cartId, Integer userId, BookEntity bookEntity, Integer bookCount) {
        this.cartId = cartId;
        this.userId = userId;
        this.bookEntity = bookEntity;
        this.bookCount = bookCount;
    }

    @Override
    public String toString() {
        return "CartEntity{" +
                "cartId=" + cartId +
                ", userId=" + userId +
                ", bookEntity=" + bookEntity +
                ", bookCount=" + bookCount +
                '}';
    }

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public BookEntity getBookEntity() {
        return bookEntity;
    }

    public void setBookEntity(BookEntity bookEntity) {
        this.bookEntity = bookEntity;
    }

    public Integer getBookCount() {
        return bookCount;
    }

    public void setBookCount(Integer bookCount) {
        this.bookCount = bookCount;
    }
}
