@Login @Jakpat
  Feature: Login Page
    This test case is everything about login page

  Scenario: Valid login
    Given User open the website
    When User input "Admin" as username and "admin123" as password
    And Click button login
    Then user already on dashboard page

  Scenario Outline: Invalid Login
    Given  User open the website
    When User input "<user>" as username and "<pass>" as password
    And Click button login
    Then Error message should show up
    Examples:
      | user     | pass     |
      | Admin    | 12345    |
      | asdadsad | admin123 |

  Scenario Outline: Blank mandatory login field
    Given User open the website
    When User input "<user>" as username and "<pass>" as password
    And Click button login
    Then Required message should show up
    Examples:
      | user  | pass     |
      | Admin |          |
      |       | admin123 |