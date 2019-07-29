Feature: Add new offer text
  @Web
  Scenario: This scenario ensures that SMP user is able to add new offer text in console as part of PAYG H1 2018

    Given User navigate to SMP url http://sntb1-ppsmpw-13:8080/smp_jsecure/jsp/login.jsp
    And Signin using Admin and SW50ZXJhY3Q= credentials
    And Upload SMP test data tab "OFFER TEXT REAL"
