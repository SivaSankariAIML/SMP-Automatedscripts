Feature: SMP jSecure SMP Admin modify
  @Web
  Scenario Outline:
  This test Sceanrio is ensure that SMP user is able to modify Groups

    Given  I am SMP user and I navigate to SMP <TB> url
    And  Signin using <Username> and <Password> credentials
    And Click on jSecure Admin links
    And Click on View Link under Groups
    And Search ths "<Description>" and Click modify
    And Select service provider in "<ServiceProviderAccess>"
    And Select Available user in "<Users>" and click include
    And  modify button and dond button



    Examples:

      |TB |Username|Password|Description|ServiceProviderAccess|Users|
      |http://sntb1-ppsmpw-11:8080/smp_jsecure/jsp/login.jsp|Admin |SW50ZXJhY3Q=|Vinudeep|O2 Online|sivatest|

