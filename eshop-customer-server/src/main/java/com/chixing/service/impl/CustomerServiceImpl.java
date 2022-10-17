package com.chixing.service.impl;

import com.chixing.entity.Customer;
import com.chixing.mapper.CustomerMapper;
import com.chixing.service.ICustomerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
public class CustomerServiceImpl implements ICustomerService{
    private CustomerMapper customerMapper;
    @Autowired
    public void setCustomerMapper(CustomerMapper customerMapper) {
        this.customerMapper = customerMapper;
    }
    public Customer getById(Integer cusId){
        return customerMapper.selectById(cusId);
    }
}
