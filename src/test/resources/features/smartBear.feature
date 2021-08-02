Feature: SmartBear order functionality
  As a user I should be able to login to SmartBear tester account and be able to place an order


  Background: User is on SmartBear "tester" account and on order page
    Given User is logged in to SmartBear "tester" account
    And User navigate to "order" page


  Scenario: Verify that customer name is on the list


    When User fill out below information

      | product dropdown | FamilyAlbum      |
      | quantity         | 4                |
      | customer name    | John Wick        |
      | street           | Kinzie Ave       |
      | city             | Chicago          |
      | state            | IL               |
      | zipCode          | 60056            |
      | Card type        | visa             |
      | card number      | 1111222233334444 |
      | expiration date  | 12/22            |

    And User click process button
    Then User verifies "John Wick" is in the list
  @wip
  Scenario Outline: User fills out the form as followed from the table below:


    When User enters "<product>" , "<quantity>", "<customer name>", "<street>", "<city>", "<state>","<zip>", "<cardType>", "<card number>", "<expiration date>"
    Then User verifies "<customer name>" is in the list

    Examples: Search terms we are going to use in this templates is as below
      | product     | quantity | customer name | street             | city     | state | zip   | cardType | card number      | expiration date |
      | MyMoney     | 1        | Ken Adams     | Kinzie Street      | Summit   | NJ    | 79712 | Visa     | 85969595944893   | 09/25           |
      | FamilyAlbum | 5        | John Wick     | Kenzie Ave         | Chicago  | IL    | 60056 | Visa     | 1111222233334444 | 12/22           |
      | ScreenSaver | 7        | Ken Adams     | San Luis Ave       | San Jose | CA    | 95117 | Visa     | 2311222237434444 | 08/22           |
      | MyMoney     | 23       | Rachel Green  | Santa Teressa blvd | Chicago  | IL    | 60966 | Visa     | 5691222233334444 | 12/22           |
      | FamilyAlbum | 8        | Luis Garcia   | Olive Hill Drive   | San Jose | CA    | 95117 | Visa     | 7811222237434444 | 08/22           |