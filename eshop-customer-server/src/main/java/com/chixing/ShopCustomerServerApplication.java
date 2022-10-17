package com.chixing;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Xu Zhang
 * @version 1.0
 * @date 2022/10/14 18:31
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients(basePackages = "com.chixing.clients")
@MapperScan("com.chixing.mapper")
public class ShopCustomerServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShopCustomerServerApplication.class,args);
    }
}
