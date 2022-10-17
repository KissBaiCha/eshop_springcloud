package com.chixing.controller;

import com.alibaba.fastjson2.JSON;
import com.chixing.entity.Product;
import com.chixing.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Xu Zhang
 * @version 1.0
 * @date 2022/10/14 19:21
 */
@RestController
public class ProductController {
    private IProductService productService;
    @Autowired
    public void setProductService(IProductService productService) {
        this.productService = productService;
    }
    @GetMapping("product/{proId}")
    public String getById(@PathVariable Integer proId){
        Product product = productService.getById(proId);
        return JSON.toJSONString(product);
    }
    @GetMapping("product")
    public String getByList(){
        return JSON.toJSONString(productService.getByList());
    }
}
