package com.springcloud.webclient_consumer.api;

import com.springcloud.common.entity.User;
import com.springcloud.config.CustomRibbonConfig;
import com.springcloud.serviceapi.api.UserServiceApi;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chaoxingyu
 * Date: 2017-11-03
 * Time: 13:27
 */
@FeignClient(name = "userservice-provider")
public interface UserFeignClient extends UserServiceApi{ //继承抽取出来的服务接口


}
