package com.springcloud.webclient_consumer.service;

import com.springcloud.common.entity.User;
import com.springcloud.webclient_consumer.api.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chaoxingyu
 * Date: 2017-11-03
 * Time: 15:42
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserFeignClient userFeignClient;

    @Override
    public User getUserById(Integer id) {
        return userFeignClient.getUserById(id);
//        return null;
    }
}
