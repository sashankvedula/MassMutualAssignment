Feature: Verify Amounts

  Scenario: Verify count of amounts
  	Given homepage is opened
  	When amounts are present
  	Then count should be 5
  
  Scenario: Verify amounts are greater than 0
  	Given homepage is opened
  	When amounts are present
  	Then amounts should be greater than 0
    
  Scenario Outline: Verify amounts are formatted as currencies
  	Given homepage is opened
  	When amounts are present
  	Then amounts should be displayed as currencies "<currency>"
  	
  	Examples:
  		| currency |
			| $        |
  
  Scenario: Verify the total balance matches the sum of the values
  	Given homepage is opened
  	When amounts are present
  	Then total balance should be equal to sum of the values
  	