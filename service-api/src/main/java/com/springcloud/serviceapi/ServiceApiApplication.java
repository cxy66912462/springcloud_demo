package com.springcloud.serviceapi;

import com.springcloud.common.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceApiApplication.class, args);
	}

	public static void test(String[] args) {
		User user = new User();
	}
}
