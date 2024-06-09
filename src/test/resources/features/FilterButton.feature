@tugas
Feature: End To End
  Scenario: Add to cart Red T-Shirt and Sauce Labs Onesie and checkout Sauce Labs Onesie
    Given User login with valid username "standard_user" and password "secret_sauce"
    And Verify set filter button displayed
    And Click set filter button "Name (Z to A)"
    And Verify Red T-Shirt is displayed

  Scenario: Add to cart Red T-Shirt and Sauce Labs Onesie and checkout Sauce Labs Onesie
    Given User login with valid username "standard_user" and password "secret_sauce"
    And Verify set filter button displayed
    And Click set filter button "Price (low to high)"
    And Verify Sauce Labs Onesia is displayed on Low to High filter

  Scenario: Add to cart Red T-Shirt and Sauce Labs Onesie and checkout Sauce Labs Onesie
    Given User login with valid username "standard_user" and password "secret_sauce"
    And Verify set filter button displayed
    And Click set filter button "Price (high to low)"
    And Verify Sauce Labs Fleece is displayed on High to Low filter