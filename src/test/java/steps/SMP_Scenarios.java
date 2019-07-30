package steps;

import java.io.IOException;
import java.util.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

import GlobalActions.*;
import actionsPerformed.*;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.MSExcel;
import helpers.SMPDataStructure;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.testng.Assert;

import pageobjects.NewPAYGOffers;

public class SMP_Scenarios {

    private static final String Filteroption = null;
    public WebDriver driver;
    public List<HashMap<String, String>> datamap;
    String FilterDataOption = null;
    LinkedList<String> expectedListBeforeSort = null;
    LinkedList<String> originalList = null;
    ArrayList<Integer> originalTariffList = null;
    ArrayList<Integer> expectedTariffListBeforeSort = null;
    LinkedList<String> TempList3 = null;
    String DataFilterRange = null;
    ArrayList<Integer> datalistbefore = new ArrayList<Integer>();
    ArrayList<Integer> datalistafter = new ArrayList<Integer>();
    ArrayList<Integer> monthlycostlistafter = new ArrayList<Integer>();
    ArrayList<Integer> upfrontcostlistafter = new ArrayList<Integer>();
    final static Logger log = Logger.getLogger("SMP_Scenarios");
    static int BuyOutValue = 0;
    static int TradeInValue = 0;
    public static Hashtable selectedElements = new Hashtable();
    static String expPlnList;

    public SMP_Scenarios() {
        driver = Hooks.driver;
        // datamap = DataReader.data();

    }

    /**
     * ############## All the Below are for the Navigation Journeys
     */
    @Given("^I am SMP user and I navigate to SMP ([^\"]*) url$")
    @When("^User navigate to SMP url ([^\"]*)$")
    public void I_am_SMP_user_and_I_navigate_to_SMP_TB_url(String url) {
        try {
            driver.get(url);
            String PageTitle = driver.getTitle();
            log.debug("The Page title is " + PageTitle);
            log.debug("Currently we are at " + PageTitle + " page");
            Thread.sleep(4000);
            Screenshots.captureScreenshot();

        } catch (Exception e) {
            // TODO Auto-generated catch block
            log.debug("unable to get title");
            Assert.fail("unable to get title");
        }

    }

    @And("^Signin using ([^\"]*) and ([^\"]*) credentials$")
    public void Signin_using_credentials(String username, String password) {
        try {
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            PageFactory.initElements(driver, SMPLoginPageActions.class);
            System.out.println("Login enter");
            log.debug(username);
            log.debug(password);
            SMPLoginPageActions.Login_SMP(username, password);
            Screenshots.captureScreenshot();

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            log.debug("Unable to signin using credentials at SMP login page");
            Assert.fail("Unable to signin using credentials at SMP login page");

        }
    }

    @And("^click on SMP Administration link$")
    public void click_on_SMP_Administration_link() {
        try {
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            // PageFactory.initElements(driver,SMPConsolePageActions.class);
            SMPConsolePageActions.Select_SMPAdmin();
            log.debug("test");
            Screenshots.captureScreenshot();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            log.debug("Cannot find Link");
            Assert.fail("Cannot find link");
        }
    }
    @And("^click on Home link$")
    public void click_on_Home_link() {
        try {
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            SMPConsolePageActions.Select_Home();
            log.debug("test");
            Screenshots.captureScreenshot();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            log.debug("Cannot find Link");
            Assert.fail("Cannot find link");
        }
    }
    @And("^click on Console link$")
    public void click_on_Console_link() {
        try {
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            SMPConsolePageActions.Select_Console();
            log.debug("test");
            Screenshots.captureScreenshot();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            log.debug("Cannot find Link");
            Assert.fail("Cannot find link");
        }
    }

    @And("^click on Services$")
    public void click_on_Services() {
        try {
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            // PageFactory.initElements(driver, SMPAdminPage.class);
            SMPAdminPageActions.Click_Services();
            Screenshots.captureScreenshot();
        } catch (Exception e) {

            log.debug("Cannot find Services link");
            Assert.fail("Cannot find services link");
        }
    }


    @And("^click on Create new link$")
    public void click_on_create_new_link() throws IOException, InterruptedException {
        try {
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            // PageFactory.initElements(driver, SMPAdminPage.class);
            SMPServicesPageActions.Create_new();
            Screenshots.captureScreenshot();
        } catch (Exception e) {

            log.debug("New service page is not displayed");
            Assert.fail("New service page is not displayed");
        }

    }

    @And("^fill ([^\"]*) and ([^\"]*) ([^\"]*) ([^\"]*) and click on Add$")
    public void fill_details_and_click_on_Add(String name, String description, String SyntaxON, String SyntaxOFF) throws IOException, InterruptedException

    {
        try {
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            // PageFactory.initElements(driver, SMPAdminPage.class);
            SMPServicesPageActions.Fill_details(name, description, SyntaxON, SyntaxOFF);
            Screenshots.captureScreenshot();
        } catch (Exception e) {

            log.debug("Service not created successfully");
            Assert.fail("Service not created successfully");
        }
    }

    @And("^click on Modify link against ([^\"]*)$")
    public void click_on_modify_link_against_name(String name) throws InterruptedException, IOException {
        try {
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            // PageFactory.initElements(driver, SMPAdminPage.class);
            SMPModifyPageActions.Modify_service_link(name);
            System.out.println("out");
            Screenshots.captureScreenshot();
        } catch (Exception e) {

            log.debug("Modify link is not clicked");
            Assert.fail("Modify link is not clicked");
        }

    }

    @And("^modify ([^\"]*) and click on Modify and OK$")
    public void modify_description_and_click_on_Modify(String description) throws InterruptedException, IOException {

        try {
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            // PageFactory.initElements(driver, SMPAdminPage.class);
            SMPModifyPageActions.Modify_service(description);
            Screenshots.captureScreenshot();
        } catch (Exception e) {

            log.debug("Modify not a success");
            Assert.fail("Modify not a success");
        }

    }

    @And("^click on Delete checkbox against ([^\"]*) and Delete$")
    public void click_on_delete_checkbox_against_name(String name) throws InterruptedException, IOException {

        try {
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            // PageFactory.initElements(driver, SMPAdminPage.class);
            SMPServicesPageActions.Delete_service(name);
            Screenshots.captureScreenshot();
        } catch (Exception e) {

            log.debug("Delete not a success");
            Assert.fail("Delete not a success");
        }

    }

    @And("^click on Partitions$")
    public void click_on_partitions() {
        try {
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            // PageFactory.initElements(driver, SMPAdminPage.class);
            SMPPartitionPageActions.Partitions();
            Screenshots.captureScreenshot();
        } catch (Exception e) {

            log.debug("Unable to click on Partitions link");
            Assert.fail("Unable to click on Partitions link");
        }
    }

    @And("^fill ([^\"]*) ([^\"]*) ([^\"]*) ([^\"]*) ([^\"]*) ([^\"]*) and click on Addpartition$")
    public void fill_details_and_click_on_Addpartition(String servicegroup, String name, String LowBalance, String MaxBalance, String BonusMax, String description) {
        try {
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            // PageFactory.initElements(driver, SMPAdminPage.class);
            SMPPartitionPageActions.Fill_Partition_details(servicegroup, name, LowBalance, MaxBalance, BonusMax, description);
            Screenshots.captureScreenshot();
        } catch (Exception e) {

            log.debug("Unable to add Partition");
            Assert.fail("Unable to add Partition");
        }
    }

    @And("^click on Modify link for partition ([^\"]*)$")
    public void click_on_modify_link_for_partition(String name) {
        try {
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            // PageFactory.initElements(driver, SMPAdminPage.class);
            SMPPartitionPageActions.Modify_partition_link(name);
            Screenshots.captureScreenshot();
        } catch (Exception e) {

            log.debug("Unable to click Modify Partition");
            Assert.fail("Unable to click Modify Partition");
        }

    }


    @And("^modify ([^\"]*) ([^\"]*) ([^\"]*) and click on Modify$")
    public void modify_details_and_click_on_modify(String description, String LowBalance, String BonusMax) {
        try {
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            // PageFactory.initElements(driver, SMPAdminPage.class);
            SMPPartitionPageActions.Modify_partition(description, LowBalance, BonusMax);
            Screenshots.captureScreenshot();
        } catch (Exception e) {

            log.debug("Unable to modify Partition");
            Assert.fail("Unable to modify Partition");
        }

    }

    @And("^click Delete against partition([^\"]*) and Delete$")
    public void click_on_delete_checkbox_against_partition_name(String name) throws InterruptedException, IOException {

        try {
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            // PageFactory.initElements(driver, SMPAdminPage.class);
            SMPPartitionPageActions.Delete_partition(name);
            Screenshots.captureScreenshot();
        } catch (Exception e) {

            log.debug("Delete not a success");
            Assert.fail("Delete not a success");
        }

    }

    @And("^click Delete against partition id([^\"]*) and Delete$")
    public void click_on_delete_checkbox_against_partition_id(String serviceGroupId) throws InterruptedException, IOException {

        try {
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            // PageFactory.initElements(driver, SMPAdminPage.class);
            SMPPartitionPageActions.Delete_partition(serviceGroupId);
            Screenshots.captureScreenshot();
        } catch (Exception e) {

            log.debug("Delete not a success");
            Assert.fail("Delete not a success");
        }

    }

    @And("^click on Bundle Configurations add bundle ([^\"]*) ([^\"]*) ([^\"]*) ([^\"]*) ([^\"]*) ([^\"]*)$")
    public void click_on_bundle_configurations(String bundlename, String description, String service1, String service2, String service3, String service4) throws InterruptedException, IOException {

        try {
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            SMP_Bundlepageactions.BundleConfigurations();
            SMP_Bundlepageactions.Createnew();
            SMP_Bundlepageactions.Filldetails(bundlename, description);
            SMP_Bundlepageactions.AddServices(service1, service2, service3, service4);
            Screenshots.captureScreenshot();
        } catch (Exception e) {

            log.debug("Bundle not added");
            Assert.fail("Bundle not added");
        }
    }


    @And("^add partition ([^\"]*) ([^\"]*) ([^\"]*) ([^\"]*) ([^\"]*) and click on Add$")
    public void add_partition(String SG, String PartType, String PartAction, String value, String LifeSpan) throws InterruptedException, IOException {

        try {
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            SMP_Bundlepageactions.Addpartition(SG, PartType, PartAction, value, LifeSpan);
            Screenshots.captureScreenshot();
        } catch (Exception e) {

            log.debug("Partition not added");
            Assert.fail("Partition not added");
        }
    }


    @And("^click on Bundle Configurations modify ([^\"]*) against ([^\"]*)$")
    public void modify_bundle(String bundledescription, String bundlename) throws InterruptedException, IOException {

        try {
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            SMP_Bundlepageactions.ModifyBundle(bundledescription, bundlename);
            Screenshots.captureScreenshot();
        } catch (Exception e) {

            log.debug("Bundle not modified");
            Assert.fail("Bundle not modified");
        }

    }


    @And("^click on Bundle Configurations and click on delete against ([^\"]*) and confirm deletion$")
    public void delete_bundle(String bundlename) throws InterruptedException, IOException {

        try {
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            SMP_Bundlepageactions.DeleteBundle(bundlename);
            SMP_Bundlepageactions.Confirmbundle(bundlename);
            Screenshots.captureScreenshot();
        } catch (Exception e) {

            log.debug("Bundle not deleted");
            Assert.fail("Bundle not deleted");
        }

    }


    @And("^Upload SMP test data tab \"([^\"]*)\"$")
    public void read_SMP_test_data_tab(String tabName) throws IOException, InterruptedException {
        MSExcel msExcel = new MSExcel();
        msExcel.setTabName(tabName);
        SMPDataStructure smpDataStructure = new SMPDataStructure("C:\\Automation\\SMP\\Configurations\\testData\\testdata_SMP.xlsx");
        HashMap<String, String> sheetRow = new HashMap<String, String>();
        String actionToPerform;
        click_on_SMP_Administration_link();
        int numColumns = msExcel.getLastCol(1);
        String cellFontColor, cellBGColor;
        //Reading Spreadsheet row by row
        for (int i=1;numColumns>0;i++) {
            actionToPerform="";
            numColumns = msExcel.getLastCol(i); // numbers of column in the currentRow
            for (int j = 0;j<numColumns; j++) {
                cellFontColor="";
                cellBGColor="";
                sheetRow.put(msExcel.readCell(0, j).get("value"),msExcel.readCell(i, j).get("value"));
                cellFontColor = msExcel.readCell(i, j).get("fontColor");
                cellBGColor = msExcel.readCell(i, j).get("cellColor");
                if(actionToPerform.equalsIgnoreCase("") && cellFontColor.equalsIgnoreCase("FF7030A0")){ //Purple
                    actionToPerform="addNew";
                }
                if(actionToPerform.equalsIgnoreCase("") && cellFontColor.equalsIgnoreCase("FFFF0000")){ //Red
                    actionToPerform="modify";
                }
                if(actionToPerform.equalsIgnoreCase("") && cellBGColor.equalsIgnoreCase("FFFFFF00")){ //Yellow
                    actionToPerform="delete";
                }
            }
            if(sheetRow.size()>0)
            System.out.print("\n::"+i+"::"+sheetRow);
            // Actions for the first row
            //Click
            try {
                switch (tabName.toUpperCase()) {
                    case "OFFER TEXT REAL":
                        if (actionToPerform.equalsIgnoreCase("addNew")) {
                            System.out.println("\nAdding Offer TEXT REAL data ...");
                            addOfferText(sheetRow.get("SPID"), smpDataStructure.decode(sheetRow.get("OFFER"), "OFFERS REAL", "OFFER", "NAME"), smpDataStructure.notificationType.get(sheetRow.get("NOTIFICATION_ID")), sheetRow.get("SMS_MESSAGE"));
                        }
                        if (actionToPerform.equalsIgnoreCase("delete")) {
                            System.out.println("\ndeleting Offer TEXT REAL data ... to be implemented");
                        }
                        if (actionToPerform.equalsIgnoreCase("modify")) {
                            System.out.println("\nModifying Offer TEXT REAL data ...");
                            modifyOfferText(sheetRow.get("SPID"), smpDataStructure.decode(sheetRow.get("OFFER"), "OFFERS REAL", "OFFER", "NAME"), smpDataStructure.notificationType.get(sheetRow.get("NOTIFICATION_ID")), sheetRow.get("SMS_MESSAGE"), sheetRow.get("WEB_MESSAGE")); //WebMessage
                        }
                        break;
                    case "SERVICEGROUPLIST":{
                        if (actionToPerform.equalsIgnoreCase("addNew")) {
                            System.out.println("\nAdding Service Partation data ...");
                            addServicePartition(sheetRow.get("SERVICEGROUPID"),sheetRow.get("NAME"), sheetRow.get("LOW_BALANCE"),sheetRow.get("MAX_BALANCE"), sheetRow.get("MAX_BONUS_BALANCE"), sheetRow.get("DESCRIPTION"));
                        }
                        if (actionToPerform.equalsIgnoreCase("delete")) {
                            System.out.println("\nDeleting Service Partation data ...");
                            deleteServicePartition(sheetRow.get("SERVICEGROUPID"));
                        }
                        if (actionToPerform.equalsIgnoreCase("modify")) {
                            System.out.println("\nModify Service Partation data ...");
                            modifyServicePartition(sheetRow.get("SERVICEGROUPID"), sheetRow.get("LOW_BALANCE"),sheetRow.get("MAX_BALANCE"), sheetRow.get("MAX_BONUS_BALANCE"), sheetRow.get("DESCRIPTION"));
                        }
                        break;
                    }
                }
                sheetRow.clear(); // Clearing the sheet
            }catch(Exception ex){
                System.out.println(ex.toString());
                //msExcel.writeCell(i, 14,"FAIL");
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }

    }
// Offer Text
    public void addOfferText(String spid, String offerName,  String notification, String sms){
        try {
            System.out.println("Adding... Offer ["+offerName+"] notification ["+notification+"] sms["+sms+"]");
            click_on_Service_Providers_link(spid);
            click_on_Notifications_link();
            click_on_Offers_tab_and_Create_new_link();
            fill_in_details_and_click_add(offerName, notification, sms); //notification not coming from Spreadsheet, Offer Text is derived from Offers REAL Tab
            click_on_Home_link();
            Thread.sleep(1000);
        }catch(Exception ex){
            System.out.println(ex.toString());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
    public void modifyOfferText(String spid, String offerName, String notification, String sms, String webMsg){
        try {
            System.out.println("Modifying... Offer ["+offerName+"] notification ["+notification+"] sms["+sms+"]");
            click_on_Service_Providers_link(spid);
            click_on_Notifications_link();
            click_on_offers_tab_click_on_modify_link(notification,offerName);
            modify_smsmessage_webmessage(sms,webMsg);
            //check_if_notifications_home_page();
            click_on_Home_link();
            Thread.sleep(1000);

        }catch(Exception ex){
            System.out.println(ex.toString());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
//Service Pariation
    public void addServicePartition(String serviceGroup, String name, String lowBalance, String maxBalance, String bonusMax, String description){
        try{
            click_on_partitions();
            fill_details_and_click_on_Addpartition(serviceGroup, name, lowBalance, maxBalance, bonusMax, description);
        }catch(Exception e) {
            System.out.println(e.toString());
        }
    }

    public void modifyServicePartition(String serviceGroupId, String lowBalance, String maxBalance, String bonusMax, String description){
        try{
            click_on_partitions();
            click_on_modify_link_for_partition(serviceGroupId);
            modify_details_and_click_on_modify(description, lowBalance,bonusMax);
        }catch(Exception e) {
            System.out.println(e.toString());
        }
    }
    public void deleteServicePartition(String serviceGroupId){
        try{
            click_on_partitions();
            click_on_delete_checkbox_against_partition_id(serviceGroupId);
        }catch(Exception e) {
            System.out.println(e.toString());
        }
    }

    @And("^click on Service Providers link and select ([^\"]*)$")
    public void click_on_Service_Providers_link(String SPID) throws IOException, InterruptedException {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        PageFactory.initElements(driver, SMPAdminPageActions.class);
        SMPAdminPageActions.Click_ServiceProvider(SPID);
        System.out.println("Driver");
    }

    @And("^click on Notifications link$")
    public void click_on_Notifications_link() throws IOException, InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        PageFactory.initElements(driver, SMPSPIDPageActions.class);
        //   System.out.println("Random");
        SMPSPIDPageActions.Click_notifications();
    }

    @And("^click on Offers tab and Create new link$")
    public void click_on_Offers_tab_and_Create_new_link() throws IOException, InterruptedException {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        PageFactory.initElements(driver, SMPNotificationsPageActions.class);
        SMPNotificationsPageActions.Create_new_offer();
    }


    @And("^fill details ([^\"]*) and ([^\"]*) and ([^\"]*)$")

    public void fill_in_details_and_click_add(String offer, String notID, String sms) throws IOException, InterruptedException {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        PageFactory.initElements(driver, SMPNotificationsPageActions.class);
        SMPOfferNotificationPageActions.Selectplan();
        SMPOfferNotificationPageActions.Selectoffer(offer);
        SMPOfferNotificationPageActions.Selectnotification(notID, sms);

        try {
            String pagetitle = driver.getTitle();
            log.debug("The Page title is " + pagetitle);
            log.debug("Currently we are at " + pagetitle + " page");
            Thread.sleep(4000);
            Screenshots.captureScreenshot();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            log.debug("Failed to add  new offer text");
            Assert.fail("Failed to add new offer text ");
        }
    }


    @And("^click on Offers tab and click on modify for ([^\"]*) against ([^\"]*)$")

    public void click_on_offers_tab_click_on_modify_link(String sms, String offer) throws IOException, InterruptedException {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        PageFactory.initElements(driver, SMPOfferNotificationPageActions.class);
        SMPOfferNotificationPageActions.Modifylink(sms, offer);
        Screenshots.captureScreenshot();
        try {
            String pagetitle = driver.getTitle();
            log.debug("The Page title is " + pagetitle);
            log.debug("Currently we are at " + pagetitle + " page");
            Thread.sleep(4000);
            Screenshots.captureScreenshot();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            log.debug("Failed to click modify link");
            Assert.fail("Failed to click modify link ");
        }
    }

    @And("modify ([^\"]*) and ([^\"]*) then click on Modify$")

    public void modify_smsmessage_webmessage(String smsmessage, String webmessage) throws IOException, InterruptedException {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        PageFactory.initElements(driver, SMPOfferNotificationPageActions.class);
        SMPOfferNotificationPageActions.ModifyDescription(smsmessage, webmessage);
        Screenshots.captureScreenshot();

        try {
            String pagetitle = driver.getTitle();
            log.debug("The Page title is " + pagetitle);
            log.debug("Currently we are at " + pagetitle + " page");
            Thread.sleep(4000);
            Screenshots.captureScreenshot();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            log.debug("Failed to modify");
            Assert.fail("Failed to modify ");
        }
    }


    @And("click on Customer Service link$")

    public void click_on_customer_service_link() throws IOException, InterruptedException {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        PageFactory.initElements(driver, SMPConsolePageActions.class);
        SMPConsolePageActions.Select_Customerservice();
        Screenshots.captureScreenshot();
        try {
            String pagetitle = driver.getTitle();
            log.debug("The Page title is " + pagetitle);
            log.debug("Currently we are at " + pagetitle + " page");
            Thread.sleep(4000);
            Screenshots.captureScreenshot();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            log.debug("Failed to click on Customer service link");
            Assert.fail("Failed to click on Customer service link ");
        }

    }

    @And("enter ([^\"]*) and click on Search$")

    public void enter_MSISDN_and_click_on_Search(String MSISDN) throws IOException, InterruptedException {

        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            PageFactory.initElements(driver, SMPConsolePageActions.class);
            SMPConsolePageActions.Enter_MSISDN(MSISDN);
            Screenshots.captureScreenshot();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            log.debug("Failed to fetch MSISDN");
            Assert.fail("Failed to fetch MSISDN");
        }
    }

    @And("click on Services and ([^\"]*) tab$")

    public void click_on_services_and_offertype_tab(String offertype) throws IOException, InterruptedException {
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            PageFactory.initElements(driver, SMP_CustomerServicePageActions.class);
            SMP_CustomerServicePageActions.SelectOfferType(offertype);
            Screenshots.captureScreenshot();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            log.debug("Failed to fetch MSISDN");
            Assert.fail("Failed to fetch MSISDN");
        }
    }

    @And("for ([^\"]*) select ([^\"]*) and click on Confirm and save$")

    public void select_offername_and_click_on_Confirm(String offertype, String offername) throws IOException, InterruptedException {
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            PageFactory.initElements(driver, SMP_CustomerServicePageActions.class);
            if (offertype.equals("Preferences")) {
                SMP_CustomerServicePageActions.Selectpreferenceoffer(offername);
            }

            if (offertype.equals("Purchase")) {
                SMP_CustomerServicePageActions.Selectpurchaseoffer(offername);
            }

            if (offertype.equals("Adjustment")) {
                SMP_CustomerServicePageActions.adjustmentoffer(offername);
            }

            if (offertype.equals("Conditional")) {
                SMP_CustomerServicePageActions.conditionaloffer(offername);
            }

            SMP_CustomerServicePageActions.Confirmoffer();
            Screenshots.captureScreenshot();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            log.debug("Failed to select  offer");
            Assert.fail("Failed to select  offer");
        }

    }

    @And("Click Recharge Link under the Menu$")
    public void click_recharge_link() throws IOException, InterruptedException {
        try {
            PageFactory.initElements(driver, SMP_CustomerServicePageActions.class);
            SMP_CustomerServicePageActions.ClickRecharge();
            Screenshots.captureScreenshot();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            log.debug("Failed to click on recharge link");
            Assert.fail("Failed to click on recharge link");
        }
    }

    @And("Click on Balance Tab$")
    public void Click_on_Bal_tab() throws IOException, InterruptedException {
        try {
            PageFactory.initElements(driver, SMP_CustomerServicePageActions.class);
            SMP_CustomerServicePageActions.ClickBalanceTab();
            Screenshots.captureScreenshot();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            log.debug("Failed to click on balance tab");
            Assert.fail("Failed to click on balance tab");
        }

    }

    @And("Click on Bonus Money$")
    public void Click_on_Bonus_Money() throws IOException, InterruptedException {
        try {
            PageFactory.initElements(driver, SMP_CustomerServicePageActions.class);
            SMP_CustomerServicePageActions.Clickbonus();
            Screenshots.captureScreenshot();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            log.debug("Failed to click on balance tab");
            Assert.fail("Failed to click on balance tab");
        }

    }


    @And("Enter the ([^\"]*) and select the options ([^\"]*) and click on Credit button$")
    public void Enter_the_amount_and_select_the_options_from_reasoncode(String Amount, String Reasoncode) throws IOException, InterruptedException {
        try {
            PageFactory.initElements(driver, SMP_CustomerServicePageActions.class);
            SMP_CustomerServicePageActions.Creditrealmoney(Amount, Reasoncode);
            Screenshots.captureScreenshot();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            log.debug("Failed to credit real money");
            Assert.fail("Failed to credit real money");
        }
    }

    @And("Enter the ([^\"]*) and select the debit options ([^\"]*) and click on Debit button$")
    public void Fill_debit_details(String Amount, String Reasoncode) throws IOException, InterruptedException {
        try {
            PageFactory.initElements(driver, SMP_CustomerServicePageActions.class);
            SMP_CustomerServicePageActions.Debitrealmoney(Amount, Reasoncode);
            Screenshots.captureScreenshot();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            log.debug("Failed to debit real money");
            Assert.fail("Failed to debit real money");
        }
    }




    @And("Click on jSecure Admin link$")
    public void Click_jsecureAdmin_Linkconsole() throws IOException, InterruptedException {

        try {
            PageFactory.initElements(driver, SMP_JSecureAdmin_ManagementPageActions.class);
            SMP_JSecureAdmin_ManagementPageActions.ClickJSecureAdminConsole();


            Screenshots.captureScreenshot();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            log.debug("Failed to click on Jsecure Admin link");
            Assert.fail("Failed to click on Jsecure Admin link");
        }
    }


  /*
    @And("^Click Category link$")
    public void click_Category_link(DataTable category) throws Throwable  {
        List<String> list = category.asList(String.class);

        //System.out.println("Category - " + list.get(1));
        for(int i=0;i<=list.size();i++) {
            System.out.println("Category - " + list.get(i));
            try {


                PageFactory.initElements(driver, SMP_JSecureAdmin_ManagementPageActions.class);
                SMP_JSecureAdmin_ManagementPageActions.ClickCategory(list.get(i));


                Screenshots.captureScreenshot();



            } catch (Exception e) {
                // TODO Auto-generated catch block
                log.debug("Failed to click on order processing");
                Assert.fail("Failed to click on order processing");
            }
            Thread.sleep(5000);
        }
    }

*/


    /*


      */
    @And("^Select service provider in \"([^\"]*)\"$")
    public void select_Service_provider_in(String CorrespondingAdmin) throws Throwable {

        try {
            PageFactory.initElements(driver, SMP_JSecureAdmin_ManagementPageActions.class);
            SMP_JSecureAdmin_ManagementPageActions.SelectServiceprovider(CorrespondingAdmin);
            Screenshots.captureScreenshot();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            log.debug("Failed Select service provider");
            Assert.fail("Failed Select service provider");
        }


    }



/*

    @And("^Click Grant Full Access CorrespondingAdmin check$")
    public void click_Grant_Full_Access_CorrespondingAdmin_check(DataTable GrantAccess) throws Throwable  {

        List<String> list = GrantAccess.asList(String.class);

        //System.out.println("GrantAccess - " + list.get(1));

        for(int i=0;i<=list.size();i++) {
            System.out.println("GrantAccess - " + list.get(i));

            try {

                PageFactory.initElements(driver, SMP_JSecureAdmin_ManagementPageActions.class);
                SMP_JSecureAdmin_ManagementPageActions.ClickAllcheckbox(list.get(i));


                Screenshots.captureScreenshot();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                log.debug("Failed to click on order processing");
                Assert.fail("Failed to click on order processing");
            }
        }

    }



*/


    @And("Click Add button$")
    public void Click_Addbutton() throws IOException, InterruptedException {
        try {
            PageFactory.initElements(driver, SMP_JSecureAdmin_ManagementPageActions.class);
            //        SMP_JSecureAdmin_ManagementPageActions.ClickAddbutton();
            Screenshots.captureScreenshot();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            log.debug("Failed to click on Add button");
            Assert.fail("Failed to click on Add button");
        }
    }




    @And("^Click Grant Full Access \"([^\"]*)\" check$")
    public void click_Grant_Full_Accesscheck(String CorrespondingAdmin) throws Throwable {

        try {
            PageFactory.initElements(driver, SMP_JSecureAdmin_ManagementPageActions.class);
            SMP_JSecureAdmin_ManagementPageActions.ClickAllcheckbox(CorrespondingAdmin);
            Screenshots.captureScreenshot();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            log.debug("Failed to click on Grant Full Access");
            Assert.fail("Failed to click on Grant Full Access");
        }
    }






    @And("^Search the \"([^\"]*)\" and Click Delete$")
    public void search_the_and_Click_Delete(String Description) throws Throwable {

        try {
            PageFactory.initElements(driver, SMP_JSecureAdmin_ManagementPageActions.class);
            SMP_JSecureAdmin_ManagementPageActions.ClickJSecureDelete(Description);
            Screenshots.captureScreenshot();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            log.debug("Failed to click on Delete");
            Assert.fail("Failed to click on Delete");
        }


    }

    @And("^Select Available user in \"([^\"]*)\" and click include$")
    public void select_Available_user_in_and_click_include(String Users) throws Throwable {

        try {
            PageFactory.initElements(driver, SMP_JSecureAdmin_ManagementPageActions.class);
            SMP_JSecureAdmin_ManagementPageActions.SelectUsers(Users);
            SMP_JSecureAdmin_ManagementPageActions.Clickinclude();

            Screenshots.captureScreenshot();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            log.debug("Failed to Select users and Click");
            Assert.fail("Failed to Select users and Click");
        }
    }

    @And("^modify button and dond button$")
    public void modify_button_and_dond_button() {

        try {
            PageFactory.initElements(driver, SMP_JSecureAdmin_ManagementPageActions.class);

            SMP_JSecureAdmin_ManagementPageActions.ClickModifybutton();
            SMP_JSecureAdmin_ManagementPageActions.ClickDonebutton();

            Screenshots.captureScreenshot();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            log.debug("Failed to Select users and Click");
            Assert.fail("Failed to Select users and Click");
        }
    }


    @And("^clear the text and Enter the \"([^\"]*)\" and click search$")
    public void clear_the_text_and_Enter_the_and_click_search(String Descriptions) throws Throwable {


        try {
            PageFactory.initElements(driver, SMP_JSecureAdmin_ManagementPageActions.class);

            //    SMP_JSecureAdmin_ManagementPageActions.ClearSearchtextandenterDescription(Descriptions);
            Screenshots.captureScreenshot();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            log.debug("Failed to Clear and Enter Notification");
            Assert.fail("Failed to Clear and Enter Notification");
        }


    }


    @And("^click on ServiceGroup tab and click on CreateNew$")
    public void click_on_ServiceGroup_tab_and_click_on_CreateNew() throws Throwable {

        try {
            PageFactory.initElements(driver, SMP_ServiceProviderserviceGroupActions.class);
            SMP_ServiceProviderserviceGroupActions.ClickServiceGroupTab();
            SMP_ServiceProviderserviceGroupActions.ClickCreateNew();
            Screenshots.captureScreenshot();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            log.debug("Failed to click on Servicegroup and Createnew");
            Assert.fail("Failed to click on Servicegroup and Createnew");
        }


    }


    @Given("^Select \"([^\"]*)\" from SG notifications and \"([^\"]*)\"$")
    public void select_from_SG_notifications_and(String Notification, String SGID) throws Throwable {

        try {
            PageFactory.initElements(driver, SMP_ServiceProviderserviceGroupActions.class);
            SMP_ServiceProviderserviceGroupActions.SelectNotioficationandSGID(Notification, SGID);

            Screenshots.captureScreenshot();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            log.debug("Failed to click on SGModify");
            Assert.fail("Failed to click on SGModify");
        }


    }


    @Given("^Click All plan$")
    public void click_All_plan() throws Throwable {

        try {
            PageFactory.initElements(driver, SMP_ServiceProviderserviceGroupActions.class);
            SMP_ServiceProviderserviceGroupActions.ClickAllplan();

            Screenshots.captureScreenshot();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            log.debug("Failed to click on Allplans");
            Assert.fail("Failed to click on Allplans");
        }


    }


    @And("^add \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void add_and_and(String webmessage, String smsmessage, String IVRmessage) throws Throwable {


        try {
            PageFactory.initElements(driver, SMP_ServiceProviderserviceGroupActions.class);
            SMP_ServiceProviderserviceGroupActions.EnterSMSandWebandIVR(webmessage, smsmessage, IVRmessage);

            Screenshots.captureScreenshot();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            log.debug("Failed to Eneter Web,SMS,IVR");
            Assert.fail("Failed to Eneter Web,SMS,IVR");
        }


    }

    @Given("^Click SGAdd button$")
    public void click_SGAdd_button() throws Throwable {

        try {
            PageFactory.initElements(driver, SMP_ServiceProviderserviceGroupActions.class);
            //  SMP_ServiceProviderserviceGroupActions.ClickADDbutton();

            Screenshots.captureScreenshot();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            log.debug("Failed to click on SAGadd ");
            Assert.fail("Failed to click on SAGadd");
        }


    }

    @And("^click on ServiceGroup tab$")
    public void click_on_ServiceGroup_tab() throws Throwable {

        try {
            PageFactory.initElements(driver, SMP_ServiceProviderserviceGroupActions.class);
            SMP_ServiceProviderserviceGroupActions.ClickServiceGroupTab();

            Screenshots.captureScreenshot();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            log.debug("Failed to click on ServiceGroup Tab");
            Assert.fail("Failed to click on ServiceGroup Tab");
        }


    }


    @And("^Serach \"([^\"]*)\" and \"([^\"]*)\" Click modify$")
    public void serach_and_Click_modify(String Notification, String ServiceGroup) throws Throwable {
        try {
            PageFactory.initElements(driver, SMP_ServiceProviderserviceGroupActions.class);
            SMP_ServiceProviderserviceGroupActions.SGModifylink(Notification, ServiceGroup);

            Screenshots.captureScreenshot();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            log.debug("Failed to Click on SGModify");
            Assert.fail("Failed to click on SGModify");
        }


    }

    @Given("^Clear webtext and Enter \"([^\"]*)\"$")
    public void clear_webtext_and_Enter(String webmessage) throws Throwable {

        try {
            PageFactory.initElements(driver, SMP_ServiceProviderserviceGroupActions.class);
            SMP_ServiceProviderserviceGroupActions.ClearandEnterWeb(webmessage);

            Screenshots.captureScreenshot();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            log.debug("Failed to clear and Enter the WebText");
            Assert.fail("Failed to Clear and Enter the WebText");
        }


    }

    @Given("^Click modify button SGnotification$")
    public void click_modify_button_SGnotification() throws Throwable {


        try {
            PageFactory.initElements(driver, SMP_ServiceProviderserviceGroupActions.class);
            SMP_ServiceProviderserviceGroupActions.ClickSGmodify();

            Screenshots.captureScreenshot();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            log.debug("Failed to click on Modify button");
            Assert.fail("Failed to click on Modify button");
        }

    }


    @Given("^Select End date$")
    public void select_End_date() throws Throwable {

        try {
            PageFactory.initElements(driver, SMP_ServiceProviderserviceGroupActions.class);
            SMP_ServiceProviderserviceGroupActions.ClickEndDate();
            Screenshots.captureScreenshot();
        } catch (Exception e) {

            log.debug("Failed to click on Modify button");
            Assert.fail("Failed to click on Modify button");
        }
    }

    @Then("^i click on the SMP adminstration and clicks on offers$")
    public void i_click_on_the_SMP_adminstration_and_clicks_on_offers() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        PageFactory.initElements(driver, NewPAYGOffers.class);
        NewOffer_Creation.AccessOffers();
    }

    @Then("^Click on create new offer button and enter the ([^\\\"]*) and ([^\\\"]*)$")
    public void click_on_create_new_offer_button(String offerkind, String Serviceprovider) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        PageFactory.initElements(driver, NewPAYGOffers.class);
        NewOffer_Creation.addoffer(offerkind, Serviceprovider);

    }


    @And("^I click on the Add button the offer should be added and confirm offer added$")
    public void i_click_on_the_Add_button_the_offer_should_be_added() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @And("^check if ([^\"]*) and ([^\"]*) are added in the table$")
    public void check_offer_notID_added(String offer, String sms) throws Throwable {
        try {
            PageFactory.initElements(driver, SMPOfferNotificationPageActions.class);
            SMPOfferNotificationPageActions.validation(offer, sms);

        } catch (Exception e) {
            log.debug("Failed to add offer text");
            Assert.fail("Failed to add offer text");

        }
    }

    @And("^check for the success message displayed")
    public void check_success_message() throws Throwable {
        try {
            if (driver.findElement(By.xpath("//*[@id=\"Results_NavLayer\"]/table/tbody/tr[3]/td[2]")).equals("Subscriber funds transaction was successful.")) {

                System.out.println("Transaction success");

            }
        } catch (Exception e) {
            log.debug("Failed transaction");
            Assert.fail("Failed transaction");

        }

    }

    @Then("^i click on the SMP adminstration and clicks on responses$")
    public void i_click_on_the_smp_adminstration_and_clicks_on_responses() throws Throwable {
        PageFactory.initElements(driver, SMP_Response_Actions.class);
        SMP_Response_Actions.responses();
    }

    @And("^Click on (.+) create new button and enter the (.+) (.+) (.+) (.+) (.+) and (.+)$")
    public void click_on_create_new_button_and_enter_the_and(String responsetype, String responseid, String description, String spid, String plan, String Language, String errorcode) throws Throwable {
        PageFactory.initElements(driver, SMP_Response_Actions.class);
        SMP_Response_Actions.addresponse(responsetype, responseid, description, spid, plan, Language);
    }

    @When("^i click on the Add button the response should be added$")
    public void i_click_on_the_add_button_the_response_should_be_added() throws Throwable {

    }

    @Then("^i click on the SMP adminstration and clicks on Ruleparameter$")
    public void i_click_on_the_smp_adminstration_and_clicks_on_ruleparameter() throws Throwable {
        PageFactory.initElements(driver, SMP_RuleParameterActions.class);
        SMP_RuleParameterActions.ruleparameters();
    }

    @And("^Click on create new button and enter the (.+) (.+) (.+)$")
    public void click_on_create_new_button_and_enter_the(String value, String description, String endate) throws Throwable {
        SMP_RuleParameterActions.addoffer(value, description, endate);
    }

    @When("^i click on the save button the rule should be added$")
    public void i_click_on_the_save_button_the_rule_should_be_added() throws Throwable {
        SMP_RuleParameterActions.Add();
    }


    @And("^click on LUAQ configurations link$")

    public void click_on_LUAQ() throws Throwable {
        PageFactory.initElements(driver, SMP_LUAQConfigPageActions.class);
        SMP_LUAQConfigPageActions.ClickLUAQ();
    }

    @And("^click on Create New under LUAQ$")

    public void create_new_LUAQ() throws Throwable {
        PageFactory.initElements(driver, SMP_LUAQConfigPageActions.class);
        SMP_LUAQConfigPageActions.CreateNew();
    }

    @And("^select ([^\"]*) ([^\"]*) ([^\"]*) ([^\"]*) ([^\"]*) ([^\"]*) ([^\"]*) and click on Add$")

    public void select_data_click_Add(String SP, String rateplan, String Balancethreshold, String Amount, String Daysuntilpenalty, String penalty, String warndate) throws Throwable {
        PageFactory.initElements(driver, SMP_LUAQConfigPageActions.class);
        SMP_LUAQConfigPageActions.AddlUAQ(SP, rateplan, Balancethreshold, Amount, Daysuntilpenalty, penalty, warndate);
    }


    @Then("^i click on the SMP administration and clicks on Actionset$")
    public void i_click_on_the_smp_adminstration_and_clicks_on_actionset() throws Throwable {
        PageFactory.initElements(driver, SMP_ActionsetActions.class);
        SMP_ActionsetActions.actionset();
    }


    @And("^Click on createnew button and enter the (.+) (.+) (.+) (.+) (.+) (.+) (.+) (.+) (.+) (.+)$")
    public void click_on_create_new_button_and_enter_the(String id, String description, String action, String planid, String offer, String category, String response, String sessionactid, String startdate, String enddate) throws Throwable {
        PageFactory.initElements(driver, SMP_ActionsetActions.class);
        SMP_ActionsetActions.createactions(id, description, action, planid, offer, category, response, sessionactid, startdate, enddate);
    }

    @When("^i click on the save button the actionset should be added$")
    public void i_click_on_the_save_button_the_actionset_should_be_added() throws Throwable {
        PageFactory.initElements(driver, SMP_ActionsetActions.class);
        SMP_ActionsetActions.add();
    }


    @And("^click on Business Processes$")
    public void click_on_Business_processes() throws Throwable {
        PageFactory.initElements(driver, SMP_SelfServicePageActions.class);
        SMP_SelfServicePageActions.ClickBusinessProcesses();
    }


    @And("^enter ([^\"]*) ([^\"]*) and click on Add$")
    public void enter_details_add(String BPID, String Description) throws Throwable {
        PageFactory.initElements(driver, SMP_SelfServicePageActions.class);
        SMP_SelfServicePageActions.AddBP(BPID, Description);
    }

    @And("^click on Requests and click on Create New$")
    public void click_on_Requests_click_create_new() throws Throwable {
        PageFactory.initElements(driver, SMP_SelfServicePageActions.class);
        SMP_SelfServicePageActions.ClickWebRequests();
    }

    @And("^enter ([^\"]*) ([^\"]*) ([^\"]*) ([^\"]*) ([^\"]*) and click Add$")
    public void enter_details_Add(String SPID, String plan, String BP, String ReqID, String VRS) throws Throwable {
        PageFactory.initElements(driver, SMP_SelfServicePageActions.class);
        SMP_SelfServicePageActions.AddWebRequests(SPID, plan, BP, ReqID, VRS);
    }

    @And("Click on jSecure Admin links$")
    public void Click_jsecure_Admin_Linkconsole() throws IOException, InterruptedException {

        try {
            PageFactory.initElements(driver, SMP_JSecureAdmin_ManagementPageActions.class);
            SMP_JSecureAdmin_ManagementPageActions.ClickJSecureAdminConsole();


            Screenshots.captureScreenshot();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            log.debug("Failed to click on Jsecure Admin link");
            Assert.fail("Failed to click on Jsecure Admin link");
        }
    }


    @And("Click on Add Link under Groups$")
    public void Click_Add_Link_under_groups() throws IOException, InterruptedException {
        try {
            PageFactory.initElements(driver, SMP_JSecureAdmin_ManagementPageActions.class);
            SMP_JSecureAdmin_ManagementPageActions.ClickGroupsAdd();


            Screenshots.captureScreenshot();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            log.debug("Failed to click on Add link under Groups");
            Assert.fail("Failed to click on Add link under Groups");
        }
    }


/*
    @And("^Click Category link$")
    public void click_Category_link(DataTable category) throws Throwable  {
        List<String> list = category.asList(String.class);

        //System.out.println("Category - " + list.get(1));
        for(int i=0;i<=list.size();i++) {
            System.out.println("Category - " + list.get(i));
            try {


                PageFactory.initElements(driver, SMP_JSecureAdmin_ManagementPageActions.class);
                SMP_JSecureAdmin_ManagementPageActions.ClickCategory(list.get(i));


                Screenshots.captureScreenshot();



            } catch (Exception e) {
                // TODO Auto-generated catch block
                log.debug("Failed to click on order processing");
                Assert.fail("Failed to click on order processing");
            }
            Thread.sleep(5000);
        }
    }

*/


    /*


      */


/*

    @And("^Click Grant Full Access CorrespondingAdmin check$")
    public void click_Grant_Full_Access_CorrespondingAdmin_check(DataTable GrantAccess) throws Throwable  {

        List<String> list = GrantAccess.asList(String.class);

        //System.out.println("GrantAccess - " + list.get(1));

        for(int i=0;i<=list.size();i++) {
            System.out.println("GrantAccess - " + list.get(i));

            try {

                PageFactory.initElements(driver, SMP_JSecureAdmin_ManagementPageActions.class);
                SMP_JSecureAdmin_ManagementPageActions.ClickAllcheckbox(list.get(i));


                Screenshots.captureScreenshot();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                log.debug("Failed to click on order processing");
                Assert.fail("Failed to click on order processing");
            }
        }

    }



*/





    @And("^Click \"([^\"]*)\" link$")
    public void click_link(String Management) throws Throwable {

        try {
            PageFactory.initElements(driver, SMP_JSecureAdmin_ManagementPageActions.class);
            SMP_JSecureAdmin_ManagementPageActions.ClickManagements(Management);
            Screenshots.captureScreenshot();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            log.debug("Failed to click on order Management");
            Assert.fail("Failed to click on Management");
        }
    }



    @And("^Click on View Link under Groups$")
    public void click_on_View_Link_under_Groups() throws Throwable {
        try {
            PageFactory.initElements(driver, SMP_JSecureAdmin_ManagementPageActions.class);
            SMP_JSecureAdmin_ManagementPageActions.ClickModifyviewDelete();

            Screenshots.captureScreenshot();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            log.debug("Failed to click on View Under Groups");
            Assert.fail("Failed to click on View Under Groups");
        }


    }


    @And("^Search ths \"([^\"]*)\" and Click View$")
    public void search_this_and_Click_View(String Description) throws Throwable {


        try {
            PageFactory.initElements(driver, SMP_JSecureAdmin_ManagementPageActions.class);
            SMP_JSecureAdmin_ManagementPageActions.ClickJSecureView(Description);
            Screenshots.captureScreenshot();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            log.debug("Failed to click on View");
            Assert.fail("Failed to click on View");
        }

    }

    @And("^Search ths \"([^\"]*)\" and Click modify$")
    public void search_this_and_Click_modify(String Description) throws Throwable {


        try {
            PageFactory.initElements(driver, SMP_JSecureAdmin_ManagementPageActions.class);
            SMP_JSecureAdmin_ManagementPageActions.ClickJSecureModify(Description);
            Screenshots.captureScreenshot();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            log.debug("Failed to click on order modify");
            Assert.fail("Failed to click on modify");
        }


    }





    @And("Enter the ([^\\\"]*) and select the options ([^\"]*) and click on Credit button$")
    public void Enter_the_amount_and_select_ions_from_reasoncode(String Amount, String Reasoncode) throws IOException, InterruptedException {
        try {
            PageFactory.initElements(driver, SMP_CustomerServicePageActions.class);
            SMP_CustomerServicePageActions.Creditrealmoney(Amount, Reasoncode);
            Screenshots.captureScreenshot();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            log.debug("Failed to credit real money");
            Assert.fail("Failed to credit real money");
        }
    }


    @And("Click on Debit Bonus Money$")
    public void Click_on_DebitBonus_Money() throws IOException, InterruptedException {
        try {
            PageFactory.initElements(driver, SMP_CustomerServicePageActions.class);
            SMP_CustomerServicePageActions.Clickdebitbonus();
            Screenshots.captureScreenshot();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            log.debug("Failed to debit bonus money");
            Assert.fail("Failed to debit bonus money");
        }

    }

    @And("Click Order Processing under the Menu$")
    public void Click_OrderProcessing() throws IOException, InterruptedException {
        try {
            PageFactory.initElements(driver, SMP_OrderProcessingPageActions.class);
            SMP_OrderProcessingPageActions.ClickOrderprocessing();
            Screenshots.captureScreenshot();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            log.debug("Failed to click on order processing");
            Assert.fail("Failed to click on order processing");
        }

    }

    @And("select ([^\"]*) and click on Verify$")
    public void select_Ordertype_click_on_verify(String Ordertype) throws IOException, InterruptedException {

        try {
            PageFactory.initElements(driver, SMP_OrderProcessingPageActions.class);
            SMP_OrderProcessingPageActions.Verifyorderprocessing(Ordertype);
            Screenshots.captureScreenshot();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            log.debug("Failed to Click and verify on Ordertype");
            Assert.fail("Failed to Click and verify on Ordertype");
        }


    }


    @And("click on ViewModifyDelete link under users$")
    public void click_ViewModDelete() throws IOException, InterruptedException {

        try {
            PageFactory.initElements(driver, SMP_jSecureAdminPageActions.class);
            SMP_jSecureAdminPageActions.ClickViewModDelete();
            Screenshots.captureScreenshot();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            log.debug("Failed to Click ");
            Assert.fail("Failed to Click");
        }
    }

    @And("click on View Link for ([^\"]*)$")
    public void View_Link(String Username) throws IOException, InterruptedException {

        try {
            PageFactory.initElements(driver, SMP_jSecureAdminPageActions.class);
            SMP_jSecureAdminPageActions.Viewlink(Username);
            Screenshots.captureScreenshot();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            log.debug("Failed to Click ");
            Assert.fail("Failed to Click");
        }


    }

    @And("^print the order id generated$")
    public void print_order_id() throws IOException,InterruptedException{

        try {
            WebElement orderid=driver.findElement(By.xpath("//*[@id=\"Results_Layer\"]/table/tbody/tr[3]/td[2]"));
            String s=orderid.getText();
            System.out.println(s
            );
            Screenshots.captureScreenshot();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            log.debug("Order id not generated ");
            Assert.fail("Order id not generated ");
        }
    }

    @And("^check if Notifications home page is returned$")
    public void check_if_notifications_home_page() throws IOException,InterruptedException{
        try {
            String PageTitle = driver.getTitle();
            if(PageTitle=="Notifications") {
                log.debug("SG Text modified ");
                System.out.println("SG Text modified");
            }
            log.debug("The Page title is " + PageTitle);
            log.debug("Currently we are at " + PageTitle + " page");
            Thread.sleep(4000);
            Screenshots.captureScreenshot();
        }
        catch (Exception e) {
            // TODO Auto-generated catch block
            log.debug("SG Text not modified ");
            Assert.fail("SG Text not modified");
        }

    }

    @And("^check if Bundle configuration view page is returned$")
    public void check_if_bundle_config_view_page() throws IOException,InterruptedException{
        try {
            String PageTitle = driver.getTitle();
            if(PageTitle=="Bundle Configuration View") {
                log.debug("Bundle modified ");
                System.out.println("Bundle modified");
            }
            log.debug("The Page title is " + PageTitle);
            log.debug("Currently we are at " + PageTitle + " page");
            Thread.sleep(4000);
            Screenshots.captureScreenshot();
        }
        catch (Exception e) {
            // TODO Auto-generated catch block
            log.debug("Bundle not modified ");
            Assert.fail("Bundle not modified");
        }

    }

    @And("^Click ([^\"]*) link$")
    public void click_care_general_link(String Management) throws IOException,InterruptedException{

        PageFactory.initElements(driver,SMP_JSecureAdmin_ManagementPageActions.class);
        SMP_JSecureAdmin_ManagementPageActions.ClickManagements(Management);
    }

     @And("^Select service provider in ([^\"]*) combo box$")
     public void slect_service_provder(String ServiceProviderAccess) throws IOException,InterruptedException
     {
         PageFactory.initElements(driver,SMP_JSecureAdmin_ManagementPageActions.class);
         SMP_JSecureAdmin_ManagementPageActions.SelectServiceprovider(ServiceProviderAccess);
     }

     @And("^Click Grant Full Access in ([^\"]*) and Click Add button$")
     public void Click_Grant_Full_Access(String CorrespondingAdmin) throws IOException,InterruptedException
     {
         PageFactory.initElements(driver,SMP_JSecureAdmin_ManagementPageActions.class);
         SMP_JSecureAdmin_ManagementPageActions.ClickAllcheckbox(CorrespondingAdmin);
     }

     @And("^Click Partition Tab and select ([^\"]*)([^\"]*) ([^\"]*) ([^\"]*) and click on Debit$")
    public void Debit_partition(String PartitionName,String Partition,String Value,String ReasonCode) throws IOException,InterruptedException
     {
         PageFactory.initElements(driver,SMP_CustomerServicePageActions.class);
         SMP_CustomerServicePageActions.DebitPartition(PartitionName,Partition,Value,ReasonCode);
     }

    @And("^Click Partition Tab and select ([^\"]*)([^\"]*) ([^\"]*) ([^\"]*) and click on Credit")
    public void Credit_partition(String PartitionName,String Partition,String Value,String ReasonCode) throws IOException,InterruptedException
    {
        PageFactory.initElements(driver,SMP_CustomerServicePageActions.class);
        SMP_CustomerServicePageActions.CreditPartition(PartitionName,Partition,Value,ReasonCode);
    }

    @And("^click on Delete link for ([^\"]*)$")
    public void Delete_user(String Username) throws IOException,InterruptedException
    {
        PageFactory.initElements(driver,SMP_jSecureAdminPageActions.class);
        Screenshots.captureScreenshot();
        SMP_jSecureAdminPageActions.DeleteLink(Username);
    }

    @And("^click on Modify link for ([^\"]*)$")
    public void Modify_link_user(String Username) throws IOException,InterruptedException
    {
        PageFactory.initElements(driver,SMP_jSecureAdminPageActions.class);
        SMP_jSecureAdminPageActions.ModifyLink(Username);
        Screenshots.captureScreenshot();
    }

    @And("^modify ([^\"]*) ([^\"]*) ([^\"]*) and click Modify$")
    public void Modify_user(String firstname,String lastname,String group) throws IOException,InterruptedException
    {
        PageFactory.initElements(driver,SMP_jSecureAdminPageActions.class);
        SMP_jSecureAdminPageActions.ModifyUser(firstname,lastname,group);
        Screenshots.captureScreenshot();
    }

    @And("^click on Add under users$")
    public void Add_user() throws InterruptedException,IOException
    {
        PageFactory.initElements(driver,SMP_jSecureAdminPageActions.class);
        SMP_jSecureAdminPageActions.ClickAdduser();
    }

    @And("^fill ([^\"]*) ([^\"]*) ([^\"]*) ([^\"]*) ([^\"]*) ([^\"]*) ([^\"]*) and click Add$")
    public void adding_user(String firstname,String lastname,String username,String password,String verifypassword,String group,String APIUser) throws InterruptedException,IOException
    {
        PageFactory.initElements(driver,SMP_jSecureAdminPageActions.class);
        SMP_jSecureAdminPageActions.Adduser(firstname,lastname,username,password,verifypassword,group,APIUser);
    }
}


