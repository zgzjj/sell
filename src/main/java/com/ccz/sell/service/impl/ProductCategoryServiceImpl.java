package com.ccz.sell.service.impl;

import com.ccz.sell.dao.ProductCategoryRepository;
import com.ccz.sell.entity.ProductCategory;
import com.ccz.sell.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: zjj
 * @desc
 * @date 2019/10/16 16:17
 */
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    private ProductCategoryRepository categoryRepository;

    @Override
    public ProductCategory findOne(Integer categoryId) {
        return categoryRepository.getOne(categoryId);
    }

    @Override
    public List<ProductCategory> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return categoryRepository.findByCategoryTypeIn(categoryTypeList);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return categoryRepository.save(productCategory);
    }
}
