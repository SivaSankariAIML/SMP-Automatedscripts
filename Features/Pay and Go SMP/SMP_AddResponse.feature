Feature: Regression of offer creation journey

  @Paygsmsresponses
  Scenario Outline: Create a new responses in PAYG.

    Given I am SMP user and I navigate to SMP <TB> url
    And Signin using <username> and <password> credentials
    Then i click on the SMP adminstration and clicks on responses
    And Click on <responsetype> create new button and enter the <responseid> <description> <SPID> <plan> <Language> and <errorcode>
    When i click on the Add button the response should be added

    Examples:

      |TB                                                   |username|password|responsetype|responseid|description|SPID     |plan|Language|errorcode        |
      |http://sntb2-ppsmpw-41:8080/smp_jsecure/jsp/login.jsp|Admin   |SW50ZXJhY3Q=|SMS         |TEST      |testingdec |O2 Online|IPAD|Tesco   |Sytem Error (997)|