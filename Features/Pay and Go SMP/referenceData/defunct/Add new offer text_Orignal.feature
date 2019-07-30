Feature: Add new offer text
@Web
  Scenario Outline:
  This scenario ensures that SMP user is able to add new offer text in console as part of PAYG H1 2018

    Given I am SMP user and I navigate to SMP <TB> url
    And Signin using <username> and <password> credentials
    And click on SMP Administration link
    And click on Service Providers link and select <SPID>
    And click on Notifications link
    And click on Offers tab and Create new link
    And fill details <offer> and <notID> and <sms>
    And click on Console link
    #And check if <offer> and <notID> are added in the table

    Examples:
      |TB                                                            |username |password     |SPID|offer            |notID             |sms        |
      |http://sntb1-ppsmpw-13:8080/smp_jsecure/jsp/login.jsp         |Admin    |SW50ZXJhY3Q= |283 |BIGDATABUNDLE10v2|Subscribe With Chg|For testing|

