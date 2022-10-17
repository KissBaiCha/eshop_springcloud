package com.chixing.service.impl;

import com.chixing.clients.ProductClient;
import org.springframework.stereotype.Service;

/**
 * @author Xu Zhang
 * @version 1.0
 * @date 2022/10/17 14:08
 */
@Service
public class ProductFallBackService implements ProductClient {
    @Override
    public String getById(Integer proId) {
        return "查询失败";
    }
}
