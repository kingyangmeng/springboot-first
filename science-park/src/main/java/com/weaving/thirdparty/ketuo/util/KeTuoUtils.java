package com.weaving.thirdparty.ketuo.util;

import java.util.Map;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;
import com.weaving.common.ResultObj;
import com.weaving.thirdparty.ketuo.entry.param.BaseEntry;
import com.weaving.thirdparty.ketuo.entry.param.BlacklistParam;
import com.weaving.thirdparty.ketuo.entry.param.DeviceParam;
import com.weaving.thirdparty.ketuo.entry.param.ParkingParam;

/**
 * 科拓对接接口
 * 
 * @author yang
 *
 */
public class KeTuoUtils {

	private final static int appId = 10031;
	private final static String baseUrl = "https://tsktapps.keytop.cn/unite-api";
	private final static String appSercert = "9d682649d9f64faeb5e4477a8e27858e";

	/**
	 * 获取停车场列表
	 * 
	 * @param pageIndex // 第N页，从1开始，N>=1；默认：1
	 * @param pageSize  // 每一页数量 >=1；默认：10
	 * @return {"resCode":"0","resMsg":"获取车场列表成功","data":"{\"pageIndex\":1,\"pageSize\":10,\"parkingList\":[{\"addr\":\"222\",\"lat\":\"\",\"limitH\":\"0\",\"limitL\":0,\"limitW\":0,\"lon\":\"\",\"parkId\":1039,\"parkName\":\"测试啊啊啊啊啊\",\"payRule\":\"\",\"totalSpaceNum\":22,\"workTime\":\"全天24小时\"}],\"totalCount\":6}"}
	 */
	public static ResultObj getParkList(Integer pageIndex, Integer pageSize) {
		String uri = "/config/platform/GetParkingLotList";
		ParkingParam param = new ParkingParam();
		param.setAppId(appId);
		param.setTs(System.currentTimeMillis());
		param.setReqId(UUID.randomUUID().toString());
		param.setServiceCode("getParkingLotList");
		param.setPageIndex(pageIndex);
		param.setPageSize(pageSize);
		param.setKey(SignUtils.paramsSign((JSONObject) JSON.toJSON(param), appSercert));

		Map<String, String> header = Maps.newHashMap();
		header.put("version", "1.0.0");
		String source = OkHttpRequestUtils.postJSONDebug(baseUrl + uri, header, JSON.toJSONString(param));
		return toResult(source);

	}

	/**
	 * 停车场信息查询接口
	 * 
	 * @param parkId 停车场id
	 * @return
	 */
	public static ResultObj getParkingLotInfo(String parkId) {
		String uri = "/api/wec/GetParkingLotInfo";
		BaseEntry param = new BaseEntry();
		param.setAppId(appId);
		param.setParkId(parkId);
		param.setTs(System.currentTimeMillis());
		param.setReqId(UUID.randomUUID().toString());
		param.setServiceCode("getParkingLotInfo");
		param.setKey(SignUtils.paramsSign((JSONObject) JSON.toJSON(param), appSercert));

		Map<String, String> header = Maps.newHashMap();
		header.put("version", "1.0.0");
		String source = OkHttpRequestUtils.postJSONDebug(baseUrl + uri, header, JSON.toJSONString(param));
		return toResult(source);
	}

	/**
	 * 车场终端设备查询接口
	 * 
	 * @param parkId     车场Id
	 * @param deviceType 设备类型
	 * @return
	 */
	public static ResultObj getDeviceList(String parkId, int deviceType) {
		String uri = "/api/wec/GetDeviceList";
		DeviceParam param = new DeviceParam();
		param.setAppId(appId);
		param.setParkId(parkId);
		param.setTs(System.currentTimeMillis());
		param.setReqId(UUID.randomUUID().toString());
		param.setServiceCode("getDeviceList");
		param.setDeviceType(deviceType);
		param.setKey(SignUtils.paramsSign((JSONObject) JSON.toJSON(param), appSercert));

		Map<String, String> header = Maps.newHashMap();
		header.put("version", "1.0.0");
		String source = OkHttpRequestUtils.postJSONDebug(baseUrl + uri, header, JSON.toJSONString(param));
		return toResult(source);
	}

	/**
	 * 
	 * @param parkId  车场id
	 * @param plateNo 车牌号
	 * @param type  限制类型 1.禁入 2.禁出 3.禁止出入
	 * @param remark  备注
	 * @return
	 */
	public static ResultObj addCarBlackInfo(String parkId, String plateNo, int type, String remark) {
		String uri = "/api/blacklist/AddCarBlackInfo";
		BlacklistParam param = new BlacklistParam();
		param.setAppId(appId);
		param.setParkId(parkId);
		param.setTs(System.currentTimeMillis());
		param.setReqId(UUID.randomUUID().toString());
		param.setServiceCode("addCarBlackInfo");
		param.setPlateNo(plateNo);
		param.setRemark(remark);
		param.setKey(SignUtils.paramsSign((JSONObject) JSON.toJSON(param), appSercert));

		Map<String, String> header = Maps.newHashMap();
		header.put("version", "1.0.0");
		String source = OkHttpRequestUtils.postJSONDebug(baseUrl + uri, header, JSON.toJSONString(param));
		return toResult(source);
	}
	
	
	/**
	 * 查询黑名单列表
	 * @param parkId
	 * @param plateNo
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 */
	public static ResultObj queryCarBlackInfo(String parkId, String plateNo, Integer pageIndex, Integer pageSize) {
		String uri = "/api/blacklist/QueryCarBlackInfo";
		BlacklistParam param = new BlacklistParam();
		param.setAppId(appId);
		param.setParkId(parkId);
		param.setTs(System.currentTimeMillis());
		param.setReqId(UUID.randomUUID().toString());
		param.setServiceCode("queryCarBlackInfo");
		param.setPlateNo(plateNo);
		param.setPageIndex(pageIndex);
		param.setPageSize(pageSize);
		param.setKey(SignUtils.paramsSign((JSONObject) JSON.toJSON(param), appSercert));

		Map<String, String> header = Maps.newHashMap();
		header.put("version", "1.0.0");
		String source = OkHttpRequestUtils.postJSONDebug(baseUrl + uri, header, JSON.toJSONString(param));
		return toResult(source);
	}

	/**
	 * 科拓传回的字符串，处理方法
	 * 
	 * @param source
	 * @return
	 */
	private static ResultObj toResult(String source) {
		if (StringUtils.isNotBlank(source)) {
			System.out.println(source);
			ResultObj result = new ResultObj();
			JSONObject jsonObject = JSONObject.parseObject(source);
			Integer resCode = jsonObject.getInteger("resCode");
			String resMsg = jsonObject.getString("resMsg");
			result.setCode(resCode);
			result.setMessage(resMsg);
			if (0 == resCode) {
				// 成功
				JSONObject data = jsonObject.getJSONObject("data");
				result.setData(data);
			}
			return result;
		}
		return null;
	}

}
