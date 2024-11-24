package com.srcmainresources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.Assert;

public class LumaFileReaderManager {

	private static Properties property;
	private static FileInputStream fileinputstream;

	private static void setupProperty() {
		if (property == null) {
			File file = new File(
					"D:\\LumaProject\\LumaProject\\src\\main\\java\\com\\srcmainresources\\lumadata.properties");
			try {
				fileinputstream = new FileInputStream(file);
				property = new Properties();
				property.load(fileinputstream);
			} catch (FileNotFoundException e) {
				Assert.fail("ERROR IN LOADING FILE");
			} catch (Exception e) {
				Assert.fail("Error In Loading File");
			}
		}
	}

	public String getDataProperty(String dataValue) {
		setupProperty();
		String inputdata = property.getProperty(dataValue);
		return inputdata;
	}
}