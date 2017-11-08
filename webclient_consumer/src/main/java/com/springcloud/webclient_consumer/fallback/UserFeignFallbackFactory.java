package com.springcloud.webclient_consumer.fallback;

import com.springcloud.common.entity.User;
import com.springcloud.webclient_consumer.api.UserFeignClient;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class UserFeignFallbackFactory implements FallbackFactory<UserFeignClient> {

    private Logger logger = LoggerFactory.getLogger(UserFeignFallbackFactory.class);

    @Override
    public UserFeignClient create(Throwable throwable) {


        return new UserFeignClient() {

            @Override
            public User getUserById(Integer id) {
                logger.info("into UserFeignFallbackFactory ...");
                logger.info("reason : {}",throwable.getMessage());
                User user = new User();
                user.setId(0);
                user.setUsername("默认用户2");
                user.setAge(0);
                user.setPassword("123456");
                return user;
            }
        };
    }
}
