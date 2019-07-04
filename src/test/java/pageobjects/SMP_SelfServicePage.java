package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SMP_SelfServicePage {

    @FindBy(how=How.XPATH,using="/html/body/table/tbody/tr[3]/td[2]/table[2]/tbody/tr/td/p/span/a[6]")
    public static WebElement Businessprocess;

    @FindBy(how=How.XPATH,using="/html/body/table/tbody/tr[3]/td[2]/table[2]/tbody/tr/td/p/span/a[1]")
    public static WebElement Responses;

    @FindBy(how=How.XPATH,using="/html/body/table/tbody/tr[3]/td[2]/table[2]/tbody/tr/td/p/span/a[2]")
    public static WebElement Actionsets;

    @FindBy(how=How.XPATH,using="/html/body/table/tbody/tr[3]/td[2]/table[2]/tbody/tr/td/p/span/a[3]")
    public static WebElement Ruleparameters;

    @FindBy(how=How.XPATH,using="/html/body/table/tbody/tr[3]/td[2]/table[2]/tbody/tr/td/p/span/a[4]")
    public static WebElement VRS;

    @FindBy(how=How.XPATH,using="/html/body/table/tbody/tr[3]/td[2]/table[2]/tbody/tr/td/p/span/a[5]")
    public static WebElement Requests;

    @FindBy(how=How.XPATH,using="/html/body/form[1]/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table/tbody/tr[2]/td[2]/input")
    public static WebElement BPID;

    @FindBy(how=How.XPATH,using="/html/body/form[1]/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table/tbody/tr[2]/td[2]/input")
    public static WebElement BPDescription;

    @FindBy(how=How.XPATH,using="/html/body/form[1]/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table/tbody/tr[4]/td/div/input[2]")
    public static WebElement AddBP;

    @FindBy(how=How.XPATH,using="/html/body/form[1]/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/div/input")
    public static WebElement DeleteBP;

    @FindBy(how=How.XPATH,using="//*[@id=\"CreateNewWEB\"]")
    public static WebElement CreatenewWebRequests;

    @FindBy(how=How.XPATH,using="/html/body/form/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[2]/select")
    public static WebElement SPID;

    @FindBy(how=How.XPATH,using="/html/body/form/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[4]/select")
    public static WebElement Plan;

    @FindBy(how=How.XPATH,using="/html/body/form/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td[4]/select")
    public static WebElement BusinessProcess;

    @FindBy(how=How.XPATH,using="/html/body/form/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td[2]/select")
    public static WebElement ReqID;

    @FindBy(how=How.XPATH,using="/html/body/form/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]/table/tbody/tr[5]/td[2]/select")
    public static WebElement ValidationRequests;

    @FindBy(how=How.XPATH,using="/html/body/form/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]/table/tbody/tr[8]/td/center/input[2]")
    public static WebElement AddWebRequest;


}
