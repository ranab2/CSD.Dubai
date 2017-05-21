Feature: Search Attraction
Scenario: Search Attraction using keyword
Given user has provided Attraction name
When user clicks "Search" button 
Then list of attraction with pictures is displayed to the user matching with criteria given by user

Scenario: Wild Card Attraction Name search
Given user has provided special Burj% in attraction name field
When user clicks "Search" button 
Then list of attraction with pictures is displayed starting with "Burj" word

