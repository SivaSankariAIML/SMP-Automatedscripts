Feature:SMP Service Group Link - Partition

  @Web
  Scenario:This test scenario ensures that SMP user is able to add new partition

    Given User navigate to SMP url http://sntb1-ppsmpw-13:8080/smp_jsecure/jsp/login.jsp
    And Signin using Admin and SW50ZXJhY3Q= credentials
    And Upload SMP test data tab "SERVICEGROUPLIST"
    And click on SMP Administration link
    And click on Partitions
    And fill <servicegroup> <name> <description> <LowBalance> <MaxBalance> <BonusMax> and click on Addpartition

    Examples:

      |TB                                                            |username |password |servicegroup|name |description|LowBalance |MaxBalance  |BonusMax|
      |http://sntb1-ppsmpw-13:8080/smp_jsecure/jsp/login.jsp         |Admin    |SW50ZXJhY3Q= |Test        |Test |Not to use |20         |15000       |500     |
