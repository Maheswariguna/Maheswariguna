package com.pageobjectmanager;

import com.baseclass.BaseClass;
import com.pageobjectmodel.LumaGearPageObjectModel;
import com.pageobjectmodel.LumaLoginPage;
import com.srcmainresources.LumaFileReaderManager;

public class LumaPageObjectManager extends BaseClass {
	public static LumaFileReaderManager fileReader;
	public static LumaLoginPage loginpage;
	public static LumaGearPageObjectModel gearpage;

	public LumaLoginPage getLoginpage() {
		if (loginpage == null) {
			loginpage = new LumaLoginPage(driver);
		}
		return loginpage;
	}

	public static LumaGearPageObjectModel getGearpage() {

		if (gearpage == null) {
			gearpage = new LumaGearPageObjectModel(driver);
		}
		return gearpage;

	}

	public LumaFileReaderManager getFileReader() {
		if (fileReader == null)
			fileReader = new LumaFileReaderManager();
		return fileReader;
	}
}