Feature: Krafttech Log in Test


  Scenario: Login as Alparslan
    Given The user is on the login page
    When The user enters Alparslan credentials
    Then The user should be able to login

  Scenario: Login as Hatice
    Given The user is on the login page
    When The user enters Hatice credentials
    Then The user should be able to login

  Scenario: Login as Emine Ceren
    Given The user is on the login page
    When The user enters Emine Ceren credentials
    Then The user should be able to login

  Scenario: Login as Azra
    Given The user is on the login page
    When The user enters Azra credentials
    Then The user should be able to login

