package com.weaving.common.utils;

import org.apache.commons.lang3.StringUtils;

/**
 * 层级工具
 * 
 * @author yang
 *
 */
public class LevelUtils {
	private final static String SEPARATOR = ".";

	private final static String ROOT = "0";

	/**
	 * 计算层级 0 0.1 0.1.2 0.1.2 0.4
	 * 
	 * @param parentLevel
	 * @param parentId
	 * @return
	 */
	public static String caculateLevel(String parentLevel, String parentId) {
		if (StringUtils.isBlank(parentId)) {
			return ROOT;
		} else {
			return StringUtils.join(parentLevel, SEPARATOR, parentId);
		}

	}

}
