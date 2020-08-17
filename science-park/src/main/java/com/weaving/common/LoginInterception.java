package com.weaving.common;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.weaving.entry.sys.user.User;

public class LoginInterception implements HandlerInterceptor {

	@Autowired
	private RedisUtils redisUtils;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("进入拦截器=====>");
		String token = request.getHeader("X-Token");
		String path = request.getServletPath();
		System.out.println(token);
		if (path.contains("/app/")) {
			// 如果路径中包含app，直接放行
			return true;
		} else if (StringUtils.isNotBlank(token)) {
			Object object = redisUtils.get(token);
			if (null != object) {
				User user = (User) object;
				// 刷新时间
				redisUtils.set(token, user, 30 * 60);
				return true;
			}
		}
		response.setStatus(530);
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json; charset=utf-8");
		JSONObject res = new JSONObject();
		res.put("status", false);
		res.put("message", "请重新登录");
		res.put("code", "104");
		PrintWriter out = response.getWriter();
		out.append(res.toString());
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}

}
