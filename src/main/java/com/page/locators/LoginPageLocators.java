package com.page.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {

	@FindBy(id = "ap_email")
	public WebElement email;
	
	@FindBy(id = "continue")
	public WebElement continueButton;
	
	@FindBy(name = "password")
	public WebElement password;
	
	@FindBy(xpath = "//input[@id='signInSubmit']")
	public WebElement signInButton;

	@FindBy(xpath = "//*[@id='auth-email-missing-alert']")
	public WebElement missingEmaillErrorMessage;
	
	@FindBy(xpath = "//*[@id='auth-password-missing-alert']")
	public WebElement missingPasswordlErrorMessage;

	@FindBy(xpath = "//span[contains(text(),'Your password')]")
	public  WebElement passwordErrorMessage;
	
	@FindBy(xpath = "//span[contains(text(),'We cannot find')]")
	public  WebElement emailErrorMessage;
	
	@FindBy(xpath = "//*[@id='authportal-main-section']//form//h1")
	public WebElement signInPageHeading;
	
	@FindBy(id = "createAccountSubmit")
	public WebElement createNewAccountButton;
	
	

	
}
