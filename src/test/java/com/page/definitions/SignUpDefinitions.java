package com.page.definitions;

import org.testng.Assert;

import com.page.actions.HomePageActions;
import com.page.actions.LoginPageActions;
import com.page.actions.PhoneVerificationPageActions;
import com.page.actions.SignUpPageActions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpDefinitions {
	

	LoginPageActions objLogin = new LoginPageActions();
	HomePageActions objHomePage = new HomePageActions();
	SignUpPageActions objSignUp = new SignUpPageActions();
	PhoneVerificationPageActions objPhone = new PhoneVerificationPageActions();
	

	@When("I click on creat new account button")
	public void verfiySignupPage() {
		objLogin.clickOnCreateNewAccountButton();
	}
	
	@Then("I verify that Sign up page opens")
	public void verfiySignUpPage() {
		Assert.assertTrue(objSignUp.getPageHeading().contains("Create"));
	}
	
	@And("I verify that below input fields display")
	public void verifyInputFields(DataTable testData) throws Throwable{
		objSignUp.verifyAllInputFields(testData);
	}
	
	@When("I enter values in input fields")
	public void enterInputs(DataTable testData) throws Throwable {
		objSignUp.enterAllInputValues(testData);
	}
	
	@And("I click on Continue button")
	public void clickOnSubmitButton() {
		objSignUp.clickOnContinueButton();
	}
	
	@Then("I verify that next page opens and page title is {string}")
	public void verifyNumberVerificationPage(String expectedPageTitle) {
		String actualPageTitle = objPhone.getPageTitle();
		Assert.assertEquals(actualPageTitle,expectedPageTitle);
	}


}
