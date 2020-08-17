package com.weaving.thirdparty.ketuo.entry.result;

/**
 * 2.1.5通道信息
 * @author Administrator
 *
 */
public class ParkingNode {
	private Integer id;//通道编号 
	private String nodeIp;//通道IP地址
	private String nodeName;//通道名称
	private Integer useType;//使用类别, 详见参数枚举1.6.7
	private Integer areaCode;//区域编号（新增数据）

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNodeIp() {
		return nodeIp;
	}

	public void setNodeIp(String nodeIp) {
		this.nodeIp = nodeIp;
	}

	public String getNodeName() {
		return nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public Integer getUseType() {
		return useType;
	}

	public void setUseType(Integer useType) {
		this.useType = useType;
	}

	public Integer getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(Integer areaCode) {
		this.areaCode = areaCode;
	}

	@Override
	public String toString() {
		return "ParkingNode [id=" + id + ", nodeIp=" + nodeIp + ", nodeName=" + nodeName + ", useType=" + useType
				+ ", areaCode=" + areaCode + "]";
	}
}
