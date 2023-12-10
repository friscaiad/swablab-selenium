@checkout
Feature: About

  @about
  Scenario: As a user, I should be able to log in using correct registered data
    Given user navigate to url "https://www.saucedemo.com/"
    When user login using "standard user"
    * user click Burger button
    * user click About menu
    Then access about page successfully
    * user take screenshot "user-aboutPage-successfully"