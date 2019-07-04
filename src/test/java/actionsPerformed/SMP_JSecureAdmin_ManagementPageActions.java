package actionsPerformed;

import GlobalActions.Screenshots;
import helpers.Environment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pageobjects.SMP_JSecureAdminPageobjects;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class SMP_JSecureAdmin_ManagementPageActions extends Environment {




    public static void ClickJSecureAdminConsole() throws InterruptedException, IOException {
        PageFactory.initElements(driver, SMP_JSecureAdminPageobjects.class);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();

        SMP_JSecureAdminPageobjects.ClickjSecureAdminConsole.click();

    }


    public static void ClickGroupsAdd() throws InterruptedException, IOException {
        PageFactory.initElements(driver, SMP_JSecureAdminPageobjects.class);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        SMP_JSecureAdminPageobjects.ClickGroupsAdd.click();

    }




    public static void ClickManagements(String Management ) throws InterruptedException, IOException {
        PageFactory.initElements(driver, SMP_JSecureAdminPageobjects.class);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
System.out.println("inside Action Class:"+Management );

        if(Management .equals("SMP Admin"))
        {
            System.out.println(Management );
            SMP_JSecureAdminPageobjects.ClickSMPAdmin.click();

        }
         if(Management .equals("jSecure Admin"))
        {    System.out.println(Management );

            SMP_JSecureAdminPageobjects.ClickjSecureAdminlink.click();
        }
        if(Management .equals("Payment Admin"))
        {
            System.out.println(Management );
            SMP_JSecureAdminPageobjects.ClickPaymentAdminlink.click();
        }
        if(Management .equals("Payment System API"))
        {
            System.out.println(Management );
            SMP_JSecureAdminPageobjects.ClickPaymentSystemAPIlink.click();
        }
        if(Management .equals("Care General"))
        {

            System.out.println(Management );
            SMP_JSecureAdminPageobjects.ClickCareGenerallink.click();
        }
        if(Management .equals("Care Management"))
        {

            System.out.println(Management );
            SMP_JSecureAdminPageobjects.ClickCareManagementlink.click();
        }
        if(Management .equals("Care Bundles"))
        {

            System.out.println(Management );
            SMP_JSecureAdminPageobjects.ClickCareBundleslink.click();

        }
        if(Management .equals("Care Recharge"))
        {

            System.out.println(Management );
            SMP_JSecureAdminPageobjects.ClickCareRechargelink.click();

        }
        if(Management .equals("Care History"))
        {


            System.out.println(Management );
            SMP_JSecureAdminPageobjects.ClickCareHistorylink.click();
        }
        if(Management .equals("Care System API"))
        {


            System.out.println(Management );
            SMP_JSecureAdminPageobjects.ClickCareSystemAPIlink.click();
        }
        if(Management .equals("Rate Management"))
        {

            System.out.println(Management);
            SMP_JSecureAdminPageobjects.ClickRateManagementlink.click();

        }





    }


    public static void SelectServiceprovider(String ServiceProviderAccess) throws InterruptedException, IOException {
        PageFactory.initElements(driver, SMP_JSecureAdminPageobjects.class);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        Select serviceprovider = new Select(SMP_JSecureAdminPageobjects.SelectServiceProviderAccess);

        Thread.sleep(5000);
        serviceprovider.selectByVisibleText(ServiceProviderAccess);


    }


    public static void ClickAllcheckbox(String CorrespondingAdmin ) throws InterruptedException, IOException {
        PageFactory.initElements(driver, SMP_JSecureAdminPageobjects.class);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();

        if(CorrespondingAdmin.equals("SMP Admin"))
        {
            System.out.println("SMP Check box");

            System.out.println(CorrespondingAdmin);
            SMP_JSecureAdminPageobjects.GrantFullAccessSMPCheckbox.click();

        }

        if(CorrespondingAdmin.equals("jSecure Admin"))
        {
            System.out.println(CorrespondingAdmin);
            SMP_JSecureAdminPageobjects.GrantFullAccessJSecuerCheckbox.click();

        }
        if(CorrespondingAdmin.equals("Payment Admin"))
        {
            System.out.println(CorrespondingAdmin);
            SMP_JSecureAdminPageobjects.GrantFullAccessPaymentCheckbox.click();

        }

        if(CorrespondingAdmin.equals("Payment System API"))
        {
            System.out.println(CorrespondingAdmin);
            SMP_JSecureAdminPageobjects.GrantFullAccessPaymentSystemCheckbox.click();

        }
        if(CorrespondingAdmin.equals("Care General"))
        {
            System.out.println(CorrespondingAdmin);
            SMP_JSecureAdminPageobjects.GrantFullAccessCareGeneralCheckbox.click();

        }

        if(CorrespondingAdmin.equals("Care Management"))
        {
            System.out.println(CorrespondingAdmin);
            SMP_JSecureAdminPageobjects.GrantFullAccessCareManagementCheckbox.click();

        }
        if(CorrespondingAdmin.equals("Care Bundles"))
        {
            System.out.println(CorrespondingAdmin);
            SMP_JSecureAdminPageobjects.GrantFullAccessCareBundlesCheckbox.click();

        }

        if(CorrespondingAdmin.equals("Care History"))
        {
            System.out.println(CorrespondingAdmin);
            SMP_JSecureAdminPageobjects.GrantFullAccessCareHistoryCheckbox.click();

        }
        if(CorrespondingAdmin.equals("Care System API"))
        {
            System.out.println(CorrespondingAdmin);
            SMP_JSecureAdminPageobjects.GrantFullAccessCareSystemAPICheckbox.click();

        }
        if(CorrespondingAdmin.equals("Rate Management"))
        {
            System.out.println(CorrespondingAdmin);
            SMP_JSecureAdminPageobjects.GrantFullAccessRateManagementCheckbox.click();

        }






    }

    public static void ClickAddbutton() throws InterruptedException, IOException {
        PageFactory.initElements(driver, SMP_JSecureAdminPageobjects.class);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
   //     SMP_JSecureAdminPageobjects.ClickAddButton.click();

    }

    //JSEcure Admin Link
    public static void ClickJsecureAdminlink() throws InterruptedException, IOException {
        PageFactory.initElements(driver, SMP_JSecureAdminPageobjects.class);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        SMP_JSecureAdminPageobjects.ClickjSecureAdminlink.click();

    }

    public static void ClickJsecureAdmingrantcheckbox() throws InterruptedException, IOException {
        PageFactory.initElements(driver, SMP_JSecureAdminPageobjects.class);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        SMP_JSecureAdminPageobjects.GrantFullAccessJSecuerCheckbox.click();

    }

    //Payment ADMIN Link under Management
    public static void ClickpaymentAdminlink() throws InterruptedException, IOException {
        PageFactory.initElements(driver, SMP_JSecureAdminPageobjects.class);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        SMP_JSecureAdminPageobjects.ClickPaymentAdminlink.click();

    }

    public static void ClickpaymentAdmingrantcheckbox() throws InterruptedException, IOException {
        PageFactory.initElements(driver, SMP_JSecureAdminPageobjects.class);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        SMP_JSecureAdminPageobjects.GrantFullAccessPaymentCheckbox.click();

    }

    //Payment System API Link under Management


    public static void ClickpaymentSystemAPIlink() throws InterruptedException, IOException {
        PageFactory.initElements(driver, SMP_JSecureAdminPageobjects.class);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        SMP_JSecureAdminPageobjects.ClickPaymentSystemAPIlink.click();

    }

    public static void ClickpaymentSystemAPIgrantcheckbox() throws InterruptedException, IOException {
        PageFactory.initElements(driver, SMP_JSecureAdminPageobjects.class);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        SMP_JSecureAdminPageobjects.GrantFullAccessPaymentSystemCheckbox.click();

    }


    //Care General under Management


    public static void ClickCareGenerallink() throws InterruptedException, IOException {
        PageFactory.initElements(driver, SMP_JSecureAdminPageobjects.class);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        SMP_JSecureAdminPageobjects.ClickCareGenerallink.click();

    }

    public static void ClickCareGeneraltcheckbox() throws InterruptedException, IOException {
        PageFactory.initElements(driver, SMP_JSecureAdminPageobjects.class);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        SMP_JSecureAdminPageobjects.GrantFullAccessCareGeneralCheckbox.click();

    }

    //Care Management under Management


    public static void ClickCareManagementlink() throws InterruptedException, IOException {
        PageFactory.initElements(driver, SMP_JSecureAdminPageobjects.class);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        SMP_JSecureAdminPageobjects.ClickCareManagementlink.click();

    }

    public static void ClickCareManagementcheckbox() throws InterruptedException, IOException {
        PageFactory.initElements(driver, SMP_JSecureAdminPageobjects.class);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        SMP_JSecureAdminPageobjects.GrantFullAccessCareManagementCheckbox.click();

    }


    //Care Bundles under Management


    public static void ClickCareBundleslink() throws InterruptedException, IOException {
        PageFactory.initElements(driver, SMP_JSecureAdminPageobjects.class);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        SMP_JSecureAdminPageobjects.ClickCareBundleslink.click();

    }

    public static void ClickCareBundlescheckbox() throws InterruptedException, IOException {
        PageFactory.initElements(driver, SMP_JSecureAdminPageobjects.class);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        SMP_JSecureAdminPageobjects.GrantFullAccessCareBundlesCheckbox.click();

    }
//Care Recharge under Management


    public static void ClickCareRechargelink() throws InterruptedException, IOException {
        PageFactory.initElements(driver, SMP_JSecureAdminPageobjects.class);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        SMP_JSecureAdminPageobjects.ClickCareRechargelink.click();

    }

    public static void ClickCareRechargecheckbox() throws InterruptedException, IOException {
        PageFactory.initElements(driver, SMP_JSecureAdminPageobjects.class);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        SMP_JSecureAdminPageobjects.GrantFullAccessCareRechargeCheckbox.click();

    }

//Care History under Management


    public static void ClickCareHistorylink() throws InterruptedException, IOException {
        PageFactory.initElements(driver, SMP_JSecureAdminPageobjects.class);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        SMP_JSecureAdminPageobjects.ClickCareHistorylink.click();

    }

    public static void ClickCareHistorycheckbox() throws InterruptedException, IOException {
        PageFactory.initElements(driver, SMP_JSecureAdminPageobjects.class);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        SMP_JSecureAdminPageobjects.GrantFullAccessCareHistoryCheckbox.click();

    }


//Care System API under Management


    public static void ClickCareSystemAPIlink() throws InterruptedException, IOException {
        PageFactory.initElements(driver, SMP_JSecureAdminPageobjects.class);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        SMP_JSecureAdminPageobjects.ClickCareHistorylink.click();

    }

    public static void ClickCareSystemAPIcheckbox() throws InterruptedException, IOException {
        PageFactory.initElements(driver, SMP_JSecureAdminPageobjects.class);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        SMP_JSecureAdminPageobjects.GrantFullAccessCareHistoryCheckbox.click();

    }

//Rate Management under Management


    public static void ClickRateManagementlink() throws InterruptedException, IOException {
        PageFactory.initElements(driver, SMP_JSecureAdminPageobjects.class);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        SMP_JSecureAdminPageobjects.ClickRateManagementlink.click();

    }

    public static void ClickRateManagementcheckbox() throws InterruptedException, IOException {
        PageFactory.initElements(driver, SMP_JSecureAdminPageobjects.class);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        SMP_JSecureAdminPageobjects.GrantFullAccessRateManagementCheckbox.click();

    }




    //Jsecure View and modify and Delete operations


    public static void ClickModifyviewDelete() throws InterruptedException,IOException
    {
        PageFactory.initElements(driver,SMP_JSecureAdminPageobjects.class);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();

        SMP_JSecureAdminPageobjects.ClickJSecureViewModifyDelete.click();

    }







    public static void ClickJSecureView(String Description) throws InterruptedException,IOException {


        PageFactory.initElements(driver,SMP_JSecureAdminPageobjects.class);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        Screenshots.captureScreenshot();

        Thread.sleep(1000);

        System.out.println("View.."+Description);

        List<WebElement> pp = driver.findElements(By.xpath("//*[@id='Layer1']/table/tbody/tr"));

        int               oo = pp.size();

        System.out.println("SSSSSSSSS : " +oo);



        for(int n=3;n<oo;n++) {

            System.out.println("XXXXXXXXXXXXXXXXX : " +oo);

            List<WebElement> hh=driver.findElements(By.xpath("//*[@id='Layer1']/table/tbody/tr["+n+"]/td[4]"));



            int u=0;

            if(hh.get(u).getText().equalsIgnoreCase(Description)) {

                System.out.println("YYYYYYYYYYYYYYYYY : ");

                System.out.println("GGGGGGGGG : " +oo);

                driver.findElement(By.xpath("//*[@id='Layer1']/table/tbody/tr["+n+"]/td[1]")).click();

                break;

            }

            u++;

        }
    }



        public static void ClickJSecureModify(String Description) throws InterruptedException,IOException {


            PageFactory.initElements(driver,SMP_JSecureAdminPageobjects.class);
            driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
            Screenshots.captureScreenshot();

            Thread.sleep(1000);

            System.out.println("Modify."+Description);

            List<WebElement> pp = driver.findElements(By.xpath("//*[@id='Layer1']/table/tbody/tr"));

            int               oo = pp.size();

            System.out.println("SSSSSS : " +oo);



            for(int n=3;n<oo;n++) {

                System.out.println("XXXXXXXXXXXXXXXXX : " +oo);

                List<WebElement> hh=driver.findElements(By.xpath("//*[@id='Layer1']/table/tbody/tr["+n+"]/td[4]"));



                int u=0;

                if(hh.get(u).getText().equalsIgnoreCase(Description)) {

                    System.out.println("YYYYYYYYYYYYYYYYY : ");

                    System.out.println("GGGGGGGGG : " +oo);

                    driver.findElement(By.xpath("//*[@id='Layer1']/table/tbody/tr["+n+"]/td[2]")).click();

                    break;

                }

                u++;

            }




        }


    public static void ClickJSecureDelete(String Description) throws InterruptedException,IOException {


        PageFactory.initElements(driver, SMP_JSecureAdminPageobjects.class);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();

        Thread.sleep(1000);

        System.out.println("Delete..." + Description);

        List<WebElement> pp = driver.findElements(By.xpath("//*[@id='Layer1']/table/tbody/tr"));

        int oo = pp.size();

        System.out.println("SSSSSSSSS : " + oo);


        for (int n = 3; n < oo; n++) {

            System.out.println("DDDDD : " + oo);

            List<WebElement> hh = driver.findElements(By.xpath("//*[@id='Layer1']/table/tbody/tr[" + n + "]/td[4]"));


            int u = 0;

            if (hh.get(u).getText().equalsIgnoreCase(Description)) {

                System.out.println("jgjdgdjhsgjhfs : ");

                System.out.println("LLLLLLLLLLLL: " + oo);

                driver.findElement(By.xpath("//*[@id='Layer1']/table/tbody/tr[" + n + "]/td[3]")).click();

                break;

            }

            u++;

        }

Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"Cancel_button\"]")).click();


    }


    public static void SelectUsers(String Users)throws InterruptedException,IOException
    {
        PageFactory.initElements(driver,SMP_JSecureAdminPageobjects.class);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();

        Select SelectUsers = new Select(SMP_JSecureAdminPageobjects.SelectAvailableUser);

        Thread.sleep(5000);
        SelectUsers.selectByVisibleText(Users);


    }

public static void Clickinclude()throws InterruptedException,IOException
    {
        PageFactory.initElements(driver,SMP_JSecureAdminPageobjects.class);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        SMP_JSecureAdminPageobjects.ClickInclude.click();

    }




    public static void ClickModifybutton()throws InterruptedException,IOException
    {
        PageFactory.initElements(driver,SMP_JSecureAdminPageobjects.class);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        SMP_JSecureAdminPageobjects.ClickModifybutton.click();

    }


    public static void ClickDonebutton()throws InterruptedException,IOException
    {
        PageFactory.initElements(driver,SMP_JSecureAdminPageobjects.class);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        SMP_JSecureAdminPageobjects.ClickDone.click();

    }
/*
    public static void ClearSearchtextandenterDescription(String Description)throws InterruptedException,IOException
    {
        PageFactory.initElements(driver,SMP_JSecureAdminPageobjects.class);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        SMP_JSecureAdminPageobjects.Cleartext.clear();

        Thread.sleep(3000);

        SMP_JSecureAdminPageobjects.EnterDescription.sendKeys(Description);
        Thread.sleep(3000);
        SMP_JSecureAdminPageobjects.ClickSeachbutton.click();
        Thread.sleep(3000);

    }

*/


}





