Feature: Delete servicegroup text
  @Web
  Scenario Outline:
  This scenario ensures that SMP user is able to Delete the SGuser
    Given I am SMP user and I navigate to SMP <TB> url
    And Signin using <username> and <password> credentials
    And click on SMP Administration link
    And click on Service Providers link and select <SPID>
    And click on Notifications link
    And click on ServiceGroup tab
    And Serach "<Notification>" and "<ServiceGroup>" Click modify
    And Select End date
    And Click modify button SGnotification



    Examples:
      |TB                                                            |username |password |SPID|Notification|ServiceGroup|
      |http://sntb1-ppsmpw-13:8080/smp_jsecure/jsp/login.jsp         |Admin    |SW50ZXJhY3Q=|283 |Balance Enquiry|Free Onnet 20|
