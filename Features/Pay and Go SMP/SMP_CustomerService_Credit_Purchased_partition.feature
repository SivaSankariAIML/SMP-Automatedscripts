Feature:Customer Service Credit Purchased partition
  @Web
  Scenario Outline:
  This test scenario ensures that SMP user ia able to credit Purchased partition

    Given  I am SMP user and I navigate to SMP <URL> url
    And  Signin using <Username> and <Password> credentials
    And click on Customer Service link
    And enter <MSISDN> and click on Search
    And Click Recharge Link under the Menu
    And Click Partition Tab and select <PartitionName> <Partition> <Value> <ReasonCode> and click on Debit



    Examples:

      |URL                                                   |Username|Password |MSISDN       |PartitionName|Partition |Value|ReasonCode      |
      |http://sntb1-ppsmpw-11:8080/smp_jsecure/jsp/login.jsp |Admin   |SW50ZXJhY3Q= |07347161875  |Data Big Bundle|Purchased|3    |Internal Testing|
