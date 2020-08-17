package com.weaving.entry.business.platform.rule;

import java.util.List;

import javax.validation.constraints.NotNull;

/**
 * 收费规则
 * 
 * @author yang
 *
 */
public class Rule {

	private String id;
	private String parkId;// 对应的停车场表id
	@NotNull(message = "一般时段费用不能为空")
	private Double ordinary;// 一般时段费用 半小时
	@NotNull(message = "封顶金额不能为空")
	private Double maxMoney; // 封顶金额
	@NotNull(message = " 夜间收费不能为空")
	private Double night;// 夜间收费 半小时
	private String nightStartDate;// 夜间开始时间
	private String nightEndDate;// 夜间结束时间
	private Double timeLength;// 夜间收费时长（自己计算）
	private List<String> date;
	private String military = "0";// 军车
	private String ambulance = "0";// 救护车
	private String police = "0";// 警车

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Double getOrdinary() {
		return ordinary;
	}

	public void setOrdinary(Double ordinary) {
		this.ordinary = ordinary;
	}

	public Double getMaxMoney() {
		return maxMoney;
	}

	public void setMaxMoney(Double maxMoney) {
		this.maxMoney = maxMoney;
	}

	public Double getNight() {
		return night;
	}

	public void setNight(Double night) {
		this.night = night;
	}

	public String getNightStartDate() {
		return nightStartDate;
	}

	public void setNightStartDate(String nightStartDate) {
		this.nightStartDate = nightStartDate;
	}

	public String getNightEndDate() {
		return nightEndDate;
	}

	public void setNightEndDate(String nightEndDate) {
		this.nightEndDate = nightEndDate;
	}

	public String getParkId() {
		return parkId;
	}

	public void setParkId(String parkId) {
		this.parkId = parkId;
	}

	public String getMilitary() {
		return military;
	}

	public void setMilitary(String military) {
		this.military = military;
	}

	public String getAmbulance() {
		return ambulance;
	}

	public void setAmbulance(String ambulance) {
		this.ambulance = ambulance;
	}

	public String getPolice() {
		return police;
	}

	public void setPolice(String police) {
		this.police = police;
	}

	public List<String> getDate() {
		return date;
	}

	public void setDate(List<String> date) {
		this.date = date;
	}

	public Double getTimeLength() {
		return timeLength;
	}

	public void setTimeLength(Double timeLength) {
		this.timeLength = timeLength;
	}

	@Override
	public String toString() {
		return "Rule [id=" + id + ", parkId=" + parkId + ", ordinary=" + ordinary + ", maxMoney=" + maxMoney
				+ ", night=" + night + ", nightStartDate=" + nightStartDate + ", nightEndDate=" + nightEndDate
				+ ", date=" + date + ", military=" + military + ", ambulance=" + ambulance + ", police=" + police + "]";
	}

}
