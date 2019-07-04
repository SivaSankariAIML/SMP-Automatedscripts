Feature: SMP jSecure SMP Admin Delete
  @Web
  Scenario Outline:
  This test Sceanrio is ensure that SMP user is able to Delete Groups

    Given  I am SMP user and I navigate to SMP <TB> url
    And  Signin using <Username> and <Password> credentials
    And Click on jSecure Admin links
    And Click on View Link under Groups
    And clear the text and Enter the "<Descriptions>" and click search
    And Search the "<Description>" and Click Delete






    Examples:

      |TB |Username|Password|Descriptions|Description|
      |http://sntb1-ppsmpw-11:8080/smp_jsecure/jsp/login.jsp|Admin |SW50ZXJhY3Q=|vinudeep|vinudeep|

