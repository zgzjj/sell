package com.ccz.sell.enums;

import lombok.Getter;

/**
 * @author: zjj
 * @desc
 * @date 2019/10/16 17:02
 */
@Getter
public enum ProductStatusEnum {

    UP(0,"在架"),
    DOWN(1,"下架")
    ;
    private Integer code;

    private String message;


    ProductStatusEnum(Integer code,String message){
        this.code = code;
        this.message = message;
    }

}
