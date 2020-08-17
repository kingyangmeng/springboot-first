package com.weaving.common;

/**
 * 给前端页面的返回结果集
 * 
 * @author yang
 *
 */
public class ResultObj {

	private int code = 200;
	private String message = "操作成功";
	private Object data;
	private boolean status = true;

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "ResultObj [code=" + code + ", message=" + message + ", data=" + data + ", status=" + status + "]";
	}

	public ResultObj(int code, String message, boolean status) {
		super();
		this.code = code;
		this.message = message;
		this.status = status;
	}

	public ResultObj() {
		super();
	}
	
	

}
