Feature: Amazon Signup Page 
 
Background: 
   Given User is on Amazon page "https://www.amazon.in/"

   @Sanity @SignUpPage
   Scenario: Verify Sign Up functionality
      
		When I click on sign in label
		Then I verify that login page opens
		
		When I click on creat new account button
		Then I verify that Sign up page opens
		And I verify that below input fields display
		  | Your name    |
      | Mobile number|
      | Password     |
      
     When I enter values in input fields
     | Your name | Mobile number | Password |
     | Test User | 9988776655    | Test@123 | 
     And I click on Continue button
     Then I verify that next page opens and page title is "<pageTitle>"
      
  Examples:
  | pageTitle   |
  | Amazon Phone Verification |