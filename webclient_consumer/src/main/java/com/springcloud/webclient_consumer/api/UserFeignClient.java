package com.springcloud.webclient_consumer.api;

import com.springcloud.webclient_consumer.fallback.UserFeignFallback;
import com.springcloud.serviceapi.api.UserServiceApi;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chaoxingyu
 * Date: 2017-11-03
 * Time: 13:27
 */
@FeignClient(name = "userservice-provider",fallback = UserFeignFallback.class)
public interface UserFeignClient extends UserServiceApi{ //继承抽取出来的服务接口


}
