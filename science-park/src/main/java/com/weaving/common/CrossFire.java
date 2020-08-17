package com.weaving.common;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 跨域处理
 * @author yang
 *
 */
public class CrossFire implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest HttpRequest = (HttpServletRequest) request;
		// 将ServletResponse转换为HttpServletResponse
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		httpResponse.setContentType("application/json;charset=UTF-8");
		if ("OPTIONS".equals(HttpRequest.getMethod())) {
			// 这里通过判断请求的方法，判断此次是否是预检请求，如果是，立即返回一个204状态吗，表示，允许跨域；预检后，正式请求，这个方法参数就是我们设置的post了
			httpResponse.setStatus(204); // HttpStatus.SC_NO_CONTENT = 204
			httpResponse.setHeader("Access-Control-Allow-Headers", "Content-Type, x-requested-with, X-Token,x-Token,x-token"); // 当判定为预检请求后，设定允许请求的头部类型
			httpResponse.addHeader("Access-Control-Max-Age", "1"); // 预检有效保持时间
			httpResponse.setHeader("Access-Control-Max-Age", "3600");
		}
		httpResponse.setHeader("Access-Control-Allow-Credentials", "true");
		httpResponse.setHeader("Access-Control-Expose-Headers", "*");
		httpResponse.setHeader("Access-Control-Allow-Headers", "Content-Type,X-Token");
		httpResponse.setHeader("Access-Control-Allow-Origin", "*");
		httpResponse.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
		chain.doFilter(request, response);
	}

}
