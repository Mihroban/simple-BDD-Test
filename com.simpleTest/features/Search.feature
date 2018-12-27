
@smokeTest
Feature: Search feature

  Scenario: verify search result
  	Given A user is on google homepage
    When The user enter text into the search box
    And Click on the search button
    #Then Verify the text is in the heading
    And The user click on the wiki link
    Then Verify the text presents in the title
    

