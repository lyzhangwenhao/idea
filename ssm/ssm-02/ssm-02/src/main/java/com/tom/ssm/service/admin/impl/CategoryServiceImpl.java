package com.tom.ssm.service.admin.impl;

import com.tom.ssm.entity.CategoryEntity;
import com.tom.ssm.mapper.admin.CategoryMapper;
import com.tom.ssm.service.admin.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: CategoryServiceImpl
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/12 14:44
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;
    /**
     * 根据书的Id查询种类
     *
     * @param id
     * @return
     */
    @Override
    public CategoryEntity getCategoryByBookId(Integer id) {
        CategoryEntity categoryEntity = categoryMapper.getCategoryByBookId(id);
        return categoryEntity;
    }

    /**
     * 查询所有的种类
     *
     * @return
     */
    @Override
    public List<CategoryEntity> findAllCategory() {
        List<CategoryEntity> categoryList = categoryMapper.findAllCategory();
        return categoryList;
    }
}
