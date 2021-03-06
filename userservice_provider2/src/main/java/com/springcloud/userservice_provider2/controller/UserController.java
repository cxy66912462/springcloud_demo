package com.springcloud.userservice_provider2.controller;

import com.springcloud.common.entity.User;
import com.springcloud.serviceapi.api.UserServiceApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController implements UserServiceApi{

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Value("${server.port}")
    private String port;

    @Value("${spring.application.name}")
    private String applicationName;



    /**
     * 重构后,实现service-api
     */
    @Override
    public User getUserById(Integer id) {
        logger.info("查询用户信息,id = {} ,service = {}",id,applicationName+":"+port);
        User user = new User();
        user.setId(1);
        user.setAge(25);
        user.setUsername("大吉大利");
        user.setPassword("qwe");
        user.setSalt("asd");
        return user;
    }


    /**
     * 重构前
     */

//    @Autowired
//    private RestTemplate restTemplate;

//    @GetMapping("/user/{id}")
//    public User getUser(@PathVariable Integer id){
//        logger.info("查询用户信息,id = {} ,service = {}",id,applicationName+":"+port);
//
//        User user = new User();
//        user.setId(1);
//        user.setAge(25);
//        user.setUsername("大吉大利");
//        user.setPassword("qwe");
//        user.setSalt("asd");
//        return user;
//    }

}
