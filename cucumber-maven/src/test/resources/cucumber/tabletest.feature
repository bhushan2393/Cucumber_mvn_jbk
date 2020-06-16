@tag7 
Feature: users on table of offline website 

Scenario Outline: user Verification 
	Given open users page 
	
	Then  user verify logid "<username>"
	Then  user verify logpwd "<password>"
	
	Examples: 
		|username|password|
		|abc@gmail.com|123456|
		