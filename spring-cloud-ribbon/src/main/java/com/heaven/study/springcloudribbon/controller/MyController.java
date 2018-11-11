package com.heaven.study.springcloudribbon.controller;

import com.heaven.study.springcloudribbon.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author li.xiaoxi
 * @description
 */
@Controller
@RequestMapping(path = "/my")
public class MyController {

	@Autowired
	private MyService myService;

	@RequestMapping(path = "/sayHello", method = RequestMethod.GET)
	@ResponseBody
	public Object sayHello(String name) {

		return myService.sayHello(name);

	}
}
