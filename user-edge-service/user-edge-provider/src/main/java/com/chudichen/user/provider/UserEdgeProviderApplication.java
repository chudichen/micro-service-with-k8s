package com.chudichen.user.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 用户服务启动类
 *
 * @author chudichen
 * @date 2020-06-27
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients("com.chudichen.user.facade.feign")
public class UserEdgeProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserEdgeProviderApplication.class, args);
	}

}
