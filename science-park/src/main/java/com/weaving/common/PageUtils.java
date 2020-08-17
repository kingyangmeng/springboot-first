package com.weaving.common;

import java.io.Serializable;
import java.util.List;

/**
 * 分页工具
 * 
 * @author yang
 *
 */
public class PageUtils<T> implements Serializable {

	private static final long serialVersionUID = 1L;

	/*
	 * 几个主要的参数 1.总条数 2.总页数 3.当前页数 4.每页显示条数
	 */

	private Integer pageSize; // 每页显示条数 默认10条 前端也可以传过来

	private Integer totalCount; // 总条数 查询出来的

	private Integer currentPage; // 当前页码 前端传过来的 ，默认是1

	private Integer totalPage; // 总页数

	private List<T> entryList;

	public PageUtils(Integer pageNum, Integer pageSize, Integer totalCount, List<T> entryList) {

		this.currentPage = pageNum;
		
		// 总记录数= list.size()
		this.totalCount = totalCount;

		// 每页显示数 = 前端传过来的，如果没有穿 默认是10条
		this.pageSize = pageSize;

		// 总页数 = 总记录数/每页条数，如果有余数+1
		this.totalPage = this.totalCount / this.pageSize;
		if (this.totalCount / this.pageSize != 0) {
			this.totalPage = this.totalPage + 1;
		}

		this.entryList = entryList;
	}

	public PageUtils() {
		super();
	}

	public PageUtils(Integer pageSize, Integer totalCount, Integer currentPage, Integer totalPage, List<T> entryList) {
		super();
		this.pageSize = pageSize;
		this.totalCount = totalCount;
		this.currentPage = currentPage;
		this.totalPage = totalPage;
		this.entryList = entryList;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<T> getEntryList() {
		return entryList;
	}

	public void setEntryList(List<T> entryList) {
		this.entryList = entryList;
	}

}
