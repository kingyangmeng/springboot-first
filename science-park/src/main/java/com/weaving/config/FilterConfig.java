package com.weaving.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.weaving.common.CrossFire;

/**
 * 跨域处理
 * 
 * @author yang
 *
 */
@Configuration
public class FilterConfig {
	@Bean
	public FilterRegistrationBean<CrossFire> registrationBean() {
		FilterRegistrationBean<CrossFire> filterRegistrationBean = new FilterRegistrationBean<CrossFire>(new CrossFire());
		filterRegistrationBean.addUrlPatterns("/*");
		return filterRegistrationBean;
	}
}
