Feature: SMP jSecure SMP Admin View
  @Web
  Scenario Outline:
  This test Sceanrio is ensure that SMP user is able to View/modify/Delete Groups

    Given  I am SMP user and I navigate to SMP <TB> url
    And  Signin using <Username> and <Password> credentials
    And Click on jSecure Admin links
    And Click on View Link under Groups
    And Search ths "<Description>" and Click View



    Examples:

      |TB |Username|Password|Description|
      |http://sntb1-ppsmpw-11:8080/smp_jsecure/jsp/login.jsp|Admin |SW50ZXJhY3Q=|API|

