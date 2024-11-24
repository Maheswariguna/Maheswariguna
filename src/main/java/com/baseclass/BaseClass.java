package com.baseclass;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseClass {

	public static WebDriver driver;

	protected static WebDriver launchbrowser(String browsername) {
		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
			} else if (browsername.equalsIgnoreCase("edge")) {
				driver = new EdgeDriver();
			}

		} catch (Exception e) {
			Assert.fail("ERROR:DURING LAUNCH BROWSER");

		}
		driver.manage().window().maximize();

		return driver;

	}

	protected static void launchurl(String url) {
		try {
			driver.get(url);

		} catch (Exception e) {
			Assert.fail();
		}
		Assert.fail("ERROR:OCCUR DURING URL LAUNCH");
	}

	protected static void clickelement(WebElement element) {
		try {
			element.click();

		} catch (Exception e) {
			Assert.fail("ERROR : OCCUR DURING CLICKING THE ELEMENT ");
		}

	}

	protected static void terminatebrowser() {
		try {
			driver.quit();
		} catch (Exception e) {
			Assert.fail("ERROR: OCCUR DURING TERMINATE BROWSER");
		}
	}

	protected static void passvalues(WebElement element, String value) {
		try {
			element.sendKeys(value);

		} catch (Exception e) {

		}
	}
	protected static void validate(String actual, String expected) {
		try {
			Assert.assertEquals(actual, expected);

		} catch (Exception e) {
			Assert.fail("ERROR: OCCUR DURING VALIDATION");
		}
	}

	
}