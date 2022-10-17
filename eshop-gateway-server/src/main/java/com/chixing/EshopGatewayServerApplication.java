package com.chixing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Hello world!
 *
 * @author ZhangJiuJiu
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class EshopGatewayServerApplication {
    public static void main( String[] args ) {
        SpringApplication.run(EshopGatewayServerApplication.class,args);
    }
}
