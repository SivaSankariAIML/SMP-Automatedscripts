package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SMP_LUAQ_ConfigPage {

    @FindBy(how=How.XPATH,using="/html/body/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td/table[1]/tbody/tr/td[1]/a/img")
    public static WebElement CreatenewLUAQ;

    @FindBy(how=How.XPATH,using="/html/body/form/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td/table[1]/tbody/tr[1]/td[2]/select")
    public static WebElement SP;

    @FindBy(how=How.XPATH,using="//*[@id=\"plan\"]")
    public static WebElement Rateplan;

    @FindBy(how=How.XPATH,using="/html/body/form/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td/table[1]/tbody/tr[2]/td[2]/input")
    public static WebElement BalanceThreshold;

    @FindBy(how=How.XPATH,using="/html/body/form/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td/table[1]/tbody/tr[2]/td[4]/input")
    public static WebElement Amount;

    @FindBy(how=How.XPATH,using="/html/body/form/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td/table[1]/tbody/tr[3]/td[2]/input")
    public static WebElement Daysuntil;

    @FindBy(how=How.XPATH,using="/html/body/form/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td/table[1]/tbody/tr[3]/td[4]/input")
    public static WebElement penalty;

    @FindBy(how=How.XPATH,using="/html/body/form/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td/table[2]/tbody/tr[1]/td[2]/input")
    public static WebElement warndate;

    @FindBy(how=How.XPATH,using="/html/body/form/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td/table[3]/tbody/tr[3]/td/input[1]")
    public static WebElement Add;


}
