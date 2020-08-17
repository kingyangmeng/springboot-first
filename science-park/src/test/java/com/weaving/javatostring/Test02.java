package com.weaving.javatostring;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.jupiter.api.Test;

/**
 * 计费规则
 * 
 * @author yang
 *
 */
public class Test02 {

	/**
	 * 最新计算日期
	 * 
	 * 分段的方式：中间循环 。 开始时间-（夜间开始-白天开始）-结束时间
	 * 
	 * @throws ParseException
	 */
	@Test
	public void test3() throws ParseException {
		// 保存所以时间节点
		List<Date> costDate = new ArrayList<>();
		String startNight = "02:00:00"; // 优惠开始时间
//		String endNight = "04:00:00"; // 优惠结束时间
		Double timeLength = 4.50;// 优惠时长
		Double noLength = 24 - timeLength;// 费优惠时长
		String inTime = "2020-08-20 02:00:00"; // 进入时间
		String endTime = "2020-08-25 06:00:00";// 离开时间

		// 出去时间
		Date endDate = covet(endTime);
		// 进入时间
		Date inDate = covet(inTime);
		// 保存进入时间
		costDate.add(inDate);
		Calendar calendarIn = Calendar.getInstance();
		calendarIn.setTime(inDate);
		// 计算相差天数
		Long day = (endDate.getTime() - inDate.getTime()) / 1000 / 24 / 3600;
		for (int i = 1; i <= day + 2; i++) {
			int year = calendarIn.get(Calendar.YEAR);
			int month = calendarIn.get(Calendar.MONTH) + 1;
			int date = calendarIn.get(Calendar.DATE);
			String inday = year + "-" + month + "-" + date + " " + startNight;
			Date nightStart = covet(inday);

			long endDay = (long) (nightStart.getTime() + timeLength * 3600 * 1000);
			Date nightEnd = new Date(endDay);
			// 保存
			if (!(nightStart.getTime() < inDate.getTime() || nightStart.getTime() > endDate.getTime())) {
				costDate.add(nightStart);
			}
			// 保存
			if (!(nightEnd.getTime() < inDate.getTime() || nightEnd.getTime() > endDate.getTime())) {
				costDate.add(nightEnd);
			}
			// 非优惠时间段
			Long endL = (long) (nightEnd.getTime() + noLength * 3600 * 1000);
			Date endT = new Date(endL);
			calendarIn.setTime(endT);
		}

		// 保存出去时间
		costDate.add(endDate);
		// 排序
		List<Date> list = getd(costDate);
		// 去除重复
		List<Date> covet = removeDuplicate(list);

		Map<Date, List<Date>> map = new LinkedHashMap<>();

		for (int i = 0; i < covet.size(); i++) {
			List<Date> groupList = new ArrayList<Date>();
			groupList.add(covet.get(i));
			if (i + 1 < covet.size()) {
				groupList.add(covet.get(i + 1));
				map.put(covet.get(i), groupList);
			}

		}

		Double m = countM(map, startNight, timeLength);
		System.out.println("=========需付费：" + m + " 元=============");

	}

	/**
	 * 
	 * @param map
	 * @param startNight
	 * @param timeLength 优惠时长
	 * @return
	 * @throws ParseException
	 */
	private Double countM(Map<Date, List<Date>> map, String startNight, Double timeLength) throws ParseException {

		Double count = 0.00;
		Double min = 1.00;
		Double max = 2.00;

		Set<Entry<Date, List<Date>>> entrySet = map.entrySet();
		for (Entry<Date, List<Date>> entry : entrySet) {
			Date key = entry.getKey();
			List<Date> value = entry.getValue();
			// ------------------------
			/**
			 * 便利获取每个时间，判断是否在优惠时间内 优惠开始时间确定，优惠时长确定，可以计算优惠结束时间
			 */
			Date curDay = key;// 要判断的时间
			Calendar instance = Calendar.getInstance();
			instance.setTime(curDay);

			int year = instance.get(Calendar.YEAR);
			int month = instance.get(Calendar.MONTH) + 1;
			int date = instance.get(Calendar.DATE);

			String inday = year + "-" + month + "-" + date + " " + startNight;
			Date nightStart = covet(inday);// 优惠开始

			long endDay = (long) (nightStart.getTime() + timeLength * 3600 * 1000);
			Date nightEnd = new Date(endDay);// 优惠结束

//			System.out.println(value.get(0));
			// 时间差（分钟）
			Long m = (value.get(1).getTime() - value.get(0).getTime()) / 1000 / 60;

			// 计算30分钟数量
			Long i = (m / 30);
			Long j = (m % 30);
			if (j != 0) {
				i = i + 1;
			}
//			System.out.println("相差： " + m + " 分钟");
//			System.out.println("共有： " + i + " 个半小时");

			// “要判断的时间”<“优惠开始” 正常收费
			if (curDay.getTime() < nightStart.getTime()) {
//				System.out.println("“要判断的时间”<“优惠开始”==正常收费 5.0");
				count = count + max * i;
			} else if (curDay.getTime() >= nightEnd.getTime()) {
				// “要判断的时间”>=“优惠结束” 正常收费
//				System.out.println("“要判断的时间”>“优惠结束”==正常收费 5.0");
				count = count + max * i;
			} else {
				// “优惠结束时间”>“要判断的时间”=>“优惠开始” 优惠收费
//				System.out.println("“优惠结束时间”>“要判断的时间”=>“优惠开始”==优惠收费 3.0");
				count = count + min * i;
			}
//			System.out.println(value.get(1));
			// ------------------------

		}

		return count;

	}

	/**
	 * 日期+时间=新的日期
	 * 
	 * @throws ParseException
	 */
	@Test
	public void test5() throws ParseException {
		String inTime = "2020-08-06 09:09:00"; // 进入时间
		Date inDate = covet(inTime);
		Calendar calendarIn = Calendar.getInstance();
		calendarIn.setTime(inDate);
		System.out.println("旧的日期： " + calendarIn.getTime());

		long time = (calendarIn.getTime().getTime()) / 1000;
		Long day = time + (10 * 24 * 3600 + 60);
		Date date = new Date(day * 1000);
		calendarIn.setTime(date);

		System.out.println("新的日期： " + calendarIn.getTime());
	}

	@Test
	public void test6() throws ParseException {
		String startNight = "21:00:00"; // 优惠开始时间
		Date startNig = covetShort(startNight);

		Calendar instance = Calendar.getInstance();
		instance.setTime(startNig);
		int hour = instance.get(Calendar.HOUR_OF_DAY);// 时
		int minute = instance.get(Calendar.MINUTE);// 分
		int second = instance.get(Calendar.SECOND);// 秒
		// 时间段开始
		Long s = (long) (hour * 60 * 60 + minute * 60 + second);

		System.out.println(s);
	}

	/**
	 * list排序
	 * 
	 * @param dateList
	 * @return
	 */
	private static List<Date> getd(List<Date> dateList) {
		dateList.sort((a1, a2) -> {
			return a1.compareTo(a2);
		});
		return dateList;
	}

	/**
	 * 去除重复
	 * 
	 * @param list
	 * @return
	 */
	public static List<Date> removeDuplicate(List<Date> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = list.size() - 1; j > i; j--) {
				if (list.get(j).equals(list.get(i))) {
					list.remove(j);
				}
			}
		}
		return list;
	}

	/**
	 * 日期转换
	 * 
	 * @param time
	 * @return
	 * @throws ParseException
	 */
	private Date covet(String time) throws ParseException {
		SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = simple.parse(time);
		return date;

	}

	/**
	 * 日期转换，只保留时间
	 * 
	 * @param time
	 * @return
	 * @throws ParseException
	 */
	private Date covetShort(String time) throws ParseException {
		SimpleDateFormat simple = new SimpleDateFormat("HH:mm:ss");
		Date date = simple.parse(time);
		return date;

	}
}
