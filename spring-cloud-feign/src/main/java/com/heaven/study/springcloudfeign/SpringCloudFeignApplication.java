package com.heaven.study.springcloudfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients//作为Feign启动
@EnableDiscoveryClient//启用发现
@SpringBootApplication
public class SpringCloudFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFeignApplication.class, args);
	}
}
