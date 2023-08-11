package com.page.actions;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.page.locators.PhoneVerificationPageLocators;
import com.page.utils.HelperClass;

public class PhoneVerificationPageActions {
	
	
	PhoneVerificationPageLocators phoneVerificationPageLocators = null; 

	public PhoneVerificationPageActions() {
		this.phoneVerificationPageLocators = new PhoneVerificationPageLocators();
		PageFactory.initElements(HelperClass.getDriver(),phoneVerificationPageLocators);
	}
	
	// Get page heading
	public String getPageHeading() {
		return phoneVerificationPageLocators.pageHeading.getText();
	}

	public void clickOnContinuetButton() {
		if(phoneVerificationPageLocators.createAccountButton.isDisplayed() && phoneVerificationPageLocators.createAccountButton.isEnabled()) {
			phoneVerificationPageLocators.createAccountButton.click();
		}else {
			Assert.assertTrue(false, "Button is either not display or disabled");
		}
	}

	//Getting page title
		public String getPageTitle() {
			return HelperClass.getDriver().getTitle();
		}


}
