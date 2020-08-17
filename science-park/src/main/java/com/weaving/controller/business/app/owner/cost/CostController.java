package com.weaving.controller.business.app.owner.cost;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weaving.common.DefinitionException;
import com.weaving.common.ResultObj;
import com.weaving.entry.business.platform.rule.Rule;
import com.weaving.service.business.platform.rule.RuleService;

/**
 * 计算费用
 * 
 * @author yang
 *
 */
@RestController
@RequestMapping("/business/app/owner")
@Scope("prototype")
public class CostController {

	@Autowired
	private RuleService ruleService;

	/**
	 * 根据车牌号码计算收费
	 * 
	 * @param carNumber //车牌号码
	 * @param parkId    //停车场
	 * @param inTime    //进入时间 String in = "2020-08-06 09:00:00";
	 * @param outTime   //离开时间 String out = "2020-08-09 13:00:00";
	 * 
	 * @return
	 */
	@GetMapping("/cost")
	public ResultObj cost(String carNumber, String parkId, String inTime, String outTime) {
		ResultObj result = new ResultObj();
		// 1.查询出车辆所在的车场
		// 2.查询车场的计费规则
		// 3.查询车辆的停车开始、结束时间
		// 4.计算停车费
		try {
			
			
			Rule rule = ruleService.getRuleByParkId(parkId);
			String nightStartDate = rule.getNightStartDate();
			String nightEndDate = rule.getNightEndDate();
			Date in = covet(inTime);
			Date out = covet(outTime);
			// 两个时间之间相差的分钟数
			Long m = (out.getTime() - in.getTime()) / (1000 * 60);
			// 如果分钟数小于等于15分钟，直接放行
			if (15 <= m) {
				result.setMessage("不足15分钟，免费放行");
				result.setData(0);
				return result;
			} else {
				
			}

		} catch (Exception e) {
			throw new DefinitionException("系统异常...");
		}
		return null;
	}

	private Date covet(String time) throws ParseException {
		SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		Date date = simple.parse(time);
		return date;

	}

}
