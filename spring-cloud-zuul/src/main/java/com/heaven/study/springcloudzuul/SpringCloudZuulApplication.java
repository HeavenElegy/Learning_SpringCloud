package com.heaven.study.springcloudzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy//启动路由
@EnableDiscoveryClient//启动发现
public class SpringCloudZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudZuulApplication.class, args);
	}
}
