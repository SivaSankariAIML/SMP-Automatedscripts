Feature: Modify offer text
  @Web
  Scenario Outline:
  This scenario ensures that SMP user is able to modify offer text in console
    Given I am SMP user and I navigate to SMP <TB> url
    And Signin using <username> and <password> credentials
    And click on SMP Administration link
    And click on Service Providers link and select <SPID>
    And click on Notifications link
    And click on Offers tab and click on modify for <sms> against <offer>
    And modify <sms message> and <web message> then click on Modify
    And check if Notifications home page is returned

    Examples:
      |TB                                                            |username |password |SPID|sms            |offer            |sms message|web message|
      |http://sntb1-ppsmpw-13:8080/smp_jsecure/jsp/login.jsp         |Admin    |SW50ZXJhY3Q=|283 |Balance Enquiry|BIGDATABUNDLE10v2|Test       |Test       |

