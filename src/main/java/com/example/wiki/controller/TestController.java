package com.example.wiki.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 用来返回字符串  对比 @Controller 返回页面
@RestController
public class TestController {

// 设置请求接口
	/*
		GET  POST, PUT, DELETE
		对应的有 @GetMapping @PostMapping @PutMapping @DeleteMapping
		或者 @RequestMapping(value = "/hello", method = RequestMethod.GET) 默认是get请求
	 */
	@RequestMapping("/hello")
	public String hello() {
		return "hello world";
	}
}
