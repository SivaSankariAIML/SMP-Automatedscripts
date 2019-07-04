Feature:SMP Order Processing
  @Web
  Scenario Outline:
  This test scenario ensures that SMP user is able to do order processing

    Given  I am SMP user and I navigate to SMP <TB> url
    And  Signin using <Username> and <Password> credentials
    And click on Customer Service link
    And enter <MSISDN> and click on Search
    And Click Order Processing under the Menu
    And select <Ordertype> and click on Verify
    And print the order id generated

    Examples:

      |TB                                                  |Username|Password |MSISDN       |Ordertype |
      |http://sntb1-ppsmpw-11:8080/smp_jsecure/jsp/login.jsp |Admin   |SW50ZXJhY3Q=|07347161875  |Disconnect|
