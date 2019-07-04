Feature: Regression of offer creation journey 

@Paygoffernew
Scenario Outline: Create a new offer in PAYG.

	Given I am SMP user and I navigate to SMP <TB> url
	And Signin using <username> and <password> credentials
	Then i click on the SMP adminstration and clicks on offers
	And Click on create new offer button and enter the <offerkind> and <serviceprovider>
	And I click on the Add button the offer should be added and confirm offer added
	
	Examples:
	
	|username|password	  |offerkind  |serviceprovider|
	|Admin   |SW50ZXJhY3Q=|Conditional|O2 Uk          |
	 
	 
	 