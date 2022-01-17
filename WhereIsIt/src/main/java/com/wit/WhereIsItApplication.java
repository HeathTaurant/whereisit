package com.wit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages="com.wit.main.service.impl")
public class WhereIsItApplication {

	public static void main(String[] args) {
		SpringApplication.run(WhereIsItApplication.class, args);
	}


}


