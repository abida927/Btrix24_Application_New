$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\resourses\\features\\login.feature");
formatter.feature({
  "name": "Login",
  "description": "  As a user I should able to login",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.scenarioOutline({
  "name": "login as different role",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "homepage logo should display",
  "keyword": "Then "
});
formatter.examples({
  "name": "hr",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "hr65@cybertekschool.com",
        "UserUser"
      ]
    },
    {
      "cells": [
        "hr66@cybertekschool.com",
        "UserUser"
      ]
    }
  ],
  "tags": [
    {
      "name": "@hr"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "Login_Step_Definition.user_is_on_the_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "login as different role",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@hr"
    }
  ]
});
formatter.step({
  "name": "user enters \"hr65@cybertekschool.com\" and \"UserUser\"",
  "keyword": "When "
});
formatter.match({
  "location": "Login_Step_Definition.user_enters_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "homepage logo should display",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_Step_Definition.homepage_logo_should_display()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "Login_Step_Definition.user_is_on_the_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "login as different role",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@hr"
    }
  ]
});
formatter.step({
  "name": "user enters \"hr66@cybertekschool.com\" and \"UserUser\"",
  "keyword": "When "
});
formatter.match({
  "location": "Login_Step_Definition.user_enters_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "homepage logo should display",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_Step_Definition.homepage_logo_should_display()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});