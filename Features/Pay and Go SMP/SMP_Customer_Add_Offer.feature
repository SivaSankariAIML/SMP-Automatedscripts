Feature: Add offer
  @Web
  Scenario Outline:
  This scenario ensures that SMP user is able to add offer to a MSISDN
    Given I am SMP user and I navigate to SMP <TB> url
    And Signin using <username> and <password> credentials
    And click on Customer Service link
    And enter <MSISDN> and click on Search
    And click on Services and <offertype> tab
    And for <offertype> select <offername> and click on Confirm and save


    Examples:
      |TB                                                            |username |password |MSISDN     |offertype     |offername                           |
      |http://sntb1-ppsmpw-13:8080/smp_jsecure/jsp/login.jsp         |Admin    |SW50ZXJhY3Q= |07731297062|Adjustment    |Good Will Adj 100 Anytime Voice Mins|

