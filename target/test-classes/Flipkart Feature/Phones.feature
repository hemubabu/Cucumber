Feature: Flipkart phones feature
  I want to use this template for my feature file

  #Background: Launch Scenario
  #Given User launches the app
  #And User quit the buton
  @sanity
  Scenario: Phone Validation scenario in list
    Given User quit the buton
    When User enters the mobile name with one dim list
      | Apple iphone | OPPO | SAMSUNG |
    Then User validates the mobile name

  Scenario: TV Validation scenario
    Given User quit the buton
    When User enters the TV names with one dim map
      | Key | value   |
      | TV1 | SONY    |
      | TV2 | LG      |
      | TV3 | SAMSUNG |
    Then User validates the TV name

  @regression
  Scenario Outline: Outline validation of all Scenarios
    Given User quit the buton
    When User enters the phone names in Scenario Outline "<Phones>"
    Then User validates the phone name in Scenario Outline

    Examples: 
      | Phones       |
      | Apple iphone |
      | OPPO         |
      | SAMSUNG      |
