package com.weaving.common;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

public class LoadProperties {

	private static ResourceLoader resourceLoader = new DefaultResourceLoader();

	public Properties LoadProp(String path) throws IOException {
		InputStream inputStream = loadProperties(path);
		Properties properties = new Properties();
		properties.load(inputStream);
		return properties;
	}

	private InputStream loadProperties(String path) throws IOException {
		Resource resource = resourceLoader.getResource(path);
		InputStream inputStream = resource.getInputStream();
		return inputStream;
	}
}
