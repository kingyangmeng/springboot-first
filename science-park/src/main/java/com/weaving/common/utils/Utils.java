package com.weaving.common.utils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import sun.misc.BASE64Encoder;

/**
 * 一般常用的工具
 * 
 * @author yang
 *
 */
@SuppressWarnings("restriction")
public class Utils {

	/**
	 * 获取不带”-“的UUID
	 * 
	 * @return
	 */
	public static String getUUID() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}

	/**
	 * 数字UUID
	 * 
	 * @return
	 */
	public static String getNumUUID() {
		Integer orderId = UUID.randomUUID().toString().hashCode();
		orderId = orderId < 0 ? -orderId : orderId; // String.hashCode() 值会为空
		return orderId.toString();
	}

	/**
	 * 获取token
	 * 
	 * @return
	 */
	public static String getToken(String userId) {
		try {
			MessageDigest md = MessageDigest.getInstance("md5");
			byte md5[] = md.digest(userId.getBytes());
			// base64编码--任意二进制编码明文字符
			BASE64Encoder encoder = new BASE64Encoder();
			return encoder.encode(md5);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 获取实例化对象的所有属性值，拼接为字符串
	 * 
	 * @param obj
	 * @return
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	public static String getKey(Object obj) throws NoSuchMethodException, SecurityException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<? extends Object> class1 = obj.getClass();
		// 获取全部属性
		Field[] fields = class1.getDeclaredFields();
		StringBuffer string = new StringBuffer();
		for (int i = 0; i < fields.length; i++) {
			// 获取属性名称
			String fieldName = fields[i].getName();
			// 创建get方法
			String name = fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);

			Method m = obj.getClass().getMethod("get" + name);
			// 调用getter方法获取属性值
			Object value = m.invoke(obj);

			if (null != value) {
				if (value.getClass().toString().equals("class java.util.Date")) {
					Date date = (Date) value;
					String str = dateCoverToStr(date);
					string.append(str);
				} else {
					string.append(value);
				}
			}

		}
		return string.toString();
	}

	/**
	 * 32位加密
	 * 
	 * @param content
	 * @return
	 * @throws NoSuchAlgorithmException
	 */
	public static String getEncode32(String content) throws NoSuchAlgorithmException {
		MessageDigest digest = MessageDigest.getInstance("MD5");
		digest.update(content.getBytes());
		StringBuilder builder = new StringBuilder();
		for (byte b : digest.digest()) {
			builder.append(Integer.toHexString((b >> 4) & 0xf));
			builder.append(Integer.toHexString(b & 0xf));
		}
		return builder.toString();
	}

	/**
	 * 
	 * @param date
	 * @return eg：20200724
	 */
	private static String dateCoverToStr(Date date) {
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String string = format.format(date);
		return string.replace("-", "");
	}

}
