Feature: Amazon Search

  Scenario: search a Product
  
   Given I have a search field on amazon page
   When I search product with name "Apple Mac Pro" and price 10000
   Then product with name "Apple Mac Pro" should be displayed
