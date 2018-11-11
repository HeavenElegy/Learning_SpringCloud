package com.heaven.study.springcloudfeign.service;

import org.springframework.stereotype.Component;

/**
 * 作为{@link MyService}的断路器触发异常执行体使用
 * @author li.xiaoxi
 * @description
 */
@Component
public class ErrMyService implements MyService {
	@Override
	public String sayHello(String name) {
		return "远程服务调用异常sayHello(String)";
	}

	@Override
	public Object sayHelloOfReturnObject(String name) {
		return "远程服务调用异常sayHelloOfReturnObject(String)";
	}
}
