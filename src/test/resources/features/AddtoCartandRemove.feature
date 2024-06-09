@tugas
Feature: Add to Cart and Remove
  Scenario: Add to cart Red T-Shirt and Sauce Labs Onesie and checkout Sauce Labs Onesie
    Given User login with valid username "standard_user" and password "secret_sauce"
    And Verify set filter button displayed
    And Click set filter button "Name (Z to A)"
    And Verify Red T-Shirt is displayed
    And Click add to cart button red T-Shirt
    And Verify Sauce Labs Onesie displayed
    And Click add to cart button Sauce Labs Onesie
    And Click cart icon
    And verify Sauce Labs Onesie and Red T=Shirt displayed
    And Remove Red T-Shirt
    And Click continue Shopping
