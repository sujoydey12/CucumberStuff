Feature: I want to send my friend some money



  Scenario: My friend needs to receive a transaction from me regards to the payment

    Given I want to send a Credit transaction worth £50


    When I have to pay my friend £50

    Then he will receive the amount £50.


  And I have now only got £100 left in my bank account


  And so I have to make another payment to get £200 back into my account

    #Scenario Outline: I have received some money to pay


     # Given I have to pay some £60 to my friend

     # When I have <sent> "money"

      #Then he recieves the <amount> £




      #Examples:

    # |sent | amount|

#



