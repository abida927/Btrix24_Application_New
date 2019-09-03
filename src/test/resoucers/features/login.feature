Feature: Login
         As a user I should able to login

  Background:
    Given user is on the landing page

  Scenario Outline: login as different role
    When user enters "<username>" and "<password>"
    Then homepage logo should display

     @hr
    Examples: hr
      |username                |password |
      |hr65@cybertekschool.com | UserUser |
      |hr66@cybertekschool.com | UserUser |

     @marketing
    Examples: marketing
      | username                       | password |
      | marketing65@cybertekschool.com | UserUser |
      | marketing66@cybertekschool.com | UserUser |

    @helpdesk
    Examples: helpdesk
      | username                      | password |
      | helpdesk65@cybertekschool.com | UserUser |
      | helpdesk66@cybertekschool.com | UserUser |

