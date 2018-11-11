package com.heaven.study.springcloudeurekaclient.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author li.xiaoxi
 * @description
 */
@Service
public class MyService {

	@Value("${server.port}")
	private String port;


	public Object sayHello(String name) {
		return "Hello " + name + " from " + port;
	}
}
