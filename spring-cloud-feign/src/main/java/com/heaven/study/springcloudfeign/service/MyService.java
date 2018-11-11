package com.heaven.study.springcloudfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author li.xiaoxi
 * @description
 *
 */
@FeignClient(name = "eureka-client", path = "/my", fallback = ErrMyService.class)
public interface MyService {


	/**
	 * 调用远程接口
	 * @param name
	 * @return
	 */
	@RequestMapping(path = "/sayHello", method = RequestMethod.GET)
	String sayHello(@RequestParam(name = "name") String name);


	/**
	 * 以Object作为返回值进行调用
	 * //TODO 这个方法调用会出异常。RestClientException: Could not extract response: no suitable HttpMessageConverter found for response type [class java.lang.Object] and content type [text/plain;charset=UTF-8]
	 * @param name
	 * @return
	 */
	@RequestMapping(path = "/sayHello", method = RequestMethod.GET)
	Object sayHelloOfReturnObject(@RequestParam(name = "name") String name);
}
