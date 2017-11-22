Feature: Test Carmax Smoke Scenario
	Scenario Outline: Test Search with Make Value
	Given Open Chrome and start application
	When I enter "<Make> " and "<Model>" in search box
	Then user should able to see results accordingly
	Then Application should be closed
	
	Examples:
	| Make   | Model  |
	| Honda  | Civic  |
	| Toyota | Camry  |
	| Honda  | Accord |
	| Ford   | Focus  |