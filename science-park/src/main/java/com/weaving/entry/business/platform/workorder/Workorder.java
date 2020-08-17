package com.weaving.entry.business.platform.workorder;

import com.weaving.entry.sys.comm.Comm;

/**
 * 工单管理
 * 
 * @author yang
 *
 */
public class Workorder extends Comm {

	private String id;
	private String orderType;// 工单类型 1：设备故障，2：安防事件，3：耗材补充 ，4：违规停放
	private String parkId; // 所属停车场id（此id为停车场表id，不是对接parkId）
	private String parkName; // 所属停车场名称
	private String remark;// 问题描述
	private String roderStatus;// 工单状态 1.已派单，2.已拒单，3.已接单，4.已结单

	private String acceptId;// 接单人Id，接单人从维保人员中挑选，谁先接单就是谁。
	private String acceptName;// 接单人姓名
	private String feedback;// 反馈说明
	private String feedbackImge;// 反馈照片
	private String finishDate;// 完成时间

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getParkId() {
		return parkId;
	}

	public void setParkId(String parkId) {
		this.parkId = parkId;
	}

	public String getParkName() {
		return parkName;
	}

	public void setParkName(String parkName) {
		this.parkName = parkName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRoderStatus() {
		return roderStatus;
	}

	public void setRoderStatus(String roderStatus) {
		this.roderStatus = roderStatus;
	}

	public String getAcceptId() {
		return acceptId;
	}

	public void setAcceptId(String acceptId) {
		this.acceptId = acceptId;
	}

	public String getAcceptName() {
		return acceptName;
	}

	public void setAcceptName(String acceptName) {
		this.acceptName = acceptName;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public String getFeedbackImge() {
		return feedbackImge;
	}

	public void setFeedbackImge(String feedbackImge) {
		this.feedbackImge = feedbackImge;
	}

	public String getFinishDate() {
		return finishDate;
	}

	public void setFinishDate(String finishDate) {
		this.finishDate = finishDate;
	}

	@Override
	public String toString() {
		return "Workorder [id=" + id + ", orderType=" + orderType + ", parkId=" + parkId + ", parkName=" + parkName
				+ ", remark=" + remark + ", roderStatus=" + roderStatus + ", acceptId=" + acceptId + ", acceptName="
				+ acceptName + ", feedback=" + feedback + ", feedbackImge=" + feedbackImge + ", finishDate="
				+ finishDate + "]";
	}

}
