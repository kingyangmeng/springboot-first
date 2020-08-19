package com.weaving.service.business.platform.park.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.weaving.common.PageUtils;
import com.weaving.common.RedisUtils;
import com.weaving.common.utils.Utils;
import com.weaving.dao.business.platform.park.ParkDao;
import com.weaving.entry.business.platform.park.Park;
import com.weaving.entry.business.platform.rule.Rule;
import com.weaving.entry.sys.user.User;
import com.weaving.service.business.platform.device.DeviceService;
import com.weaving.service.business.platform.park.ParkService;
import com.weaving.service.business.platform.rule.RuleService;

@Service
@Transactional
public class ParkServiceImpl implements ParkService {

	@Autowired
	private RedisUtils redisUtils;

	@Autowired
	private ParkDao parkDao;

	@Autowired
	private DeviceService deviceService;

	@Autowired
	private RuleService ruleService;

	@Override
	public PageUtils<Park> list(Park park, Integer pageNum, Integer pageSize) throws Exception {
		Integer index = pageSize * (pageNum - 1);
		Integer num = pageSize;

		park.setIndex(index);
		park.setNum(num);

		if (null != park.getArea() && park.getArea().size() > 0) {
			String[] arrays = new String[3];
			for (int i = 0; i < park.getArea().size(); i++) {
				arrays[i] = park.getArea().get(i);
			}
			park.setProvince(arrays[0]);
			park.setCity(arrays[1]);
			park.setDistrict(arrays[2]);
		}

		List<Park> list = parkDao.list(park);
		for (Park p : list) {
			List<String> areList = new ArrayList<String>();
			areList.add(p.getProvince());
			areList.add(p.getCity());
			areList.add(p.getDistrict());
			p.setArea(areList);
		}

		Integer count = parkDao.count(park);
		PageUtils<Park> page = new PageUtils<Park>(pageNum, pageSize, count, list);
		return page;
	}

	@Override
	public void add(String token, Park park) throws Exception {
		User user = (User) redisUtils.get(token);
		park.setId(Utils.getNumUUID());
		park.setCreateDate(new Date());
		park.setCreateBy(user.getId());
		park.setDeptId(user.getDeptId());

		// 添加停车场信息
		if (null != park.getArea() && park.getArea().size() > 0) {
			String[] arrays = new String[3];
			for (int i = 0; i < park.getArea().size(); i++) {
				arrays[i] = park.getArea().get(i);
			}
			park.setProvince(arrays[0]);
			park.setCity(arrays[1]);
			park.setDistrict(arrays[2]);
		}
		// 保存停车场信息
		parkDao.add(park);

//		// 保存计费规则
//		Rule rule = park.getRule();
//		rule.setParkId(park.getId());
//		ruleService.add(rule);

		// 添加停车场信息时，将停车场设备列表查询出来，然后添加到数据库里
		deviceService.add(user, park);
	}

	@Override
	public void sync(String parkId) throws Exception {
		// TODO 先查询出appId ，key，然后同步第三方，获取信息，更新到数据库
		Park parkInfo = parkDao.getParkByParkId(parkId);

		parkDao.update(parkInfo);
	}

	@Override
	public void update(Park park) throws Exception {
		parkDao.update(park);
	}

	@Override
	public Park getParkInfoById(String id) throws Exception {
		Park park = parkDao.getParkById(id);
		// 地区转换
		convDate(park);
		if (StringUtils.isNotBlank(park.getId())) {
			Rule rule = ruleService.getRuleByParkId(park.getId());
			List<String> date = new ArrayList<String>();
			date.add(rule.getNightStartDate());
			date.add(rule.getNightEndDate());
			rule.setDate(date);
			park.setRule(rule);
		}
		return park;
	}

	private void convDate(Park park) {
		List<String> areList = new ArrayList<String>();
		areList.add(park.getProvince());
		areList.add(park.getCity());
		areList.add(park.getDistrict());
		park.setArea(areList);
	}

}
