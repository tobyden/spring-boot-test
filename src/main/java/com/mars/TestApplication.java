package com.mars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TestApplication {

	public static void main(String[] args) {
		//启动程序
		SpringApplication.run(TestApplication.class, args);
	}	
}
