package com.ccz.sell.entity;

import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author: zjj
 * @desc
 * @date 2019/10/16 11:50
 */
@Entity
@DynamicUpdate
@Data
public class ProductCategory {

    @Id
    @GeneratedValue
    private Integer categoryId;

    private String categoryName;    //类目名字

    private Integer categoryType;    //类目编号

    private Date createTime;

    private Date updateTime;
}
