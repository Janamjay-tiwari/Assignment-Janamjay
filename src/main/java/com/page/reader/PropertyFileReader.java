package com.page.reader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {
	
	private static Properties properties = null;
	private static String browserName = null;

	static {
		FileReader file;
		properties = new Properties();
		
		try {
			file = new FileReader("src/test/resources/application.properties");
			properties.load(file);

		} catch (IOException e) {
		}
	}
	
	public static String getBrowserName() {
		browserName = properties.getProperty("browser.name");
		return browserName;
	}

	public static String getUrl() {
		return properties.getProperty("site.url");
	}


}
