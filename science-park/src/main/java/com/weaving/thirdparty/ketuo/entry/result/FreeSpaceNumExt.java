package com.weaving.thirdparty.ketuo.entry.result;

/**
 * 2.6.5剩余车位查询扩展接口
 * @author Administrator
 *
 */
public class FreeSpaceNumExt {
	private Integer carType;//固定车类型 详见参数枚举 1.6.2
	private Integer carNum;//数量

	public Integer getCarType() {
		return carType;
	}

	public void setCarType(Integer carType) {
		this.carType = carType;
	}

	public Integer getCarNum() {
		return carNum;
	}

	public void setCarNum(Integer carNum) {
		this.carNum = carNum;
	}

	@Override
	public String toString() {
		return "FreeSpaceNumExt [carType=" + carType + ", carNum=" + carNum + "]";
	}
}
