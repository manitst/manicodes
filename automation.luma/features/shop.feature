#Author : Manikandan
@smoke
Feature: Placing an order

@TC1
Scenario Outline: Verify user can place an order


Given I am on the Magento demo store homepage 
When I navigate to the Shop page
And I filter products by category and I see list of products
When I click on the required product am directed to product details page
Then I add  quantities of the product to the cart
When I proceed to checkout
Then I am on the checkout page
And I can successfully complete the purchase
Then I receive a confirmation message

 
