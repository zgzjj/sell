package com.ccz.sell.service;

import com.ccz.sell.entity.ProductCategory;

import java.util.List;

/**
 * @author: zjj
 * @desc
 * @date 2019/10/16 16:14
 */
public interface ProductCategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
