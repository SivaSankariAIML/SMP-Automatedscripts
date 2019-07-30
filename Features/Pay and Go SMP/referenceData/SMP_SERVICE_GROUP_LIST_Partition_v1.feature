Feature:SMP Service Group Link - Partition

  @Web
  Scenario:This test scenario ensures that SMP user is able to add new partition

    Given User navigate to SMP url http://sntb1-ppsmpw-13:8080/smp_jsecure/jsp/login.jsp
    And Signin using Admin and SW50ZXJhY3Q= credentials
    And Upload SMP test data tab "SERVICEGROUPLIST"