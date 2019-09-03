$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\resoucers\\features\\login.feature");
formatter.feature({
  "name": "Login",
  "description": "         As a user I should able to login",
  "keyword": "Feature"
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
  "name": "helpdesk",
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
        "helpdesk65@cybertekschool.com",
        "UserUser"
      ]
    },
    {
      "cells": [
        "helpdesk66@cybertekschool.com",
        "UserUser"
      ]
    }
  ],
  "tags": [
    {
      "name": "@helpdesk"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on the landing page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "login as different role",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@helpdesk"
    }
  ]
});
formatter.step({
  "name": "user enters \"helpdesk65@cybertekschool.com\" and \"UserUser\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "homepage logo should display",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on the landing page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "login as different role",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@helpdesk"
    }
  ]
});
formatter.step({
  "name": "user enters \"helpdesk66@cybertekschool.com\" and \"UserUser\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "homepage logo should display",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});