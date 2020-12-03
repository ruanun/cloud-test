package com.ruanun.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ruan
 */

@Configuration
public class Rules {
    @Bean
    public IRule myrule(){
        // 定义随机规则 当然Irule里面另外几个都是可以的
        return new RandomRule();
    }
}
