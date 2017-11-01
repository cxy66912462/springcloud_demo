package com.springcloud.webclient_consumer2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class WebclientConsumer2Application {

	public static void main(String[] args) {
		SpringApplication.run(WebclientConsumer2Application.class, args);
	}
}
