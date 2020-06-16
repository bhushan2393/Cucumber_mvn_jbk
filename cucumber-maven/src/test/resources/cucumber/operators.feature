@tag4
Feature: operators labels

Scenario: as a system user
    i want to login into the page

    Given user nevigate to url
    When title of login page verify
    Then user validate the username
    Then user validate the password
    Then user click on  signup button
    Then user logged in successfully
    
 # Scenario: as a system user
  #  i want to index labels.

    Given user nevigate to operators
    Then user check Label id
    Then user check Label operator
    Then user check Label date
    Then user check Label status
    Then user check Label reason