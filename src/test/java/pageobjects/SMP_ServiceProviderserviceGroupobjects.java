package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SMP_ServiceProviderserviceGroupobjects {



    //Add

@FindBy(how= How.XPATH,using="/html/body/table/tbody/tr/td/table[2]/tbody/tr/td[1]/table/tbody/tr[4]/td/p/span/a[6]")
    public static WebElement ClickNotificationslink;




    @FindBy(how= How.XPATH,using="//*[@id='contentCell']/table/tbody/tr[2]/td/table/tbody/tr[1]/td[3]/a/img")
    public static WebElement ClickServiceGroupTab;




    @FindBy(how= How.XPATH,using="//*[@id=\"ServiceGroups_NavLayer\"]/table[1]/tbody/tr/td/a/img")
    public static WebElement ClickCreateNew;


    @FindBy(how= How.XPATH,using="/html/body/form/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr[3]/td[2]/p/select")
    public static WebElement SelectNotification;



    @FindBy(how= How.XPATH,using="/html/body/form/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr[3]/td[4]/p/select")
    public static WebElement SelectSGID;




    @FindBy(how= How.XPATH,using="/html/body/form/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr[8]/td[2]/textarea")
    public static WebElement EnterWebText;



    @FindBy(how= How.XPATH,using="/html/body/form/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr[11]/td[2]/textarea")
    public static WebElement EnterSMSText;


    @FindBy(how= How.XPATH,using="/html/body/form/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr[14]/td[2]/textarea")
    public static WebElement EnterIVRText;



    @FindBy(how= How.XPATH,using="//*[@id=\"plan_id_all\"]")
    public static WebElement ClickAllplan;

    @FindBy(how= How.XPATH,using="/html/body/form/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr[16]/td/div/input[2]")
    public static WebElement ClickAddbutton;



    //Modify



    @FindBy(how= How.XPATH,using="/html/body/form/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr[8]/td[2]/textarea")
    public static WebElement ClearandEntertWebtext;


    @FindBy(how= How.XPATH,using="/html/body/form/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr[16]/td/div/input[1]")
    public static WebElement ClickSGModifybutton;

//Delete

    @FindBy(how=How.ID,using="enddate_calendar_show")
    public static WebElement ClickEDatepicker;

    @FindBy(how=How.LINK_TEXT,using="8")
    public static WebElement ClickDate;







}
