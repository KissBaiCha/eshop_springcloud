package com.chixing.clients;

import com.chixing.service.impl.ProductFallBackService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Xu Zhang
 * @version 1.0
 * @date 2022/10/14 20:04
 */
@FeignClient(name = "product-server",fallback = ProductFallBackService.class)
public interface ProductClient {
    @GetMapping("product/{proId}")
    String getById(@PathVariable Integer proId);
}
