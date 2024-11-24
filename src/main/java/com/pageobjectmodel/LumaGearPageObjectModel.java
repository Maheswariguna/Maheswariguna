package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;
import com.interfaceelements.GearInterfaceElements;

public class LumaGearPageObjectModel extends BaseClass implements GearInterfaceElements {
	
	@FindBy(xpath = gear_xpath)
	private WebElement gear;
	@FindBy(xpath = bag_xpath)
	private WebElement bag;
	@FindBy(xpath = overnightduffle_xpath)
	private WebElement overnightduffle;
	@FindBy(xpath = addtocart_xpath)
	private WebElement addtocart;
	@FindBy(xpath = shoppingcart_xpath)
	private WebElement shoppingcart;
	@FindBy(xpath = proceedtochkout_xpath)
	private WebElement checkout;
	@FindBy(name = emailaddress_name)
	private WebElement emailaddress;
	@FindBy(name = firstname_name)
	private WebElement firstname;
	@FindBy(xpath = lastname_xpath)
	private WebElement lastname;
	@FindBy(xpath = address_xpath)
	private WebElement address;
	@FindBy(name = city_name)
	private WebElement city;
	@FindBy(xpath = state_xpath)
	private WebElement state;
	@FindBy(name = zipcode_name)
	private WebElement zipcode;
	@FindBy(xpath = country_xpath)
	private WebElement country;
	@FindBy(name = phonenumber_name)
	private WebElement phonenumber;
	@FindBy(xpath = shippingmethod_xpath)
	private WebElement shipping;
	@FindBy(xpath = next_xpath)
    private WebElement next;
	@FindBy(xpath = placeorder_xpath)
	private WebElement placeorder;
	@FindBy(xpath =  text_xpath)
	private WebElement text;
	public LumaGearPageObjectModel(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}

	
	
