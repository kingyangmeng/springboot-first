package com.weaving.config;

import javax.validation.ConstraintViolationException;

import org.apache.commons.lang3.StringUtils;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.weaving.common.DefinitionException;
import com.weaving.common.ResultObj;

/**
 * 全局异常处理类
 * 
 * @author yang
 *
 */

@RestControllerAdvice
public class GlobalExceptionHandler {

	private final static int SystemError = 500; // 系统错误
	private final static int OrdinaryError = 400; // 普通错误
	private final static int ParamError = 300; // 普通错误

	/**
	 * 处理自定义异常
	 * 
	 * @param e
	 * @return
	 */
	@ExceptionHandler(value = DefinitionException.class)
	@ResponseBody
	public ResultObj bizExceptionHandler(DefinitionException e) {
		ResultObj result = new ResultObj(SystemError, "出现错误，故障了...", false);
		if (StringUtils.isNotBlank(e.getErrorMsg())) {
			result.setMessage(e.getErrorMsg());
		}
		if (null != e.getErrorCode()) {
			result.setCode(500);
		}
		return result;
	}

	/**
	 * 系统异常处理
	 * 
	 * @param e
	 * @return
	 */
	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public ResultObj exceptionHandler(Exception e) {
		ResultObj result = new ResultObj(SystemError, "出现错误，故障了...", false);
		if (StringUtils.isNotBlank(e.getMessage())) {
			result.setMessage(e.getMessage());
		}
		return result;
	}

	/**
	 * 1.参数校验异常处理
	 * 
	 * @param e
	 * @return
	 */
	@ExceptionHandler(value = MethodArgumentNotValidException.class)
	public ResultObj handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
		ResultObj result = new ResultObj();
		result.setCode(ParamError);
		result.setMessage(e.getBindingResult().getFieldError().getDefaultMessage());
		result.setStatus(false);
		return result;
	}

	/**
	 * 2.参数校验异常处理
	 * 
	 * @param e
	 * @return
	 */
	@ExceptionHandler(BindException.class)
	public ResultObj bindExceptionHandler(BindException e) {
		// 获取异常中随机一个异常信息
		String defaultMessage = e.getBindingResult().getFieldError().getDefaultMessage();
		ResultObj result = new ResultObj();
		result.setCode(ParamError);
		result.setMessage(defaultMessage);
		result.setStatus(false);
		return result;
	}

	/**
	 * 3.请求方法中校验抛出的异常
	 * 
	 * eg: @NotNull(message = "用户名不能为空") String username
	 * 
	 * @param e
	 * @return
	 */
	@ExceptionHandler(ConstraintViolationException.class)
	public ResultObj constraintViolationExceptionHandler(ConstraintViolationException e) {
		// 获取异常中第一个错误信息
		String message = e.getConstraintViolations().iterator().next().getMessage();
		ResultObj result = new ResultObj();
		result.setCode(ParamError);
		result.setMessage(message);
		result.setStatus(false);
		return result;
	}
}
