package com.ccz.sell.dao;

import com.ccz.sell.entity.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author: zjj
 * @desc
 * @date 2019/10/16 14:20
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {

    List<ProductInfo> findByProductStatus(Integer productStatus);
}
