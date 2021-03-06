@all @login
Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct credentials to different accounts.
  and dashboard should be displayed.
  Accounts are: librarian, student, admin

      #comments are cool
  Background: Assuming User is on the login page
    Given User is on the login page

  @librarian @q @a @r @g @l @v @n @o @pl @zz @e3
  Scenario: Login as librarian
    When User enters librarian username
    And User enters librarian password
    Then User should see the dashboard


  @student
  Scenario: Login as student
    When User enters student username
    And User enters student password
    Then User should see the dashboard

  @admin
  Scenario: Login as admin
    When User enters admin username
    And User enters admin password
    Then User should see the dashboard