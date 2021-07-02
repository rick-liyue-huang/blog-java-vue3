package com.example.wiki.controller;

import com.example.wiki.domain.Ebook;
import com.example.wiki.service.EbookService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

// 用来返回字符串  对比 @Controller 返回页面
@RestController
@RequestMapping("/ebook")
public class EbookController {

	@Resource
	private EbookService ebookService;

	@RequestMapping("/list")
	public List<Ebook> list() {
		return ebookService.list();
	}

}
