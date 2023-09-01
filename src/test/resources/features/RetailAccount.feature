Feature: Retail Account page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'Spomay.shirzai@tekschool.us' and password 'Shirzai@7869916'
    And User click on login button
    And User should be logged in into Account
    When User click on Account option

  @userInfoUpdate
  Scenario: Verify User can update Profile Information
    And User update Name 'Elenenaaziry' and Phone '5005050555'
    And User click on Update button
    Then user profile information should be updated

  @userAddPaymentMethod
  Scenario: Verify User can add a payment method
    And User click on Add a payment method link
    And User fill Debit or credit card information
      |cardNumber| nameOnCard |expirationMonth|expirationYear|securityCode|
      | 2828828288274565| Alpha|12 |2020 |299|
    And User click on Add your card button
    Then a message should be displayed 'Payment Method added successfully'

  @userUpdatesTheCreditDebitCard
  Scenario: Verify User can edit Debit or Credit card
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 0000000344750400 | spogmy     |               7 |           2029 |          354 |
    And user click on Update Your Card button
    Then a message should be displayed 'Payment Method updated Successfully'

  @removeCard
  Scenario: Verify User can remove Debit or Credit card
    And User click on remove option of card section
    Then payment details should be removed

  @userAddAddress
  Scenario: Verify User can add an Address
    And User click on Add address option
    And user fill new address form with below information
      | country| fullName | phoneNumber| streetAddress| apt| city| state| zipCode|
      | countryValue | fullnameValue | PhoneValue  | stAddress     | aptValue | cityValue| stateValue | zipCodeValue |
    And User click Add Your Address button
    Then the message should be displayed 'Address Added Successfully'

  @userEditAddress
  Scenario: Verify User can edit an Address added on account
    And User click on edit address option
    And User fill new address form with below information
      | country | fullName   | phoneNumber | streetAddress | apt | city | state      | zipCode |
      | Croatia | Jonh Smith |  2020232030 |          2020 | 300 | LA   | California |   30309 |
    And User click update Your Address button
    Then message should be displayed 'Address Updated Successfully'

  @removeAddress
  Scenario: Verify User can remove Address from Account
    And User click on remove option of Address section
    Then Address details should be removed
