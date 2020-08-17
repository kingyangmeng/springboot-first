package com.weaving.ketuo;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.alibaba.fastjson.JSON;
import com.weaving.common.ResultObj;
import com.weaving.thirdparty.ketuo.entry.result.DeviceList;
import com.weaving.thirdparty.ketuo.entry.result.ParkingLot;
import com.weaving.thirdparty.ketuo.entry.result.ParkingLotList;
import com.weaving.thirdparty.ketuo.util.KeTuoUtils;

/**
 * 对接测试接口
 * 
 * @author yang
 *
 */
public class UtilsTest {

	/**
	 * 获取停车场列表 parkId: 1039 , parkName: 测试啊啊啊啊啊 parkId: 2007 , parkName: 科拓大脑测试专用
	 * parkId: 592011251 , parkName: 统一接口测试车场1 parkId: 592011252 , parkName:
	 * 统一接口测试车场2 parkId: 592011253 , parkName: 统一接口测试车场3 parkId: 1001 , parkName:
	 * 速停车测试车场1001
	 */
	@Test
	public void getParkList() {
		ResultObj resultObj = KeTuoUtils.getParkList(1, 10);
		if (null != resultObj) {
			Object object = resultObj.getData();
			ParkingLotList parkingLotList = JSON.parseObject(object.toString(), ParkingLotList.class);
			List<ParkingLot> list = parkingLotList.getParkingList();
			for (ParkingLot parkingLot : list) {
				System.out.println("parkId: " + parkingLot.getParkId() + " , parkName: " + parkingLot.getParkName());
			}
			System.out.println(parkingLotList);
		}
	}

	/**
	 * 获取停车场信息
	 */
	@Test
	public void getParkingLotInfo() {
		String parkId = "592011251";
		ResultObj lotInfo = KeTuoUtils.getParkingLotInfo(parkId);
		Object object = lotInfo.getData();
		ParkingLot parkingLot = JSON.parseObject(object.toString(), ParkingLot.class);
		System.out.println(parkingLot);
	}

	/**
	 * 车场终端设备列表
	 */
	@Test
	public void getDeviceList() {
		String parkId = "592011253";
		ResultObj lotInfo = KeTuoUtils.getDeviceList(parkId, 1);
		System.out.println(lotInfo);
		Object object = lotInfo.getData();
		DeviceList deviceList = JSON.parseObject(object.toString(), DeviceList.class);
		System.out.println(deviceList);
	}

	/**
	 * 添加黑名单
	 * 
	 */
	@Test
	public void addCarBlackInfo() {
		String parkId = "592011253";
		ResultObj lotInfo = KeTuoUtils.addCarBlackInfo(parkId, "粤A85790", 3, "公安公布在逃车辆");
		System.out.println(lotInfo);
//		Object object = lotInfo.getData();
//		DeviceList deviceList = JSON.parseObject(object.toString(), DeviceList.class);
//		System.out.println(deviceList);
	}

	/**
	 * 黑名单列表,科拓未完成
	 */
	@Test
	public void queryCarBlackInfo() {
		String parkId = "592011253";
		ResultObj lotInfo = KeTuoUtils.queryCarBlackInfo(parkId, null, 0, 10);
		System.out.println(lotInfo);
//		Object object = lotInfo.getData();
//		DeviceList deviceList = JSON.parseObject(object.toString(), DeviceList.class);
//		System.out.println(deviceList);
	}

}
