package com.chixing.vo;

import com.chixing.entity.Customer;
import com.chixing.entity.Myorder;
import com.chixing.entity.Product;
import lombok.Data;

/**
 * @author Xu Zhang
 * @version 1.0
 * @date 2022/10/17 9:26
 */
@Data
public class OrderDetailVO {
    private Myorder myorder;
    private Customer customer;
    private Product product;
    public OrderDetailVO(){}

    public OrderDetailVO(Myorder myorder, Customer customer, Product product) {
        this.myorder = myorder;
        this.customer = customer;
        this.product = product;
    }
}
