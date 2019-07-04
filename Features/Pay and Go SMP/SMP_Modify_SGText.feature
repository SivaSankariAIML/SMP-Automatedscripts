Feature: Modify servicegroup text
  @Web
  Scenario Outline:
  This scenario ensures that SMP user is able to modify SG text in console
    Given I am SMP user and I navigate to SMP <TB> url
    And Signin using <username> and <password> credentials
    And click on SMP Administration link
    And click on Service Providers link and select <SPID>
    And click on Notifications link
    And click on ServiceGroup tab
    And Serach "<Notification>" and "<ServiceGroup>" Click modify
    And Clear webtext and Enter "<webmessage>"
    And Click modify button SGnotification
    And check if Notifications home page is returned


    Examples:
      |TB                                                            |username |password |SPID|Notification|ServiceGroup|webmessage|
      |http://sntb1-ppsmpw-13:8080/smp_jsecure/jsp/login.jsp         |Admin    |SW50ZXJhY3Q=|283 |Balance Enquiry|Free Mobile 15|WebnTest|
