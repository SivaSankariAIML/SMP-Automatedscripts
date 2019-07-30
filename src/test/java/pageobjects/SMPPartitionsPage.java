package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SMPPartitionsPage {

    @FindBy(how = How.XPATH,using = "/html/body/table/tbody/tr[2]/td[4]/table[2]/tbody/tr/td/p/span/a[2]")
    public static WebElement Partitions;

    @FindBy(how = How.XPATH,using = "//*[@id=\"ssn\"]")
    public static WebElement Servicegroup;

    @FindBy(how = How.XPATH,using = "//*[@id=\"servicegroup_name\"]")
    public static WebElement Name;

    @FindBy(how = How.XPATH,using = "//*[@id=\"low_balance\"]")
    public static WebElement LowBalance;

    @FindBy(how = How.XPATH,using = "/html/body/form[1]/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr[9]/td[2]/input[1]")
    public static WebElement MaxBalance;

    @FindBy(how = How.XPATH,using = "/html/body/form[1]/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr[10]/td[2]/input[1]")
    public static WebElement BonusBalance;

    @FindBy(how = How.XPATH,using = "/html/body/form[1]/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr[11]/td[2]/textarea")
    public static WebElement Description;

    @FindBy(how = How.XPATH,using = "/html/body/form[1]/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr[13]/td/div/input[2]")
    public static WebElement Add_partition;

    @FindBy(how=How.XPATH,using="/html/body/form[1]/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr[13]/td/div/input[1]")
    public static  WebElement Modify_Partition;

    @FindBy(how=How.XPATH,using="/html/body/form[1]/table/tbody/tr/td/table/tbody/tr[4]/td/div/input")
    public static WebElement Delete_partition;

    @FindBy(how=How.XPATH,using="//*[@id=\"iiAlert_h\"]")
    public static WebElement alert;

    @FindBy(how=How.XPATH,using="//*[@id=\"iiAlert_h\"]//span[1]")
    public static WebElement alertMsg;

    @FindBy(how=How.XPATH,using="//*[@id=\"alert_button\"]")
    public static WebElement alertOkBtn;

    @FindBy(how=How.XPATH,using="//*[@id=\"Cancel_button\"]")
    public static WebElement confirm_cancelButton;


    @FindBy(how = How.XPATH,using = "//*[@name=\"Map\"]")
    public static WebElement HomeArea;

    @FindBy(how = How.XPATH,using = "//*[@name=\"Map\"]/area[1]")
    public static WebElement Home;
}
