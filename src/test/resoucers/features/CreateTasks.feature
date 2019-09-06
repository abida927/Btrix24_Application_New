@Create_Tasks
Feature: Create Task
  Verify that user can create new task by clicking on tasks on activity stream

  Background:
    Given user is on the landing page

  @Tasks
  Scenario Outline:
    When user enters "<username>" and "<password>"
    Then homepage logo should display
    Then create task on Activity Stream


    Examples: hr
      | username                | password |
      | hr65@cybertekschool.com | UserUser |
#      | hr66@cybertekschool.com | UserUser |

  @TaskWithFile

  Scenario Outline:
    When user enters "<username>" and "<password>"
    Then homepage logo should display
    Then create task with file on Activity Stream


    Examples: hr
      | username                | password |
      | hr66@cybertekschool.com | UserUser |


  @taskWithDeadLind
  Scenario Outline:
    When user enters "<username>" and "<password>"
    Then homepage logo should display
    Then create task with deadline on Activity Stream


    Examples: marketing
      | username                       | password |
      | marketing65@cybertekschool.com | UserUser |