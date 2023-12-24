Feature: Verify the URL opens in Chrome Browser
  Scenario: Validate Demo Blaze website URL is working on chrome browser
    Given Browser is open
    And User is on google serach page
    When User enters the Url in search box "https://www.demoblaze.com/"
    Then user is navigated to search results
    Then page title wil be "Store"
    
