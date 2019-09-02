Feature: Login
         As a user I should able to login

  Background:
    Given user is on the landing page

  Scenario Outline : login as different role
    When user enter "<username>" and "<password>"
    Then homepage logo should display

     @hr
    Examples:
      |username                |password |
      |hr65@cybertekschool.com | UserUser |
      |hr66@cybertekschool.com | UserUser |

     @marketing
    Examples:
      | username                       | password |
      | marketing65@cybertekschool.com | UserUser |
      | marketing66@cybertekschool.com | UserUser |

    @helpdesk
    Examples:
      | username                      | password |
      | helpdesk65@cybertekschool.com | UserUser |
      | helpdesk66@cybertekschool.com | UserUser |

