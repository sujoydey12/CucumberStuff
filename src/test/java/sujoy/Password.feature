Feature: Account Creation

  Scenario Outline : password validation

    Given I try to create an account with password "<Password>"

    Then I should see that the password is "<Valid or Invalid>"




    Examples
     | Password | Valid or Invalid |
     |abc1      | invalid          |

