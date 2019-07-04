Feature:Credit Real Money
  @Web
  Scenario Outline:
  This test scenario ensures that SMP user is able to credit real money

    Given  I am SMP user and I navigate to SMP <URL> url
    And  Signin using <Username> and <Password> credentials
    And click on Customer Service link
    And enter <MSISDN> and click on Search
    And Click Recharge Link under the Menu
    And Click on Balance Tab
    And Enter the <Amount> and select the options <Reasoncode> and click on Credit button
    And check for the success message displayed

    Examples:

      |URL                                                   |Username|Password    |MSISDN       |Amount|Reasoncode      |
      |http://sntb1-ppsmpw-11:8080/smp_jsecure/jsp/login.jsp |Admin   |SW50ZXJhY3Q=|07347161875  |2     |Internal Testing|