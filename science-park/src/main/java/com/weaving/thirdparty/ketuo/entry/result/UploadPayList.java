package com.weaving.thirdparty.ketuo.entry.result;

import java.util.List;

/**
 * 2.3.4获取缴费记录上报所需要的数据
 * @author Administrator
 *
 */
public class UploadPayList {
	private List<UploadPay> payList;

	public List<UploadPay> getPayList() {
		return payList;
	}

	public void setPayList(List<UploadPay> payList) {
		this.payList = payList;
	}

	@Override
	public String toString() {
		return "UploadPayList [payList=" + payList + "]";
	}
}
