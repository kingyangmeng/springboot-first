package com.weaving.service.business.platform.device.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.weaving.common.PageUtils;
import com.weaving.common.ResultObj;
import com.weaving.common.utils.Utils;
import com.weaving.dao.business.platform.device.DeviceDao;
import com.weaving.entry.business.platform.device.Device;
import com.weaving.entry.business.platform.park.Park;
import com.weaving.entry.sys.user.User;
import com.weaving.service.business.platform.device.DeviceService;
import com.weaving.thirdparty.ketuo.entry.result.DeviceKetuo;
import com.weaving.thirdparty.ketuo.entry.result.DeviceList;
import com.weaving.thirdparty.ketuo.util.KeTuoUtils;

@Service
@Transactional
public class DeviceServiceImpl implements DeviceService {

	@Autowired
	private DeviceDao deviceDao;

	@Override
	public PageUtils<Device> list(Device device, Integer pageNum, Integer pageSize) throws Exception{

		Integer index = pageSize * (pageNum - 1);
		Integer num = pageSize;

		device.setIndex(index);
		device.setNum(num);

		List<Device> list = deviceDao.list(device);
		Integer count = deviceDao.count(device);
		PageUtils<Device> page = new PageUtils<Device>(pageNum, pageSize, count, list);
		return page;
	}

	@Override
	public void add(User user, Park park) throws Exception{
		//查询出停车场设备列表
		ResultObj lotInfo = KeTuoUtils.getDeviceList(park.getParkId(), 0);
		Object object = lotInfo.getData();
		DeviceList deviceList = JSON.parseObject(object.toString(), DeviceList.class);
		List<DeviceKetuo> list = deviceList.getDeviceList();
		Device device = new Device();
		for(DeviceKetuo d : list) {
			device.setId(Utils.getNumUUID());
			device.setDeptId(user.getDeptId());
			device.setProvince(park.getProvince());
			device.setCity(park.getCity());
			device.setDistrict(park.getDistrict());
			device.setAddress(park.getAddress());
			device.setParkId(park.getParkId());
			device.setParkName(park.getParkName());
			device.setDeviceType(d.getDeviceType().toString());
			device.setDeviceName(d.getDeviceName());
			device.setDeviceIP(d.getDeviceIp());
			device.setDeviceCode(d.getDeviceCode());
			device.setDeviceStatus("0");
			deviceDao.add(device);
		}
	}

}
