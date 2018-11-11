package com.heaven.study.springcloudribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author li.xiaoxi
 * @description
 */
@Service
public class MyService {

	@Autowired
	private RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "sayError")//添加断路配置。并指向sayError方法
	public Object sayHello(String name) {
		return restTemplate.getForObject("http://EUREKA-CLIENT/my/sayHello?name=" + name, String.class);
	}


	private String sayError(String name) {
		return "远程服务调用异常sayHello(String)->sayError(String)";
	}
}
