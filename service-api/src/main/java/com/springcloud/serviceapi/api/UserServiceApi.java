package com.springcloud.serviceapi.api;

import com.springcloud.common.entity.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chaoxingyu
 * Date: 2017-11-02
 * Time: 17:14
 */
public interface UserServiceApi {

    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    User getUserById(@PathVariable("id")  Integer id);

}
