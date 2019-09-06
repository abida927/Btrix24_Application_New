$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\resoucers\\features\\login.feature");
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
  "name": "login with excel sheet credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@excelData"
    }
  ]
});
formatter.step({
  "name": "user login with credentials",
  "keyword": "When "
});
formatter.match({
  "location": "Login_Step_Definition.user_login_with_credentials()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat com.Btrix24.pages.loginPage.LoginPage.loginWithCredentialDataTest(LoginPage.java:54)\r\n\tat com.Btrix24.step_definitions.Login_Step_Definition.user_login_with_credentials(Login_Step_Definition.java:44)\r\n\tat ✽.user login with credentials(src\\test\\resoucers\\features\\login.feature:32)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "homepage title should be \"Portal\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_Step_Definition.homepage_title_should_be(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});