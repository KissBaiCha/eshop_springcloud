package com.chixing.controller;

import com.chixing.service.IMyorderService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author Xu Zhang
 * @version 1.0
 * @date 2022/10/14 20:33
 */
@RestController
@Slf4j
public class OrderController {

    private final IMyorderService myOrderService;
    @Autowired
    public OrderController(IMyorderService myOrderService) {
        this.myOrderService = myOrderService;
    }

    @PostMapping("order")
    public String save(){
        if(myOrderService.save(1,1)) {
            return "添加订单成功";
        }
        return "添加订单失败";
    }
    @GetMapping("order/{orderId}")
    public String getById(@PathVariable("orderId") Integer orderId){
        String orderVo = myOrderService.getById(orderId);
        if(orderVo != null){
            return orderVo;
        }
        return "查询失败";
    }
}
