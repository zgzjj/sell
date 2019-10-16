package com.ccz.sell.service;

import com.ccz.sell.entity.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author: zjj
 * @desc
 * @date 2019/10/16 16:56
 */
public interface ProductInfoService {

    ProductInfo findOne(String productId);

    //查询现在所有在架商品列表
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);
}
