package com.chixing.service;

import com.chixing.entity.Customer;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhangXu
 * @since 2022-10-14
 */
public interface ICustomerService {
    Customer getById(Integer cusId);
}
