Feature:

  @wip

  Scenario:
    Given user is on main page, user goes to Phones, user goes to Laptops, user goes to Monitors
    When user goes to "laptop", user adds "Sony vaio i5" to cart and user adds "Dell i7 8gb" to cart, accepts pop-up confirmation
    And user goes to cart, user deletes "Dell i7 8gb" from cart
    And user fills all info fields and places order, user clicks purchase button
      | Mr Twister  |
      | someCountry |
      | someCity    |
      | 11111118815 |
      | 08          |
      | 2015        |
    And user sees purchase amount "1" and price "790"
    Then user clicks OK and sees home page











# • Customer navigation through product categories: Phones, Laptops and Monitors
 # • Navigate to "Laptop" → "Sony vaio i5" and click on "Add to cart". Accept pop up confirmation.
 # • Navigate to "Laptop" → "Dell i7 8gb" and click on "Add to cart". Accept pop up confirmation.
# • Navigate to "Cart" → Delete "Dell i7 8gb" from cart.

 # • Click on "Place order".
 # • Fill in all web form fields.
 # • Click on "Purchase"
 # • Capture and log purchase Id and Amount.
 # • Assert purchase amount equals expected.
 # • Click on "Ok"
 #   */