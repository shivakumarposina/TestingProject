package com.orangehrm.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {

	static Properties prop;
	
	public static void initializePropertyFile() throws IOException {
		File file = new File("..\\newproject_maven\\resources\\testdata\\config.properties");

		FileInputStream fis = new FileInputStream(file);
		
		prop = new Properties();
		prop.load(fis);
	}	
	public static String readProperty(String key){
		return prop.getProperty(key);
		
	}
}