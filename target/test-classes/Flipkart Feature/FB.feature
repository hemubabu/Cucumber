Feature: Fcaebook feature

  Scenario Outline: Facebook scenario outline
    Given User launches the facebook application "https://www.facebook.com/"
    And User creates the Account
    When User fills the Firstname "<Firstname>"
    And User fills the Surname "<Surname>"
    And User fills the Number "<Number>"
    And User fills the Password "<Password>"
    And User fills the Date "<Date>"
    And User fills the Month "<Month>"
    And User fills the Year "<Year>"
    And User Selects the Gender
    Then User creates the Facebook accounts

    Examples: 
      | Firstname | Surname | Number     | Password | Date | Month | Year |
      | Hemanth   | S       | 8072861025 | Hem@3123 |   13 |    10 | 1998 |
      | Vishal    | E       | 9500308803 | Vis@3123 |   28 |     8 | 1998 |
      | Lokesh    | S       | 9788125679 | Lok@3123 |    4 |    12 | 1995 |
