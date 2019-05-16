Feature: test eggtimer functionality

Background:
   	Given user open the browser and load the URL
    Then home page should be appear


Scenario: test login functionality with valid credentials
    When enter time text "25seconds"
	When click on go button
	Then timer should start and shows remaining time