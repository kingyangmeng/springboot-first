package com.weaving.service.business.platform.device;

import com.weaving.common.PageUtils;
import com.weaving.entry.business.platform.device.Device;
import com.weaving.entry.business.platform.park.Park;
import com.weaving.entry.sys.user.User;

public interface DeviceService {

	PageUtils<Device> list(Device device, Integer pageNum, Integer pageSize)throws Exception;

	void add(User user, Park park)throws Exception;

}
