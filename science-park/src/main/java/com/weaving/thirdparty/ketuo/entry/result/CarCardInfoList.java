package com.weaving.thirdparty.ketuo.entry.result;

import java.util.List;

/**
 * 2.2.2固定车信息
 * @author Administrator
 *
 */
public class CarCardInfoList {
	private Integer cardId;//卡片id
	private String cardName;//卡片名称
	private String useName;//户主名
	private String tel;//用户手机号
	private String roomId;//房间号
	private String remak;//是否重新制作
	private String lotCount;//车位数量
	private String validCount;//未过期车位数量
	private String fullCarNoStr;//车牌号，多个车牌号用，隔开
	private List<CarCardInfo> carLotList;//车位信息 array字符串

	public Integer getCardId() {
		return cardId;
	}

	public void setCardId(Integer cardId) {
		this.cardId = cardId;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getUseName() {
		return useName;
	}

	public void setUseName(String useName) {
		this.useName = useName;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getRoomId() {
		return roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public String getRemak() {
		return remak;
	}

	public void setRemak(String remak) {
		this.remak = remak;
	}

	public String getLotCount() {
		return lotCount;
	}

	public void setLotCount(String lotCount) {
		this.lotCount = lotCount;
	}

	public String getValidCount() {
		return validCount;
	}

	public void setValidCount(String validCount) {
		this.validCount = validCount;
	}

	public String getFullCarNoStr() {
		return fullCarNoStr;
	}

	public void setFullCarNoStr(String fullCarNoStr) {
		this.fullCarNoStr = fullCarNoStr;
	}

	public List<CarCardInfo> getCarLotList() {
		return carLotList;
	}

	public void setCarLotList(List<CarCardInfo> carLotList) {
		this.carLotList = carLotList;
	}

	@Override
	public String toString() {
		return "CarCardInfoList [cardId=" + cardId + ", cardName=" + cardName + ", useName=" + useName + ", tel=" + tel
				+ ", roomId=" + roomId + ", remak=" + remak + ", lotCount=" + lotCount + ", validCount=" + validCount
				+ ", fullCarNoStr=" + fullCarNoStr + ", carLotList=" + carLotList + "]";
	}
}
