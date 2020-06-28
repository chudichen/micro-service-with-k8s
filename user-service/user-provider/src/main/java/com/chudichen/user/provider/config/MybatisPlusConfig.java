package com.chudichen.user.provider.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Michael Chu
 * @since 2020-06-26 23:37
 */
@Configuration
@MapperScan("com.chudichen.user.provider.mapper")
public class MybatisPlusConfig {
}
