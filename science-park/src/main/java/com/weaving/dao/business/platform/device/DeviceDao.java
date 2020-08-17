package com.weaving.dao.business.platform.device;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.weaving.entry.business.platform.device.Device;

@Mapper
public interface DeviceDao {

	List<Device> list(Device device)throws Exception;

	Integer count(Device device)throws Exception;

	void add(Device device)throws Exception;

}
