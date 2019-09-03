Feature: Create Task
  Verify that user can create new task by clicking on tasks on activity stream

  Background:
    Given user is on the landing page

  Scenario Outline:
    When user enters "<username>" and "<password>"
    Then homepage logo should display
    Then create task on Activity Stream
#    Then verify task has sent

#  @helpdesk
    Examples:
      | username                      | password |
      | helpdesk65@cybertekschool.com | UserUser |
      | helpdesk66@cybertekschool.com | UserUser |