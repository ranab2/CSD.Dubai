Feature: Register Attraction
This feature helps user to register different attractions in the system.
Scenario: Register an Attraction in the system
Given user provides "Attraction Name", "Attraction Description", "Attraction Picture", "Attraction Location", "Attraction Pricing"
When user clicks on "Register Attraction"
Then "Attraction is successfully register" message is displayed and "OK" button is displayed
And system redirects to "List of Attractions" upon clicking "OK" button.
