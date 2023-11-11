package com.example.springboot.migration.web;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// migration
//import javax.servlet.Filter;
import jakarta.servlet.Filter;

@Configuration
public class WebFilterConfig {

    @Bean
    public FilterRegistrationBean logFilter() {
        FilterRegistrationBean<Filter> filterFilterRegistrationBean = new FilterRegistrationBean<>();
        filterFilterRegistrationBean.setFilter(new LogFilter());
        filterFilterRegistrationBean.addUrlPatterns("/api/*");
        return filterFilterRegistrationBean;
    }
}