package com.weaving.service.business.platform.park;

import com.weaving.common.PageUtils;
import com.weaving.entry.business.platform.park.Park;

public interface ParkService {

	void add(String token, Park park) throws Exception;

	void sync(String parkId) throws Exception;

	PageUtils<Park> list(Park park, Integer pageNum, Integer pageSize) throws Exception;

	void update(Park park) throws Exception;

	Park getParkInfoById(String id) throws Exception;

}
