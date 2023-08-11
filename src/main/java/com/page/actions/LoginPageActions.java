package com.page.actions;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.page.locators.LoginPageLocators;
import com.page.utils.HelperClass;

public class LoginPageActions {
	
	LoginPageLocators loginPageLocators = null; 

	public LoginPageActions() {
		this.loginPageLocators = new LoginPageLocators();
		PageFactory.initElements(HelperClass.getDriver(),loginPageLocators);
	}
	// Get page heading
	public String getPageHeading() {
		return loginPageLocators.signInPageHeading.getText();
	}

	public void clickOnCreateNewAccountButton() {
		if(loginPageLocators.createNewAccountButton.isDisplayed() && loginPageLocators.createNewAccountButton.isEnabled()) {
			loginPageLocators.createNewAccountButton.click();
		}else {
			Assert.assertTrue(false, "Button is either not display or disabled");
		}
	}

	// Set email/password in text box
	public void setCredential(String credential) throws InterruptedException {
		if(loginPageLocators.email.isEnabled() && loginPageLocators.email.isDisplayed()) {
			loginPageLocators.email.sendKeys(credential);
			Thread.sleep(3000);
		}else if(loginPageLocators.password.isEnabled() && loginPageLocators.password.isDisplayed()) {
			loginPageLocators.password.sendKeys(credential);
			Thread.sleep(3000);
		}else {
			Assert.assertTrue(false, "Input field is either not display or disabled");
		}
	}

	// Click on login button
	public void clickOnButtonOnSignInPage(String buttonType) throws InterruptedException {
		switch (buttonType) {
		case "continue":
			loginPageLocators.continueButton.click();
			Thread.sleep(5000);
			break;
		case "signIn":
			loginPageLocators.signInButton.click();
			Thread.sleep(5000);
			break;
		default:
			Assert.assertTrue(false, "Button is either not display or disabled");
		}
	}

	// Get the Error Message
	public void getErrorMessage(String expectedErrorMessage) {
		switch (expectedErrorMessage) {
		case "We cannot find an account with that email address":
			String actualEmailErrorMessage = loginPageLocators.emailErrorMessage.getText().trim();
			Assert.assertEquals(actualEmailErrorMessage,expectedErrorMessage);
			break;
		case "Your password is incorrect":
			String actualPasswordErrorMessage = loginPageLocators.passwordErrorMessage.getText().trim();
			Assert.assertEquals(actualPasswordErrorMessage,expectedErrorMessage);
			break;
		case "Enter your email or mobile phone number":
			String actualBlankEmailErrorMessage = loginPageLocators.missingEmaillErrorMessage.getText().trim();
			Assert.assertEquals(actualBlankEmailErrorMessage,expectedErrorMessage);
			break;
		case "Enter your password":
			String actualBlankPasswordErrorMessage = loginPageLocators.missingPasswordlErrorMessage.getText().trim();
			Assert.assertEquals(actualBlankPasswordErrorMessage,expectedErrorMessage);
			break;
		default:
			Assert.assertTrue(false, "Error message is not available");
		}
	}

	public void clearTheInputField(String fieldName) {
		switch (fieldName) {
		case "email":
			loginPageLocators.email.clear();
			break;
		case "password":
			loginPageLocators.password.clear();
			break;
		default:
			Assert.assertTrue(false, "Input field is not available");
		}
	}

	

}
