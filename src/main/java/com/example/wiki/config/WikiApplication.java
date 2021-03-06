package com.example.wiki.config;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

/*
	@ComponentScan只能支持当前及子目录的加载controller，如果需要不同的目录，需要额外写入到括号中，并且可以通过逗号分隔开写入多个目录
*/
// 增加注解用来处理持久层
@ComponentScan({"com.example"})
@SpringBootApplication
@MapperScan("com.example.wiki.mapper")
public class WikiApplication {

	private static final Logger LOG = LoggerFactory.getLogger(WikiApplication.class);

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(WikiApplication.class);
		Environment env = app.run(args).getEnvironment();
		LOG.info("successfully start!!!");
		LOG.info("address: \thttp://127.0.0.1:{}", env.getProperty("server.port"));
	}

}
