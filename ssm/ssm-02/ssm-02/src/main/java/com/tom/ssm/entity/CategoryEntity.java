package com.tom.ssm.entity;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * ClassName: CategoryEntity
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/11 16:09
 */
@Component
@Order(1)
public class CategoryEntity {
    private Integer categoryId;

    private String categoryName;

    public CategoryEntity() {
    }

    public CategoryEntity(Integer categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "CategoryEntity{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }
}
