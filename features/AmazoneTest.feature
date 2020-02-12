#Author: stsandeep7@gmail.com	
@tag
Feature: amzone basic search

  @tag1
  Scenario: Search Shoes on Amazone
    Given I Navigate to amazone
    When  I Enter "Shoes" in Search box
    And   I perform Search
    And   I chose shoes "skoodo Kids Casual Sports Shoes"
    And   I select size as "2.5 (UK/India)|EU35"
    And   I perform add to cart
    And   I click on cart
    Then  Verify "skoodo Kids Casual Sports Shoes" in Shopping Cart    