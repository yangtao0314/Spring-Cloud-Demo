package com.pinpinduo.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

/*********************************
 * @作者 67582
 * @项目名 Spring-Cloud-Demo
 * @时间 2019/3/23 18:34
 * @Version 1.0
 *********************************/
@Configuration
public class FilterConfig {
    @Bean
    public Filter headlerFilter() {
        return new HeadlerFilter();
    }

    @Bean
    public FilterRegistrationBean tokenFilter() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(headlerFilter());
        registration.addUrlPatterns("/*");
        registration.setName("tokenFilter");
        return registration;
    }
}
