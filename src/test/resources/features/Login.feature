@login
Feature: Krafttech Log in Test

  Background:
    Given User should be on the login page

  @tester
  Scenario: Login as Alparslan
    When The user enters Alparslan credentials
    Then The user should be able to login

  @developer
  Scenario: Login as Hatice
    When The user enters Hatice credentials
    Then The user should be able to login

  @smoke  @db @po
  Scenario: Login as Emine Ceren
    When The user enters Emine Ceren credentials
    Then The user should be able to login

  @azra  @smoke @dm
  Scenario: Login as Azra
    When The user enters Azra credentials
    Then The user should be able to login

  @parallel
  Scenario: User should be able to login with valid credantilas
    When User should input login information
    Then User should be on home page

  @parallel
  Scenario: Login with parameters
    When User should input "user22@test.com" and "Test123456"
    Then User should be on home page

  Scenario: Login as a given user
    Then User should input follwing credantials

      | email    | user22@test.com |
      | password | Test123456      |
      | name     | User22          |

  Scenario Outline: Data table and scenario outline
    Then User should input follwing credantials

      | email    | <userEmail> |
      | password | <password>  |
      | name     | <name>      |

    Examples:
      | userEmail               | password   | name           |
      | user22@test.com         | Test123456 | User22         |
      | eddiem@kraft.com        | eddiem12   | Eddie Murphy   |
      | morganfreeman@kraft.com | mfreeman   | Morgan Freeman |