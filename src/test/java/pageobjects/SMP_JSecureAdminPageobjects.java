package pageobjects;

import org.junit.experimental.categories.Category;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SMP_JSecureAdminPageobjects
{





//Console  page
@FindBy(how= How.LINK_TEXT ,using="jSecure Admin")
    public static WebElement ClickjSecureAdminConsole;

@FindBy(how =How.XPATH,using="/html/body/table/tbody/tr[1]/td/table/tbody/tr[2]/td[2]/table[2]/tbody/tr/td/ul/li[1]/a" )
    public static WebElement ClickGroupsAdd;

//SMP ADMIN Link under Management

@FindBy(how=How.LINK_TEXT,using="SMP Admin")
    public static WebElement ClickSMPAdmin;


@FindBy(how=How.XPATH,using="//*[@id=\"spid_string\"]")
    public static WebElement SelectServiceProviderAccess;


@FindBy(how =How.XPATH,using="//*[@id=\'14_FA\']" )
    public static WebElement GrantFullAccessSMPCheckbox;

@FindBy(how=How.NAME,using="Submit")
    public static WebElement ClickAddButton;

//JSecure ADMIN Link under Management

    @FindBy(how=How.LINK_TEXT,using="jSecure Admin")
    public static WebElement ClickjSecureAdminlink;


    @FindBy(how =How.XPATH,using="//*[@id=\'1_FA\']" )
    public static WebElement GrantFullAccessJSecuerCheckbox;


   //Payment ADMIN Link under Management

    @FindBy(how=How.LINK_TEXT,using="Payment Admin")
    public static WebElement ClickPaymentAdminlink;


    @FindBy(how =How.XPATH,using="//*[@id=\"2_FA\"]" )
    public static WebElement GrantFullAccessPaymentCheckbox;


    //Payment System API Link under Management

    @FindBy(how=How.LINK_TEXT,using="Payment System API")
    public static WebElement ClickPaymentSystemAPIlink;


    @FindBy(how =How.XPATH,using="//*[@id=\"2_FA\"]" )
    public static WebElement GrantFullAccessPaymentSystemCheckbox;

    //Care General Link under Management

    @FindBy(how=How.LINK_TEXT,using="Care General")
    public static WebElement ClickCareGenerallink;


    @FindBy(how =How.XPATH,using="//*[@id=\"4_FA\"]" )
    public static WebElement GrantFullAccessCareGeneralCheckbox;

    //Care Management Link under Management

    @FindBy(how=How.LINK_TEXT,using="Care Management")
    public static WebElement ClickCareManagementlink;


    @FindBy(how =How.XPATH,using="//*[@id=\"5_FA\"]" )
    public static WebElement GrantFullAccessCareManagementCheckbox;


    //Care Bundles Link under Management

    @FindBy(how=How.LINK_TEXT,using="Care Bundles")
    public static WebElement ClickCareBundleslink;


    @FindBy(how =How.XPATH,using="//*[@id=\"5_FA\"]" )
    public static WebElement GrantFullAccessCareBundlesCheckbox;


    //Care Recharge Link under Management

    @FindBy(how=How.LINK_TEXT,using="Care Recharge")
    public static WebElement ClickCareRechargelink;


    @FindBy(how =How.XPATH,using="//*[@id=\"7_FA\"]" )
    public static WebElement GrantFullAccessCareRechargeCheckbox;

//Care History Link under Management

    @FindBy(how=How.LINK_TEXT,using="Care History")
    public static WebElement ClickCareHistorylink;


    @FindBy(how =How.XPATH,using="//*[@id=\"8_FA\"]" )
    public static WebElement GrantFullAccessCareHistoryCheckbox;



//Care System API Link under Management

    @FindBy(how=How.LINK_TEXT,using="Care System API")
    public static WebElement ClickCareSystemAPIlink;


    @FindBy(how =How.XPATH,using="//*[@id=\"9_FA\"]" )
    public static WebElement GrantFullAccessCareSystemAPICheckbox;



//Rate Management Link under Management

    @FindBy(how=How.LINK_TEXT,using="Rate Management")
    public static WebElement ClickRateManagementlink;


    @FindBy(how =How.XPATH,using="//*[@id=\"10_FA\"]" )
    public static WebElement GrantFullAccessRateManagementCheckbox;



//JSecure Groups View/Modify/Delete


@FindBy(how=How.XPATH,using="/html/body/table/tbody/tr[1]/td/table/tbody/tr[2]/td[2]/table[2]/tbody/tr/td/ul/li[2]/a")
    public static WebElement ClickJSecureViewModifyDelete;


//Group Search




    @FindBy(how=How.XPATH,using="//*[@id=\"avail_users\"]")
    public static WebElement SelectAvailableUser;



    @FindBy(how=How.NAME,using="include")
    public static WebElement ClickInclude;


    @FindBy(how=How.XPATH,using="//*[@id=\"14_layer\"]/table/tbody/tr[1]/td/p/input[2]")

    public static WebElement ClickModifybutton;


    @FindBy(how=How.XPATH,using="/html/body/form[1]/table/tbody/tr[1]/td/table/tbody/tr[1]/td[2]/input[1]")

    public static WebElement ClickDone;



    @FindBy(how=How.XPATH,using="/html/body/form[1]/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[2]/input")
    public static WebElement Cleartext;




    @FindBy(how=How.XPATH,using="/html/body/form[1]/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[2]/input")
    public static WebElement EnterDescription;

    @FindBy(how=How.XPATH,using="/html/body/form[1]/table/tbody/tr[1]/td[2]/p[1]/input[2]")
    public static WebElement ClickSeachbutton;





}
