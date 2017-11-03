package com.springcloud.webclient_consumer;


import com.springcloud.config.CustomRibbonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication
//@RibbonClient(name = "userservice-provider",configuration = CustomRibbonConfig.class) //自定义ribbon配置
@EnableFeignClients //feign做声明式服务调用
public class WebclientConsumerApplication {

//	@Bean
//	@LoadBalanced
//	public RestTemplate restTemplate() {
//		return new RestTemplate();
//	}


	public static void main(String[] args) {
		SpringApplication.run(WebclientConsumerApplication.class, args);
	}
}
