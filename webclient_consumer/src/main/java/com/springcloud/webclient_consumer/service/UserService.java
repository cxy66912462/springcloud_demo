package com.springcloud.webclient_consumer.service;

import com.springcloud.common.entity.User;
import com.springcloud.serviceapi.api.UserServiceApi;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chaoxingyu
 * Date: 2017-11-03
 * Time: 15:42
 */
public interface UserService{

    User getUserById(Integer id);
}
