@tag2
Feature: dashboard options
Scenario: as a system user
  i want to login into the page

  Given user nevigate to url
  When title of login page verify
  Then user validate the username
  Then user validate the password
  Then user click on  signup button
  Then user logged in successfully
  
 # Scenario: as a system user
   # i want to check dashboard options

    Given user nevigate to homepage and check title
    Then user verify dashboardlabel
    Then user verify homelabe
    Then user verify neworder window
    Then user verify bouncerate window
    Then user verify userregistration window
    Then user verify unoquevisitors window
