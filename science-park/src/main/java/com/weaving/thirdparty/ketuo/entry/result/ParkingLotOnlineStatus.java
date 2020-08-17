package com.weaving.thirdparty.ketuo.entry.result;

/**
 * 2.6.8查询车场是否在线
 * @author Administrator
 *
 */
public class ParkingLotOnlineStatus {
	private Integer parkId;//车场Id
	private Integer isOnline;//是否在线：1:在线，0：不在线

	public Integer getParkId() {
		return parkId;
	}

	public void setParkId(Integer parkId) {
		this.parkId = parkId;
	}

	public Integer getIsOnline() {
		return isOnline;
	}

	public void setIsOnline(Integer isOnline) {
		this.isOnline = isOnline;
	}

	@Override
	public String toString() {
		return "ParkingLotOnlineStatus [parkId=" + parkId + ", isOnline=" + isOnline + "]";
	}
}
