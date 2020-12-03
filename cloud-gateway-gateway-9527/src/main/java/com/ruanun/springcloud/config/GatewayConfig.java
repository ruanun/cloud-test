package com.ruanun.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author ruan
 */
@Component
public class GatewayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("path_route_BAIDU", r -> r.path("/2").uri("https://www.jianshu.com"))
                .route("path_route_BING", r -> r.path("/1").uri("https://www.jianshu.com/p/d011a0e5539d"))
                .build();
    }
}
