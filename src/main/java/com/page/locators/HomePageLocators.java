package com.page.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {

	@FindBy(id="twotabsearchtextbox")
	public WebElement searchBox;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	public WebElement searchButton;
	
	@FindBy(css = "#nav-logo-sprites")
	public WebElement logo;
	
	@FindBy(xpath = "//span[text()='Hello, sign in']")
	public WebElement signInLabel;
	
	@FindBy(xpath = "//*[@id='nav-flyout-ya-signin']/a/span")
	public WebElement signInButton;

}
