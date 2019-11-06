package com.tom.ssm.mapper.admin;

import com.tom.ssm.entity.CategoryEntity;

import java.util.List;

/**
 * ClassName: CategoryMapper
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/12 14:42
 */
public interface CategoryMapper {
    /**
     * 根据书的Id查询种类
     * @param id
     * @return
     */
    CategoryEntity getCategoryByBookId(Integer id);

    /**
     * 查询所有的种类
     * @return
     */
    List<CategoryEntity> findAllCategory();
}
