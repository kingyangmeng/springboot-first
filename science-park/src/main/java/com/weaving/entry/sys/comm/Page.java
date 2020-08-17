package com.weaving.entry.sys.comm;

/**
 * 分页sql参数，如果使用到就继承
 * 
 * @author yang
 *
 */
public class Page {
	private Integer index;
	private Integer num;

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Page [index=" + index + ", num=" + num + "]";
	}

}
