$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/Pay and Go SMP/Add new offer text.feature");
formatter.feature({
  "line": 1,
  "name": "Add new offer text",
  "description": "",
  "id": "add-new-offer-text",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "",
  "description": "This scenario ensures that SMP user is able to add new offer text in console as part of PAYG H1 2018",
  "id": "add-new-offer-text;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@Web"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am SMP user and I navigate to SMP \u003cTB\u003e url",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Signin using \u003cusername\u003e and \u003cpassword\u003e credentials",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "click on SMP Administration link",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click on Service Providers link and select \u003cSPID\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "click on Notifications link",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "click on Offers tab and Create new link",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "fill details \u003coffer\u003e and \u003cnotID\u003e and \u003csms\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "check if \u003coffer\u003e and \u003cnotID\u003e are added in the table",
  "keyword": "And "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "add-new-offer-text;;",
  "rows": [
    {
      "cells": [
        "TB",
        "username",
        "password",
        "SPID",
        "offer",
        "notID",
        "sms"
      ],
      "line": 16,
      "id": "add-new-offer-text;;;1"
    },
    {
      "cells": [
        "http://sntb1-ppsmpw-13:8080/smp_jsecure/jsp/login.jsp",
        "Admin",
        "SW50ZXJhY3Q\u003d",
        "283",
        "BIGDATABUNDLE10v2",
        "Subscribe With Chg",
        "For testing"
      ],
      "line": 17,
      "id": "add-new-offer-text;;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 97617058616,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "",
  "description": "This scenario ensures that SMP user is able to add new offer text in console as part of PAYG H1 2018",
  "id": "add-new-offer-text;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@Web"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am SMP user and I navigate to SMP http://sntb1-ppsmpw-13:8080/smp_jsecure/jsp/login.jsp url",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Signin using Admin and SW50ZXJhY3Q\u003d credentials",
  "matchedColumns": [
    1,
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "click on SMP Administration link",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click on Service Providers link and select 283",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "click on Notifications link",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "click on Offers tab and Create new link",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "fill details BIGDATABUNDLE10v2 and Subscribe With Chg and For testing",
  "matchedColumns": [
    4,
    5,
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "check if BIGDATABUNDLE10v2 and Subscribe With Chg are added in the table",
  "matchedColumns": [
    4,
    5
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "http://sntb1-ppsmpw-13:8080/smp_jsecure/jsp/login.jsp",
      "offset": 36
    }
  ],
  "location": "SMP_Scenarios.I_am_SMP_user_and_I_navigate_to_SMP_TB_url(String)"
});
formatter.result({
  "duration": 19239663625,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 13
    },
    {
      "val": "SW50ZXJhY3Q\u003d",
      "offset": 23
    }
  ],
  "location": "SMP_Scenarios.Signin_using_credentials(String,String)"
});
formatter.result({
  "duration": 9461564666,
  "status": "passed"
});
formatter.match({
  "location": "SMP_Scenarios.click_on_SMP_Administration_link()"
});
formatter.result({
  "duration": 3965070485,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "283",
      "offset": 43
    }
  ],
  "location": "SMP_Scenarios.click_on_Service_Providers_link(String)"
});
formatter.result({
  "duration": 4681229941,
  "status": "passed"
});
formatter.match({
  "location": "SMP_Scenarios.click_on_Notifications_link()"
});
formatter.result({
  "duration": 14914185870,
  "status": "passed"
});
formatter.match({
  "location": "SMP_Scenarios.click_on_Offers_tab_and_Create_new_link()"
});
formatter.result({
  "duration": 7270992386,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BIGDATABUNDLE10v2",
      "offset": 13
    },
    {
      "val": "Subscribe With Chg",
      "offset": 35
    },
    {
      "val": "For testing",
      "offset": 58
    }
  ],
  "location": "SMP_Scenarios.fill_in_details_and_click_add(String,String,String)"
});
formatter.result({
  "duration": 7387235682,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BIGDATABUNDLE10v2",
      "offset": 9
    },
    {
      "val": "Subscribe With Chg",
      "offset": 31
    }
  ],
  "location": "SMP_Scenarios.check_offer_notID_added(String,String)"
});
formatter.result({
  "duration": 13432315752,
  "error_message": "java.lang.AssertionError: Failed to add offer text\r\n\tat org.testng.Assert.fail(Assert.java:94)\r\n\tat steps.SMP_Scenarios.check_offer_notID_added(SMP_Scenarios.java:1001)\r\n\tat ✽.And check if BIGDATABUNDLE10v2 and Subscribe With Chg are added in the table(Features/Pay and Go SMP/Add new offer text.feature:13)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 4178220694,
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d75.0.3770.100)\n  (Driver info: chromedriver\u003d2.38.552522 (437e6fbedfa8762dec75e2c5b3ddb86763dc9dcb),platform\u003dWindows NT 6.1.7601 SP1 x86) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.6.0\u0027, revision: \u00276fbf3ec767\u0027, time: \u00272017-09-27T15:28:36.4Z\u0027\nSystem info: host: \u0027LASST240940\u0027, ip: \u002710.172.36.234\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027x86\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_144\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, platformName\u003dXP, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.38.552522 (437e6fbedfa8762dec75e2c5b3ddb86763dc9dcb), userDataDir\u003dC:\\Users\\ssankar4\\AppData\\Local\\Temp\\scoped_dir9024_25168}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003d, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d75.0.3770.100, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 6cb2dc3d54be7678344e846945ee8b2a\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:586)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:643)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.close(RemoteWebDriver.java:472)\r\n\tat steps.Hooks.embedScreenshot(Hooks.java:116)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:206)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\r\n\tat cucumber.runtime.model.CucumberScenarioOutline.run(CucumberScenarioOutline.java:46)\r\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\r\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.feature(AbstractTestNGCucumberTests.java:21)\r\n\tat com.github.mkolisnyk.cucumber.runner.ExtendedTestNGRunner.feature(ExtendedTestNGRunner.java:69)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:104)\r\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:645)\r\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:851)\r\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:1177)\r\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:129)\r\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:112)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:756)\r\n\tat org.testng.TestRunner.run(TestRunner.java:610)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:387)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:382)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:340)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:289)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:86)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1293)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1218)\r\n\tat org.testng.TestNG.runSuites(TestNG.java:1133)\r\n\tat org.testng.TestNG.run(TestNG.java:1104)\r\n\tat org.testng.IDEARemoteTestNG.run(IDEARemoteTestNG.java:72)\r\n\tat org.testng.RemoteTestNGStarter.main(RemoteTestNGStarter.java:123)\r\n",
  "status": "failed"
});
});