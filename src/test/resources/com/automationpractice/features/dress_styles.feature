
Feature: Verify dress styles
  

  @temp
  Scenario: Verify dress subcategories 
    Given I am on homepage
   
    When I click on dresses button
    Then The following subcategories should be there
       		| Casual Dresses  |
   				| Evening Dresses |  
  				| Summer Dresses  |