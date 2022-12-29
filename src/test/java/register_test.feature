@RegressionTest

Feature: Register Test
  Scenario Outline: Create an account
    Given Navigate to website
    And click sign in button
    And type email "<email>"
    And click on Create an Account button
    And choose title
    And type firstname "<firstname>" and lastname "<lastname>"
    And type password "<password>"
    And type Company "<company>"
    And type address "<address>"
    Examples:
      | email | firstname | lastname | password | company | address |
      |bahadir@outlook.com|Bahadir|Sevim|parola123|NetRD|Sultangazi|
      |omer@outlook.com|Omer|Polat|omer123|KYK|Kayseri|
      |emre@outlook.com|Emre|Tacar|emre1234|Orion|Pendik|

