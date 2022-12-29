

Feature: Register Test
  Background:
    Given Navigate to website
    And click sign in button
    And type email "bahadir@outlook.com"
    And click on Create an Account button

      Scenario: Person 1
        And type firstname "Bahadir" and lastname "Sevim"

      Scenario: Person 2
        And type Company "NetRD"
        And type address "Kurtköy, Pendik"

      Scenario Outline: Person 3
        And type firstname "<firstname>" and lastname "<lastname>"
        And type password "<password>"
        And type Company "<company>"
        And type address "<address>"
        Examples:
          | firstname | lastname | password | company | address |
          |Emre|Tacar|emre1234|NetRD|Pendik|
          |Buse|Yılmaz|Buse123|Netaş|Esenler|
