@tag3
Feature: users features

  Scenario: as a system user
    i want to login into the page

    Given user nevigate to url
    When title of login page verify
    Then user validate the username
    Then user validate the password
    Then user click on  signup button
    Then user logged in successfully
    # Scenario: as a system user
    #  i want to add user
    Given user nevigate to user page
    Then user verify title
    Then user click on add user
    Then user verify horizontalform label
    Then user put username
    Then user put mobile
    Then user put email
    Then user select gender
    Then user select state
    Then user set password
    Then user click on submit button
    Then user click on popup
