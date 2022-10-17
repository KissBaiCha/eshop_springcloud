package com.chixing;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Hello world!
 *
 * @author ZhangJiuJiu
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients(basePackages = "com.chixing.clients")
@MapperScan("com.chixing.mapper")
public class ShopProductServerApplication {
    public static void main( String[] args ) {
        SpringApplication.run(ShopProductServerApplication.class,args);
    }
}
