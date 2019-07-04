Feature: SMP jSecure SMP Admin Add
  @Web
  Scenario Outline:
  This test Sceanrio is ensure that SMP user is able to Add Groups

    Given  I am SMP user and I navigate to SMP <TB> url
    And  Signin using <Username> and <Password> credentials
    And Click on jSecure Admin links
    And Click on Add Link under Groups
    And Click "<Management>" link
    And Select service provider in "<ServiceProviderAccess>"
    And Click Grant Full Access "<CorrespondingAdmin>" check
    And Click Add button

    Examples:

      |TB |Username|Password|Management                                      |ServiceProviderAccess|CorrespondingAdmin|
      |http://sntb1-ppsmpw-11:8080/smp_jsecure/jsp/login.jsp|Admin |SW50ZXJhY3Q=|SMP Admin| O2 Online |SMP Admin         |
      |http://sntb1-ppsmpw-11:8080/smp_jsecure/jsp/login.jsp|Admin |SW50ZXJhY3Q=|jSecure Admin| O2 Online |jSecure Admin |
      |http://sntb1-ppsmpw-11:8080/smp_jsecure/jsp/login.jsp|Admin |SW50ZXJhY3Q=|Payment Admin| O2 Online |Payment Admin |
      |http://sntb1-ppsmpw-11:8080/smp_jsecure/jsp/login.jsp|Admin |SW50ZXJhY3Q=|Payment System API| O2 Online |Payment System API|
