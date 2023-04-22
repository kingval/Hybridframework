Feature: NopCommerce Login

  @Register
  Scenario: NopCommerce Register Test
    Given User is on Login page and verify the Login page Title
    Then User Enter Their Details and Clicks Login Button
    And User is on Nopcommerce Homepage