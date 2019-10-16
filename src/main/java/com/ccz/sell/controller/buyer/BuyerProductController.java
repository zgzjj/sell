package com.ccz.sell.controller.buyer;

import com.ccz.sell.entity.ProductInfo;
import com.ccz.sell.service.ProductCategoryService;
import com.ccz.sell.service.ProductInfoService;
import com.ccz.sell.vo.ProductInfoVo;
import com.ccz.sell.vo.ProductVo;
import com.ccz.sell.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: zjj
 * @desc
 * @date 2019/10/16 18:07
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @Autowired
    private ProductInfoService productInfoService;

    @Autowired
    private ProductCategoryService productCategoryService;

    @RequestMapping("/list")
    public ResultVo list(){
        //查询所有的上架商品
        List<ProductInfo> productInfoList = productInfoService.findUpAll();
        //查询类目（一次性查询）
        List<Integer> categoryTypeList = new ArrayList<>();

        //数据拼装
        ResultVo resultVo = new ResultVo();
        ProductVo productVo = new ProductVo();
        ProductInfoVo productInfoVo = new ProductInfoVo();
        productVo.setProductInfoVoList(Arrays.asList(productInfoVo));
        resultVo.setCode(0);
        resultVo.setMessage("成功");

        resultVo.setData(Arrays.asList(productVo));
        return resultVo;
    }
}
