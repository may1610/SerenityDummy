Feature: I want to buy a tablet from fptshop

  Scenario: Buy tablet from fptshop page
    Given I am on fptshop page
    When I select one of the best seller tablet
    And I buy that
    Then I should see product in the shopping cart "GIỎ HÀNG CỦA BẠN"
