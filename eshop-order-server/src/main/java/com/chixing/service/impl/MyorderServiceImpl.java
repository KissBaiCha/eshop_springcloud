package com.chixing.service.impl;

import com.alibaba.fastjson2.JSON;
import com.chixing.clients.CustomerClient;
import com.chixing.clients.ProductClient;
import com.chixing.entity.Customer;
import com.chixing.entity.Myorder;
import com.chixing.vo.OrderDetailVO;
import com.chixing.entity.Product;
import com.chixing.mapper.MyorderMapper;
import com.chixing.service.IMyorderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhangXu
 * @since 2022-10-14
 */
@Service
@SuppressWarnings("all")
public class MyorderServiceImpl implements IMyorderService{
    private MyorderMapper myorderMapper;
    private ProductClient productClient;
    private CustomerClient customerClient;
    @Autowired
    public void setProductClient(ProductClient productClient) {
        this.productClient = productClient;
    }
    @Autowired
    public void setCustomerClient(CustomerClient customerClient) {
        this.customerClient = customerClient;
    }

    @Autowired
    public void setMyorderMapper(MyorderMapper myorderMapper) {
        this.myorderMapper = myorderMapper;
    }


    @Override
    public String getById(Integer orderId) {
        Myorder myorder = myorderMapper.selectById(orderId);
        if(myorder != null) {
            String customerStr = customerClient.getById(myorder.getCustId());
            String productStr = productClient.getById(myorder.getProId());
            if (customerStr != null && productStr != null) {
                return JSON.toJSONString(new OrderDetailVO(myorder
                        , JSON.to(Customer.class, customerStr)
                        , JSON.to(Product.class, productStr)));
            }
        }
        return null;
    }

    @Override
    public boolean save(Integer cusId, Integer proId) {
        Product product = JSON.to(Product.class, productClient.getById(proId));
        Customer customer = JSON.to(Customer.class, customerClient.getById(1));
        Myorder myorder = null;
        if(product != null && customer != null){
            myorder = new Myorder();
            myorder.setOrderCreateTime(LocalDateTime.now());
            myorder.setCustId(cusId);
            myorder.setProId(proId);
            myorder.setOrderPrice(BigDecimal.valueOf(product.getProPrice()));
            myorder.setOrderNum(UUID.randomUUID().toString().replace("-",""));
            myorder.setOrderStatus("0");
            return myorderMapper.insert(myorder) > 0;
        }
        return false;
    }

}
