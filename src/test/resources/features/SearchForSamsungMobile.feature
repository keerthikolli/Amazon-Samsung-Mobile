Feature: Search For Samsung Mobiles
  Get the list of samsung mobiles with following features
  Camera resolution should be above 20MP
  Year model is 2023
  Price range between £50 to £100

  Scenario: Get list of Samsung mobiles
    Given I navigate to "https://amazon.co.uk"
    And I select samsung mobiles
    Then I add camera , model and price range requirements
    When I click on search button
    Then I should able to view list of mobiles