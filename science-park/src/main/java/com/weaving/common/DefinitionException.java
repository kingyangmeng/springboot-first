package com.weaving.common;

/**
 * 自定义异常类
 * 
 * @author yang
 *
 */
public class DefinitionException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer errorCode;
	private String errorMsg;
	private boolean status = false;

	public Integer getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public DefinitionException(Integer errorCode, String errorMsg, boolean status) {
		super();
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
		this.status = status;
	}

	public DefinitionException(Integer errorCode, String errorMsg) {
		super();
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}

	public DefinitionException(String errorMsg) {
		super();
		this.errorMsg = errorMsg;
	}

}
