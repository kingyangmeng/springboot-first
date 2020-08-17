package com.weaving.dao.business.platform.park;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.weaving.entry.business.platform.park.Park;

@Mapper
public interface ParkDao {

	List<Park> list(Park park)throws Exception;
	
	Integer count(Park park)throws Exception;
	
	void add(Park park)throws Exception;

	void update(Park parkInfo)throws Exception;
	
	Park getParkByParkId(String parkId)throws Exception;

	Park getParkById(String id)throws Exception;


}
