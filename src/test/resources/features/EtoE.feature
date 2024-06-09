@tugas
Feature: End To End
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
    And Click cart icon
    And Click checkout button
    And Input first name "Rafii" and last name "Malfa" and postal code "1234"
    And Click continue button
    And Click finish button
    Then Should be displayed checkout complete with title "Thank you for your order!"

