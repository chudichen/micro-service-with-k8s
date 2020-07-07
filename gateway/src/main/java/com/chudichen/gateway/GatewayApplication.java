package com.chudichen.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.cloud.gateway.filter.ratelimit.RedisRateLimiter;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chudichen
 */

@SpringBootApplication
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

    private static final String USER_PATH = "/user";
    private static final String COURSE_PATH = "/course";


    @Bean(name = "user-route")
    public RouteLocator authorizationLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path(USER_PATH + "/**")
//                        .uri("lb://USER-EDGE-SERVICE")
                        .uri("http://USER-EDGE-SERVICE")
                        .order(2)
                        .id("client-route")
                ).build();
    }

    @Bean("course-route")
    public RouteLocator adminLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path(COURSE_PATH + "/**")
                        .uri("lb://COURSE-SERVICE")
                        .order(2)
                        .id("admin-route")
                ).build();
    }
}
