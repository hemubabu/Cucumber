#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: W3 Schools feature
  I want to use this template for my feature file

  @smoke
  Scenario: Login scenario
    Given User launches the W3school link
    And User enters OOPS concept in search "OOPS"
    When User clicks the OOPS link
    And User click the log in button
    And User enters the username and password
      | hemanthkrish309@gmail.com | Hemu3123* |
    Then User validates his/her name "Hi, Hemanth"
