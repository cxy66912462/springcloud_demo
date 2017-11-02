package com.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chaoxingyu
 * Date: 2017-11-02
 * Time: 17:30
 */
@Configuration
public class CustomRibbonConfig {

    @Bean
    public IRule ribbonRule(){
        return new RandomRule();
    }
}
