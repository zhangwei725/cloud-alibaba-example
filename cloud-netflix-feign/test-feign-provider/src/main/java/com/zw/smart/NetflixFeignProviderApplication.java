package com.zw.smart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zhangwei
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NetflixFeignProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(NetflixFeignProviderApplication.class, args);
    }
}
