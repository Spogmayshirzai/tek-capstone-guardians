Feature: Sign in

Background:
 Given User is on retail website
    When User click on Sign in option

 @SignIn
  Scenario: Verify user can sign in into Retail Application
    And User enter email 'Spomay.shirzai@tekschool.us' and password 'Shirzai@7869916'
    And User click on login button
    Then User should be logged in into Account
    
    @createaccount
    Scenario Outline: Verify user can create an account into Retail Website
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name|email| password|confirmPassword|
      |Spogmay |Spomay.shirzaiza@tekschool.us|Shirzai@786991652|Shirzai@786991652|
    And User click on SignUp button
    Then User should be logged into account page