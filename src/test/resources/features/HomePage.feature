Feature: Amazon Homepage 
 
Background: 
   Given User is on Amazon website home page

   @Sanity1 @HomePage
   Scenario: Verify HomePage details
      
    Then I verify that page title is "<homePageTitle>"
		And I verify that amazon logo is available on homepage
		And I verify that "Hello, sign in" is displayed on homepage
		
		When I click on sign in label
		Then I verify that login page opens

  Examples:
  | homePageTitle   |
  | Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in |