Feature: Login Data Driven

  Scenario Outline: Login Data Driven
    Given User Launch browser
    And opens URL "https://tutorialsninja.com/demo/"
    When User navigate to MyAccount menu
    And click on Login
    And User enters Email as "<email>" and Password as "<password>"
    And Click on Login button
    Then User validates My Account heading
    ##And User clicks on Logout
    And User closes browser

    Examples: 
      | email                    | password   |
      | demo.devidas@gmail.com   | demo@12345 |
      | nileshtraining@gmail.com | mytest321  |
