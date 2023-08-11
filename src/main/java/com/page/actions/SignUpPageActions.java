package com.page.actions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.page.locators.SignUpPageLocators;
import com.page.utils.HelperClass;


import io.cucumber.datatable.DataTable;

public class SignUpPageActions {
	
	SignUpPageLocators signUpPageLocators = null; 

	public SignUpPageActions() {
		this.signUpPageLocators = new SignUpPageLocators();
		PageFactory.initElements(HelperClass.getDriver(),signUpPageLocators);
	}
	
	// Get page heading
	public String getPageHeading() {
		return signUpPageLocators.signInPageHeading.getText();
	}

	public void verifyAllInputFields(DataTable testData) {

		List<String> details = testData.asList(String.class);
		boolean label_1 =  (signUpPageLocators.yourNameLabel.getText().trim()).equals(details.get(0).trim());
		boolean label_2 =  (signUpPageLocators.mobileNumberLabel.getText().trim()).equals(details.get(1).trim());
		boolean label_3 =  (signUpPageLocators.passwordLabel.getText().trim()).equals(details.get(2).trim());

		if(label_1 && label_2 && label_3) 
		{
			Assert.assertTrue(true, "All fields are displayed");
		}else {
			Assert.assertTrue(false, "fields are not displayed");
		}

	}
	
	public void enterAllInputValues(DataTable testData) throws Throwable {

		List<Map<String,String>> data = testData.asMaps(String.class,String.class);
		boolean label_1 =  signUpPageLocators.customerName.isEnabled();
		boolean label_2 =  signUpPageLocators.phoneNumber.isEnabled();
		boolean label_3 =  signUpPageLocators.password.isEnabled();

		if(label_1 && label_2 && label_3) {
			signUpPageLocators.customerName.sendKeys(data.get(0).get("Your name").trim());
			signUpPageLocators.phoneNumber.sendKeys(data.get(0).get("Mobile number").trim());
			signUpPageLocators.password.sendKeys(data.get(0).get("Password").trim());

			Assert.assertTrue(true, "All fields are Enabled & values are entered");
		}else {
			Assert.assertTrue(false, "fields are not enabled");
		}

	}	

	public void clickOnContinueButton() {
		if(signUpPageLocators.continueButton.isDisplayed() && signUpPageLocators.continueButton.isEnabled()) {
			signUpPageLocators.continueButton.click();
			try {
				Thread.sleep(50000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			Assert.assertTrue(false, "Button is not enabled");
		}
	}


}
