$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "NopCommerce Login",
  "description": "",
  "id": "nopcommerce-login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8337067400,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "NopCommerce Register Test",
  "description": "",
  "id": "nopcommerce-login;nopcommerce-register-test",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Register"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on Login page and verify the Login page Title",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User Enter Their Details and Clicks Login Button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User is on Nopcommerce Homepage",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 721500,
  "status": "passed"
});
formatter.uri("src/test/resources/Features/Register.feature");
formatter.feature({
  "line": 1,
  "name": "NopCommerce Register",
  "description": "",
  "id": "nopcommerce-register",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4662365100,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "NopCommerce Register Test",
  "description": "",
  "id": "nopcommerce-register;nopcommerce-register-test",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Register"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on register page and verify the Register page Title",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User Enter Their Details and Clicks Register Button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User is on Complete Registration page",
  "keyword": "And "
});
formatter.match({
  "location": "Register.user_is_on_register_page_and_verify_the_Register_page_Title()"
});
formatter.result({
  "duration": 210293500,
  "status": "passed"
});
formatter.match({
  "location": "Register.User_Enter_Their_Details_and_Clicks_Register_Button()"
});
formatter.result({
  "duration": 3132669700,
  "status": "passed"
});
formatter.match({
  "location": "Register.user_is_on_Complete_Registration_page()"
});
formatter.result({
  "duration": 8396000,
  "status": "passed"
});
formatter.after({
  "duration": 339200,
  "status": "passed"
});
});