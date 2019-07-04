package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SMP_CustomerServicePage {

    @FindBy(how = How.XPATH,using = "/html/body/form[1]/table/tbody/tr/td/table[3]/tbody/tr[1]/td[1]/table/tbody/tr[3]/td/p/span/a[2]")
    public static WebElement Services;

    @FindBy(how=How.XPATH,using="/html/body/form[1]/table/tbody/tr[1]/td/table[3]/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table[1]/tbody/tr/td[2]/a/img")
    public static WebElement Preferenceoffer;

    @FindBy(how=How.XPATH,using="/html/body/form[1]/table/tbody/tr[1]/td/table[3]/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table[1]/tbody/tr/td[3]/a/img")
    public static WebElement PurchaseOffer;

    @FindBy(how=How.XPATH,using="/html/body/form[1]/table/tbody/tr[1]/td/table[3]/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table[1]/tbody/tr/td[4]/a/img")
    public static WebElement AdjustmentOffer;

    @FindBy(how=How.XPATH,using="/html/body/form[1]/table/tbody/tr[1]/td/table[3]/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table[1]/tbody/tr/td[5]/a/img")
    public static WebElement Conditionaloffer;

    @FindBy(how=How.XPATH,using="//*[@id=\"PrefsButtonLayer\"]/table/tbody/tr/td/div/input[2]")
    public static WebElement Confirmoffer;

    @FindBy(how=How.XPATH,using="//*[@id=\"prefsConfirmButtonLayer\"]/table/tbody/tr/td/div/input[2]")
    public static  WebElement Saveoffer;

    @FindBy(how=How.XPATH,using="//*[@id=\"OK_button\"]")
    public static WebElement Okbutton;

    @FindBy(how=How.LINK_TEXT,using="Recharge")
    public static WebElement Rechargeclick;

    @FindBy(how=How.XPATH,using="/html/body/form[1]/table/tbody/tr/td/table[3]/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table[1]/tbody/tr/td[1]/a/img")
    public static WebElement Balancetab;


    //  Real Money---->Credit



    @FindBy(how = How.NAME, using = "balanceCreditamount")
    public static WebElement CreditAmount;

    @FindBy(how = How.NAME, using = "creditreason_code")
    public static WebElement Reasoncodedropdown;


    @FindBy(how = How.XPATH, using = " //*[@id=\"Balance_NavLayer\"]/table/tbody/tr[7]/td[1]/div/input")
    public static WebElement Creditbutton;

    @FindBy(how=How.XPATH,using="//*[@id=\"OK_button\"]")
    public static WebElement CreditOk;

//Bonus money------->Credit


    @FindBy(how=How.XPATH,using="//*[@id=\"Balance_NavLayer\"]/table/tbody/tr[3]/td[2]/input[2]")
    public static WebElement Bonusmoneyclick;



//Real Money ------>Debit

    @FindBy(how = How.NAME, using = "balanceDebitamount")
    public static WebElement DebitAmount;


    @FindBy(how = How.XPATH, using = "//*[@id=\"Balance_NavLayer\"]/table/tbody/tr[5]/td[4]/select")
    public static WebElement Reasoncodedropdown2;


    @FindBy(how = How.XPATH, using = "//*[@id=\"Balance_NavLayer\"]/table/tbody/tr[7]/td[2]/div/input")
    public static WebElement Debittbutton;



//Bonus Money----->Debit


    @FindBy(how=How.XPATH,using="//*[@id=\"Balance_NavLayer\"]/table/tbody/tr[3]/td[4]/input[2]")
    public static WebElement Bonusmoneydebitclick;

}
