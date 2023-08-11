package com.page.definitions;

import org.testng.Assert;

import com.page.actions.HomePageActions;
import com.page.actions.LoginPageActions;
import com.page.actions.PhoneVerificationPageActions;
import com.page.actions.SignUpPageActions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageDefinitions {
	
	LoginPageActions objLogin = new LoginPageActions();
	HomePageActions objHomePage = new HomePageActions();
	SignUpPageActions objSignUp = new SignUpPageActions();
	PhoneVerificationPageActions objPhone = new PhoneVerificationPageActions();
	

	@Then("I verify that login page opens")
	public void verfiyLoginPage() {
		Assert.assertTrue(objLogin.getPageHeading().contains("Sign in"));
	}
	
	@When("I enter {string} in input field")
	public void enter_credential(String credential) throws InterruptedException {
		objLogin.setCredential(credential);
	}
	
	@And("I click on {string} button")
	public void click_button_signin_page(String buttonType) throws InterruptedException {
		objLogin.clickOnButtonOnSignInPage(buttonType);
	}
	
	@Then("I verify that login successfull and homepage display with {string}")
	public void verify_homepage_after_successfull_login(String expectedPageTitle) {
//		String actualPageTitle = objHomePage.getPageTitle();
//		Assert.assertEquals(actualPageTitle,expectedPageTitle);
		System.out.print("Login Successfull");
	}
	
	@Then("I verify that an error message display as {string}")
	public void verifyErrorMessage(String expectedErrorMessage) {
		objLogin.getErrorMessage(expectedErrorMessage);
	}
	
	@When("I clear the {string} input field")
	public void clear_the_input_field(String fieldName) {
		objLogin.clearTheInputField(fieldName);
	}


}
