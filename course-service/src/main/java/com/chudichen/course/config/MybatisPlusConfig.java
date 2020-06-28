package com.chudichen.course.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Michael Chu
 * @since 2020-06-26 23:37
 */
@Configuration
@MapperScan("com.chudichen.course.mapper")
public class MybatisPlusConfig {
}
