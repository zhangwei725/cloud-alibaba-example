package com.zw.smart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author zhangwei
 */
@SpringBootApplication
// 注册中心注册
@EnableDiscoveryClient
// 开启Feign
@EnableFeignClients
public class NetflixFeignClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(NetflixFeignClientApplication.class, args);
    }
}
