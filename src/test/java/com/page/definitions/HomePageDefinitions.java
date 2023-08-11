package com.page.definitions;

import org.testng.Assert;

import com.page.actions.HomePageActions;
import com.page.actions.LoginPageActions;
import com.page.utils.HelperClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HomePageDefinitions {

	
	LoginPageActions objLogin = new LoginPageActions();
	HomePageActions objHomePage = new HomePageActions();
	
	@Given("User is on Amazon website home page")
	public void loginTest() {

		HelperClass.openPage();
	}
	
	@Given("User is on Amazon page {string}")
	public void loginTest(String url) {

		HelperClass.openPage(url);
	}
	
	@Then("I verify that page title is {string}")
		public void verifyPageTitle(String expectedPageTitle) {
		String actualPageTitle = objHomePage.getPageTitle();
		Assert.assertEquals(actualPageTitle,expectedPageTitle);
	}
	
	@And("I verify that amazon logo is available on homepage")
	public void logoExistOnHomepage() {
		if(objHomePage.logoExist()) {
			Assert.assertTrue(true, "Amazon Logo is available");
		}else {
			Assert.assertTrue(false, "Amazon Logo is not available");
		}
	}

	@And("I verify that {string} is displayed on homepage")
	public void verifySignInLabel(String label) {

		// Verify "Hello, sign in" on home page
		Assert.assertTrue(objHomePage.getSignInText().contains("Hello"));

	}
	
	@When("I click on sign in label")
	public void clickSignInLabel() {
		objHomePage.clickOnSignInLabel();
	}

}
