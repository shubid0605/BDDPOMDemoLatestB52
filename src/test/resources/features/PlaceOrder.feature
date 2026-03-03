Feature: Place Order

Background: User Login
Given User is on login Page
When User enters "standard_user" and "secret_sauce"
Then User should be on Home page

Scenario: Add item to cart
Given User should be on home page
When User add item to cart
Then Item must be added

Scenario: Checkout Order
Given User is on cart page
When User do checkout
Then should Navigate to Checkout page

Scenario: Delete an Item
Given Cart must have Items
When User delete an item
Then should delete item from cart


