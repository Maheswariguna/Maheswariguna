package com.interfaceelements;

public interface GearInterfaceElements {
	
	String gear_xpath = "(//*[@class='ui-menu-icon ui-icon ui-icon-carat-1-e'])[7]";
	String bag_xpath = "(//*[text()='Bags'])[1]";
	String overnightduffle_xpath = "(//a[@class='product-item-link'])[2]";
	String addtocart_xpath = "//*[text()='Add to Cart']";
	String shoppingcart_xpath = "//*[text() ='shopping cart']";
	String proceedtochkout_xpath = "(//*[text()='Proceed to Checkout'])[2]";
	String emailaddress_name = "username";
	String firstname_name = "firstname";
	String lastname_xpath = "(//input[@type='text'])[2]";
	String address_xpath = "(//input[@type='text'])[4]";
	String city_name = "city";
	String state_xpath = "(//select[@class='select'])[1]";
	String zipcode_name = "postcode";
	String country_xpath = "(//select[@class='select'])[2]";
	String phonenumber_name = "telephone";
	String shippingmethod_xpath = "(//input[@type='radio'])[1]";
	String next_xpath = "//*[text()='Next']";
	String placeorder_xpath = "//*[text()='Place Order']";
	String text_xpath = "//*[text()='Thank you for your purchase!']";
	
}
 