package pageobjects;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;

public class SMP_OrderprocessingPage {

    @FindBy(how=How.XPATH,using="/html/body/form[1]/table/tbody/tr[1]/td/table[3]/tbody/tr[1]/td[1]/table/tbody/tr[5]/td/span/a")
    public static WebElement clickOrderProcessing;

    @FindBy(how=How.XPATH,using="/html/body/form[1]/table/tbody/tr[1]/td/table[3]/tbody/tr[1]/td[2]/table/tbody/tr[3]/td[2]/select")
    public  static  WebElement SelectOrderType;

    @FindBy(how=How.NAME,using="verify")
    public static  WebElement ClickVerify;

    @FindBy(how=How.XPATH,using="//*[@id=\"DisconnectSubmit\"]")
    public static WebElement ClickSubmit;
}
