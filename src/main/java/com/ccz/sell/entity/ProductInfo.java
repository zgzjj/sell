package com.ccz.sell.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author: zjj
 * @desc
 * @date 2019/10/16 16:40
 */
@Entity
@DynamicUpdate
@Data
public class ProductInfo {

    @Id
    private String productId;

    private String productName;

    private BigDecimal productPrice;

    private Integer productStock;

    private String productDescription;

    private String productIcon;

    private String productStatus;

    private Integer categoryType;

    private Date createTime;

    private Date updateTime;
}
