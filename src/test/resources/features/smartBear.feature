Feature: SmartBear order functionality
  As a user I should be able to login to SmartBear tester account and be able to place an order

  @wip
  Scenario: Verify that customer name is on the list
    Given User is logged in to SmartBear "tester" account
    And User navigate to "order" page

    And User fill out below information

      | product dropdown | FamilyAlbum      |
      | quantity         | 4                |
      | customer name    | John Wick        |
      | street           | Kinzie Ave       |
      | city             | Chicago          |
      | zipCode          | 60056            |
      | Card type        | visa             |
      | card number      | 1111222233334444 |
      | expiration date  | 12/22            |

    And User click process button
    Then User verifies John Wick is in the list