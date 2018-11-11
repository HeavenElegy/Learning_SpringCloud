package com.heaven.study.springcloudconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
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

	@Value("${db.username}")
	private String username;

	@RequestMapping(path = "/getUsername",method = RequestMethod.GET)
	@ResponseBody
	public Object getUsername() {
		return username;
	}
}
