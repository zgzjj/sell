package com.ccz.sell.dao;

import com.ccz.sell.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author: zjj
 * @desc
 * @date 2019/10/16 14:20
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
