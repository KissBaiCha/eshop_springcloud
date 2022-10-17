package com.chixing.service.impl;

import com.chixing.clients.CustomerClient;
import org.springframework.stereotype.Service;

/**
 * @author Xu Zhang
 * @version 1.0
 * @date 2022/10/17 14:09
 */
@Service
public class CustomerFallBackService implements CustomerClient {
    @Override
    public String getById(Integer cusId) {
        return "查询失败";
    }
}
