package com.page.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPageLocators {
	

	@FindBy(xpath = "//*[@id='authportal-main-section']//form//h1")
	public WebElement signInPageHeading;
	
	@FindBy(xpath = "//input[@id='ap_customer_name']")
	public WebElement customerName;
	
	@FindBy(xpath = "//input[@id='ap_phone_number']")
	public WebElement phoneNumber;
	
	@FindBy(xpath = "//input[@id='ap_password']")
	public WebElement password;
	
	@FindBy(id = "continue")
	public WebElement continueButton;
	
	@FindBy(xpath = "//form[@id='ap_register_form']/div/div/div[1]/label")
	public WebElement yourNameLabel;
	
	@FindBy(xpath = "//form[@id='ap_register_form']/div/div/div[2]/div/label")
	public WebElement mobileNumberLabel;
	
	@FindBy(xpath = "//label[@for='ap_password']")
	public WebElement passwordLabel;


}
