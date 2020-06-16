@tag1
Feature: offline jbk site

  Scenario: as a system user
  i want to login into the page

  Given user nevigate to url
  When title of login page verify
  Then user validate the username
  Then user validate the password
  Then user click on  signup button
  Then user logged in successfully