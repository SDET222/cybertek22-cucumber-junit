Feature: Google search functionality
    Agile Story: As a user, when I am on google
    search page, I should be able to search whatever
    I want, and see relevant information

Scenario: Search page title verification
  Given User is on Google home page
  Then user should see title is Google
@google
  Scenario: User search title verification
    Given User is on Google home page
    When User searches for "apple"
    Then User should see "apple" in the title