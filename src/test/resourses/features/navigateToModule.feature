@NavigateToModules
Feature: Navigate to module options

  Background:
    Given user is on the landing page


  Scenario Outline:  Verify module title
    When user enters "<username>" and "<password>"
    Then homepage logo should display
    Then click on  "<module>"
    Then the page title should be "<title>"

    Examples:
      | username                | password | module          | title  |
      | hr65@cybertekschool.com | UserUser | Activity Stream | Portal |
      | hr66@cybertekschool.com | UserUser | Tasks           | Tasks  |