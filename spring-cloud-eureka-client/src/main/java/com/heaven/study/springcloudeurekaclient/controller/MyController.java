package com.heaven.study.springcloudeurekaclient.controller;

import com.heaven.study.springcloudeurekaclient.service.MyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 测试用的Controller。暂时没有写service
 *
 * @author li.xiaoxi
 * @description	学习用
 */
@RequestMapping(path = "/my")
@Controller
public class MyController {

	private Logger log = LoggerFactory.getLogger(getClass());

	@Autowired
	private MyService myService;

	@RequestMapping(path = "/sayHello", method = RequestMethod.GET)
	@ResponseBody
	public Object sayHello(String name) {

		return myService.sayHello(name);
	}


	@RequestMapping(path = "/service.test()")
	@ResponseBody
	public Object test() {
		return "test()";
	}

	@RequestMapping(path = "/service.test(java.lang.String)")
	@ResponseBody
	public Object test(String input) {
		return "test(String)";
	}
}
