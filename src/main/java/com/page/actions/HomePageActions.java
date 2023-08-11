package com.page.actions;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.page.locators.HomePageLocators;
import com.page.locators.LoginPageLocators;
import com.page.utils.HelperClass;

public class HomePageActions {
	
	HomePageLocators homePageLocators = null;
	LoginPageLocators locators = null;

	public HomePageActions() {
		this.homePageLocators = new HomePageLocators();

		PageFactory.initElements(HelperClass.getDriver(),homePageLocators);
	}
	
	//Getting page title
	public String getPageTitle() {
		return HelperClass.getDriver().getTitle();
	}
	
	//Checking Logo existence on homepage
	public boolean logoExist() {
		return homePageLocators.logo.isDisplayed();
	}
	
	//Checking Sign in label
	public String getSignInText() {
		return homePageLocators.signInLabel.getText();
	}
	
	//Click on Sign In label
	public void clickOnSignInLabel() {
		if(homePageLocators.signInLabel.isDisplayed() && homePageLocators.signInLabel.isEnabled()) {
		homePageLocators.signInLabel.click();
		}else {
			Assert.assertTrue(false, "Label is either not display or disabled");
		}
	}


}
