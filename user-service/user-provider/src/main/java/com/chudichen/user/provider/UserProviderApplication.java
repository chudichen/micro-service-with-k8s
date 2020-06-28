package com.chudichen.user.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 用户服务启动类
 *
 * @author chudichen
 * @date 2020-06-27
 */
@EnableDiscoveryClient
@SpringBootApplication
public class UserProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserProviderApplication.class, args);
	}

}
