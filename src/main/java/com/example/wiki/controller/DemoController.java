package com.example.wiki.controller;

import com.example.wiki.domain.Demo;
import com.example.wiki.service.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

// 用来返回字符串  对比 @Controller 返回页面
@RestController
@RequestMapping("/demo")
public class DemoController {

	@Resource
	private DemoService demoService;

	@RequestMapping("/list")
	public List<Demo> list() {
		return demoService.list();
	}

}
