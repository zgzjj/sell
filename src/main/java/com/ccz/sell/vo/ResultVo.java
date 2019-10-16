package com.ccz.sell.vo;

import lombok.Data;

/**
 * @author: zjj
 * @desc
 * @date 2019/10/16 17:12
 */
@Data
public class ResultVo<T> {

    private Integer code;

    private String message;

    private T data;
}
