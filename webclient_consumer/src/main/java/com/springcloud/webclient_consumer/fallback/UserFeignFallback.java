package com.springcloud.webclient_consumer.fallback;

import com.springcloud.common.entity.User;
import com.springcloud.webclient_consumer.api.UserFeignClient;
import org.springframework.stereotype.Component;

@Component
public class UserFeignFallback implements UserFeignClient{


    @Override
    public User getUserById(Integer id) {
        User user = new User();
        user.setId(0);
        user.setUsername("默认用户");
        user.setAge(0);
        user.setPassword("123456");
        return user;
    }
}
