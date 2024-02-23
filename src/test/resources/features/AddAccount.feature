@AddAccountFeature
Feature: Add account Functionality Validation

  Scenario: User should be able to login and add account
    Given User is on codefios login page
    When User enters username as "demo@codefios.com"
    When User enters password as "abc123"
    When User clicks on sign in button
   
    Then User should be landing  on dashboard page
    When User clicks on Account List link
    
    Then User should be landing on Account List page
    When User clicks on Add Account button
    When User enters Account name as " My Test Account"
    When User enters description as "New Account"
    When User enters intial balance as "5000"
    When User enters account Number as "987654"
    When User enters contact Person as "Account Holder"
    When User clicks on save button
    Then User should be able to see account added alert
