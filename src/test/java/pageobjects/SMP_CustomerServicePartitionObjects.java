package pageobjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SMP_CustomerServicePartitionObjects {




    @FindBy(how=How.XPATH,using="/html/body/form[1]/table/tbody/tr/td/table[3]/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table[1]/tbody/tr/td[2]/a/img")
    public static WebElement ClickPartitionTab;


    @FindBy(how=How.NAME,using="credit_service_group")
    public static WebElement SelectCreditPatitionName;


    @FindBy(how=How.NAME,using="creditpartitiontype")
    public static WebElement SelectCreditPatitionType;


    @FindBy(how=How.NAME,using="partitionCreditamount")
    public static WebElement CreditValue;

    @FindBy(how=How.NAME,using="credit_reason_code")
    public static WebElement SelectCreditReasoncode;

    @FindBy(how=How.XPATH,using="//*[@id='Partition_NavLayer']/table/tbody/tr[9]/td[1]/div/input")
    public static WebElement ClickCreditButton;


//Debit Partition



    @FindBy(how=How.NAME,using="debit_service_group")
    public static WebElement SelectDebitPatitionName;



    @FindBy(how=How.NAME,using="debitpartitiontype")
    public static WebElement SelectDebitPatitionType;



    @FindBy(how=How.NAME,using="partitionDebitamount")
    public static WebElement DebitValue;


    @FindBy(how=How.NAME,using="debit_reason_code")
    public static WebElement SelectDebitReasoncode;


    @FindBy(how=How.XPATH,using="//*[@id='Partition_NavLayer']/table/tbody/tr[9]/td[2]/div/input")
    public static WebElement ClickDebitButton;




}

