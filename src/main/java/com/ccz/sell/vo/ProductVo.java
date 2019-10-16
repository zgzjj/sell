package com.ccz.sell.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author: zjj
 * @desc
 * @date 2019/10/16 17:17
 */
@Data
public class ProductVo {

    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

}
