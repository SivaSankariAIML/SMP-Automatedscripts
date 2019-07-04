Feature: SMP jSecure Care System API  Add
  @Web
  Scenario Outline:
  This test Sceanrio is ensure that SMP user is able to Add Groups

    Given  I am SMP user and I navigate to SMP <TB> url
    And  Signin using <Username> and  <Password> credentials
    And Click on jSecure Admin link
    And Click on Add Link under Groups
    And Click <Management> link
    And Select service provider in <ServiceProviderAccess> combo box
    And  Click Grant Full Access in <CorrespondingAdmin> and Click Add button


    Examples:

      |TB                                                 |Username|Password |ServiceProviderAccess|Management|CorrespondingAdmin|
      |http://sntb1-ppsmpw-11:8080/smp_jsecure/jsp/login.jsp |Admin   |SW50ZXJhY3Q=|O2 Online      |Care System API|Care System API|

