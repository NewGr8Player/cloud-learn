package com.xavier.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Nacos客户端
 */
@SpringBootApplication
// @EnableDiscoveryClient
public class ConfigClientApp extends SpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApp.class, args);
    }
}
