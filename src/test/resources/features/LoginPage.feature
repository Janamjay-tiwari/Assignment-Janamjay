Feature: Login to Amazon.in 
 
Background: 
   Given User is on Amazon page "https://www.amazon.in/"

   @Sanity @Loginpage
   Scenario: Login with valid credentials
      
    Then I verify that page title is "<pageTitle>"

		When I click on sign in label
		Then I verify that login page opens
		
		When I enter "rajkumar15@gmail.com" in input field
		And I click on "continue" button
		And I enter "password" in input field
		And I click on "signIn" button
		Then I verify that login successfull and homepage display with "<pageTitle>"

  Examples:
  | pageTitle   |
  | Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in |
  
   @Sanity @InvalidCredentials @Loginpage
   Scenario Outline: Login with invalid credentials
    
    When I click on sign in label
		And I enter "<username1>" in input field
    And I click on "continue" button
    Then I verify that an error message display as "<errorMessage>"

		When I clear the "email" input field
		And I enter "<username2>" in input field
    And I click on "continue" button
    And I enter "password" in input field
    And I click on "signIn" button
    Then I verify that an error message display as "Your password is incorrect"
     
  Examples:
  | username1            | username2            | errorMessage                                      |
  | Admin                | rajkumar15@gmail.com | We cannot find an account with that email address |

   
   
   @Sanity @MissingUsername @Loginpage
   Scenario Outline: Login with blank username
      
    When I click on sign in label
		And I enter "" in input field
		And I click on "continue" button
    Then I verify that an error message display as "Enter your email or mobile phone number"

		When I enter "rajkumar15@gmail.com" in input field
    And I click on "continue" button
    And I enter "" in input field
    And I click on "signIn" button
    Then I verify that an error message display as "Enter your password"
          



