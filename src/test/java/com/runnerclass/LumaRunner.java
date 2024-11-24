package com.runnerclass;

import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.pageobjectmanager.LumaPageObjectManager;

public class LumaRunner extends BaseClass {
	LumaPageObjectManager pom = new LumaPageObjectManager();

	@Test
	public void setup() {
		launchbrowser(pom.getFileReader().getDataProperty("loginbrowser"));
	}

	@Test
	public void logintest() {
		pom.getLoginpage().login();
	}
}