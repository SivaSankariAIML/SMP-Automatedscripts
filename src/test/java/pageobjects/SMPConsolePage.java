package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SMPConsolePage {

    @FindBy(how = How.XPATH,using = "/html/body/table/tbody/tr[2]/td[3]/table[2]/tbody/tr/td/span/a[5]")
    public static WebElement SMPAdmin;

    @FindBy(how = How.XPATH,using = "/html/body/table/tbody/tr[2]/td[3]/table[2]/tbody/tr/td/span/a[1]")
    public static WebElement CustomerService;

    @FindBy(how = How.XPATH,using = " /html/body/form[1]/table/tbody/tr/td/table[2]/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[2]/input")
    public static WebElement MSISDN;

    @FindBy(how = How.XPATH,using = "/html/body/form[1]/table/tbody/tr/td/table[2]/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/div/input")
    public static WebElement Search;

    @FindBy(how = How.XPATH,using = "//*[@title=\"Home\"]")
    public static WebElement Home;

    @FindBy(how = How.XPATH,using = "//*[@id=\"home\"]//a")
    public static WebElement Console;
}
