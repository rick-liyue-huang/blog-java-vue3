package com.example.wiki.controller;

import com.example.wiki.domain.Test;
import com.example.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

// 用来返回字符串  对比 @Controller 返回页面
@RestController
public class TestController {

	@Value("${test.hello:TEST}")
	private String testHello;

	@Resource
	private TestService testService;

// 设置请求接口
	/*
		GET  POST, PUT, DELETE
		对应的有 @GetMapping @PostMapping @PutMapping @DeleteMapping
		或者 @RequestMapping(value = "/hello", method = RequestMethod.GET) 默认是get请求
	 */

	@RequestMapping("/hello")
	public String hello() {
		return "Hello World!" + testHello;
	}

	@RequestMapping("/test/list")
	public List<Test> list() {
		return testService.list();
	}

	@PostMapping("/hello/post")
	public String helloPost(String name) {
		return "Hello World Post. " + name;
	}
}
