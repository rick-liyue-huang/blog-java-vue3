package com.example.wiki.service;

import com.example.wiki.domain.Demo;
import com.example.wiki.mapper.DemoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

// 加入注解后spring可以扫描到这个类
@Service
public class DemoService {

	@Resource
	private DemoMapper demoMapper;

	public List<Demo> list() {
		return demoMapper.selectByExample(null);
	}
}
