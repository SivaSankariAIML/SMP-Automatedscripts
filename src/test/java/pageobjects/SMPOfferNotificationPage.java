package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SMPOfferNotificationPage {

    @FindBy(how = How.XPATH, using = "//*[@id=\"plan_id_all\"]")
    public static WebElement Allplans;

    @FindBy(how = How.XPATH, using = "//*[@id=\"offer_id\"]")
    public static WebElement offer;

    @FindBy(how = How.XPATH, using = "//*[@id=\"notif_id_dropdown\"]")
    public static WebElement notifications;

    @FindBy(how = How.XPATH, using = "//*[@id=\"web_message\"]")
    public static WebElement webmessage;

    @FindBy(how = How.XPATH, using = "//*[@id=\"sms_message\"]")
    public static WebElement smsmessage;

    @FindBy(how=How.XPATH,using="/html/body/form[1]/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr[18]/td/div/input[2]")
    public static WebElement Addbutton;

    @FindBy(how=How.XPATH,using="/html/body/form[1]/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr[18]/td/div/input[1]")
    public static  WebElement Modifybutton;

    @FindBy(how=How.XPATH,using="//*[@id=\"enddate\"]")
    public static WebElement enddate;

    @FindBy(how=How.XPATH,using="//*[@id=\"Cancel_button\"]")
    public static WebElement confirm_cancelButton;
}
