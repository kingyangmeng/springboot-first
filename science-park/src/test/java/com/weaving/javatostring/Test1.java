package com.weaving.javatostring;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;

public class Test1 {

	@Test
	public void test4() throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
//		User user = new User("123456", "zhangsan", "张三", "http://fafafnf.jpg", "0", "12344689578", "afasfasfa", 25.05, new Date(), 159875, false);
//		String string = gethello(user);
//		System.out.println(string);
	}

	public String gethello(Object obj) throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
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

	private String dateCoverToStr(Date date) {
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String string = format.format(date);
		return string.replace("-", "");
	}

	/**
	 * 32位加密
	 * 
	 * @param content
	 * @return
	 * @throws NoSuchAlgorithmException
	 */
	@SuppressWarnings("unused")
	private String getEncode32(String content) throws NoSuchAlgorithmException {
		MessageDigest digest = MessageDigest.getInstance("MD5");
		digest.update(content.getBytes());
		StringBuilder builder = new StringBuilder();
		for (byte b : digest.digest()) {
			builder.append(Integer.toHexString((b >> 4) & 0xf));
			builder.append(Integer.toHexString(b & 0xf));
		}
		return builder.toString();
	}

	@Test
	public void test22() {

		List<String> park = new ArrayList<>();
		park.add("113456");
		park.add("456789");
//		park.add("987456");

		String[] arrays = new String[3];
		for (int i = 0; i < park.size(); i++) {
			arrays[i] = park.get(i);
		}
		System.out.println(arrays);
		for (String string : arrays) {
			System.out.println(string);
		}
	}

	@Test
	public void test24() {
	}

}
