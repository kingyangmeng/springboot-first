package com.weaving.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.weaving.common.AppLoginInterception;
import com.weaving.common.LoginInterception;

@Configuration
public class InterceptionConfig implements WebMvcConfigurer {

	/**
	 * 提前加载
	 * 
	 * @return
	 */
	@Bean
	public HandlerInterceptor getTokenInterceptor() {
		return new LoginInterception();
	}

	@Bean
	public HandlerInterceptor getAppLoginInterception() {
		return new AppLoginInterception();
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {

		List<String> excludePath = new ArrayList<String>();
		excludePath.add("/platform/login");
		excludePath.add("/platform/logout");

		registry.addInterceptor(getTokenInterceptor()).excludePathPatterns(excludePath).addPathPatterns("/**");

		registry.addInterceptor(getAppLoginInterception()).excludePathPatterns(excludePath).addPathPatterns("/**");

		WebMvcConfigurer.super.addInterceptors(registry);

	}

}
