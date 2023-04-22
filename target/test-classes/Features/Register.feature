Feature: NopCommerce Register

  @Register
  Scenario: NopCommerce Register Test
    Given User is on register page and verify the Register page Title
    Then User Enter Their Details and Clicks Register Button
    And User is on Complete Registration page