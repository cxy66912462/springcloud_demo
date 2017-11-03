package com.springcloud.webclient_consumer.controller;


import com.springcloud.common.entity.User;
import com.springcloud.webclient_consumer.api.UserFeignClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chaoxingyu
 * Date: 2017-11-02
 * Time: 13:54
 */
@RestController
public class UserController {

    @Value("${server.port}")
    private String port;

    @Value("${spring.application.name}")
    private String applicationName;

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    /**
     * feign声明式服务调用,依赖ribbon
     */
    @Autowired
    private UserFeignClient client;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Integer id) {
        return this.client.getUserById(id);
    }



    /**
     * ribbon客户端负载均衡
     */
//    @Autowired
//    private RestTemplate restTemplate;
//    @Autowired
//    private LoadBalancerClient loadBalancerClient;
//
//
//    @GetMapping("/user/{id}")
//    public User findById(@PathVariable Long id) {
//        return this.restTemplate.getForObject("http://userservice-provider/user/" + id, User.class);
//    }
//
//    @GetMapping("/log-user-instance")
//    public void logUserInstance() {
//        ServiceInstance serviceInstance = this.loadBalancerClient.choose("userservice-provider");
//        // 打印当前选择的是哪个节点
//        System.out.println(serviceInstance.getHost()+":"+serviceInstance.getPort());
//    }



}
