package com.example.springboot.migration.web;

import lombok.extern.slf4j.Slf4j;

// migration
//import javax.servlet.*;
import jakarta.servlet.*;
import java.io.IOException;

@Slf4j
public class LogFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("logFilter");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
