package com.springcloud.userservice_provider.controller;

import com.springcloud.common.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Value("${server.port}")
    private String port;

    @Value("${spring.application.name}")
    private String applicationName;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Integer id){
        logger.info("查询用户信息,id = {} ,service = {}",id,applicationName+":"+port);

        User user = new User();
        user.setId(1);
        user.setAge(25);
        user.setUsername("大吉大利");
        user.setPassword("qwe");
        user.setSalt("asd");

        return user;
    }

}
