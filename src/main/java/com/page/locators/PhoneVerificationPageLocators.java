package com.page.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PhoneVerificationPageLocators {
	
	@FindBy(xpath = "//*[@id=\"authportal-main-section\"]//h1")
	public WebElement pageHeading;
	
	@FindBy(id = "auth-pv-enter-code")
	public WebElement otpTextfield;
	
	@FindBy(css = "#auth-verify-button")
	public WebElement createAccountButton;
	

}
