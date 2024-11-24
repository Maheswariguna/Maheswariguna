package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;
import com.interfaceelements.LumaLoginInterfaceElements;
import com.srcmainresources.LumaFileReaderManager;

public class LumaLoginPage extends BaseClass implements LumaLoginInterfaceElements {

	public LumaLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = signin_xpath)
	private WebElement signIn;
	@FindBy(name = username_name)
	private WebElement userName;
	@FindBy(name = password_name)
	private WebElement passWord;
	@FindBy(xpath = login_xpath)
	private WebElement login;

	public void login() {
		LumaFileReaderManager data = new LumaFileReaderManager();
		launchurl(data.getDataProperty("loginurl"));
//		launchurl(data.getDataProperty("loginurl"));
		clickelement(signIn);
		passvalues(userName, data.getDataProperty("username"));
		passvalues(passWord, data.getDataProperty("password"));
		clickelement(login);

	}

}
