package com.example.wiki.service;

import com.example.wiki.domain.Test;
import com.example.wiki.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

// 加入注解后spring可以扫描到这个类
@Service
public class TestService {

	@Resource
	private TestMapper testMapper;

	public List<Test> list() {
		return testMapper.list();
	}
}
