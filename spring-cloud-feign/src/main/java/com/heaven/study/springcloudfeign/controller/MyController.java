package com.heaven.study.springcloudfeign.controller;

import com.heaven.study.springcloudfeign.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author li.xiaoxi
 * @description
 */
@RequestMapping(path = "/my")
@Controller
public class MyController {

	@Autowired
	private MyService myService;

	@RequestMapping(path = "/sayHello", method = RequestMethod.GET)
	@ResponseBody
	public Object sayHello(String name) {
		return myService.sayHello(name);
	}

	@RequestMapping(path = "/sayHelloOfReturnObject", method = RequestMethod.GET)
	@ResponseBody
	public Object sayHelloOfReturnObject(String name) {
		return myService.sayHelloOfReturnObject(name);
	}
}
