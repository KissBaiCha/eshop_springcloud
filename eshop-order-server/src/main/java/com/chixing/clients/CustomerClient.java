package com.chixing.clients;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Xu Zhang
 * @version 1.0
 * @date 2022/10/14 20:06
 */

@FeignClient(name = "customer-server")
public interface CustomerClient {
    @GetMapping("customer/{cusId}")
    String getById(@PathVariable("cusId") Integer cusId);
}
