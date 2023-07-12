package HelperClassesLayer;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadProperties {
	private static Properties prop;
	private static FileInputStream fis;
	private static String path = System.getProperty("user.dir") + "\\Resourses\\ApiConfig.properties";

	public String getProperty(String key) {

		prop = new Properties();

		try {
			 fis = new FileInputStream(path);
			prop.load(fis);

		} catch (Exception e) {

			e.printStackTrace();
		}
		return prop.getProperty(key);
	}
}
