package com.weaving.common;

import java.io.IOException;
import java.util.Properties;


public class Global {
	
	public static String getConfig(String key) {
		String value = null;
		try {
			LoadProperties loader = new LoadProperties();
			Properties prop = loader.LoadProp("config.properties");
			value = prop.getProperty(key);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}


}
