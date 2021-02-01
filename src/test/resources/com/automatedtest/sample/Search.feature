Feature: Use the website to find restaurants
  So that I can order food 
  As a hungry customer
  I want to be able to find restaurants in my area

  @search @search_01
  Scenario: Search for restaurants in an area
    Given I want food in "AR51 1AA"
    When I search for restaurants
    Then I should see some restaurants in "AR51 1AA"
  
  @search @search_02
  Scenario: Search for restaurants in an area with invalid post code
    Given I want food in "AR51"
    When I search for restaurants
    Then I should see error message "Please enter a full, valid postcode"

  @search @search_03
  Scenario: Search for restaurants without post code
    Given I want food in ""
    When I search for restaurants
    Then I should see error message "Please enter a postcode"