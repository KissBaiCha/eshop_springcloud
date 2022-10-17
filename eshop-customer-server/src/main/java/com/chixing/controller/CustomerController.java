package com.chixing.controller;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import com.chixing.entity.Customer;
import com.chixing.service.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Xu Zhang
 * @version 1.0
 * @date 2022/10/14 18:46
 */
@RestController
public class CustomerController {
    private CustomerServiceImpl customerService;
    @Autowired
    public void setCustomerService(CustomerServiceImpl customerService) {
        this.customerService = customerService;
    }
    @GetMapping("customer/{cusId}")
    public String getById(@PathVariable("cusId") Integer cusId){
        Customer customer = customerService.getById(cusId);
        return JSON.toJSONString(customer);
    }

}
