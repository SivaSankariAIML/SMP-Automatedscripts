package actionsPerformed;

import GlobalActions.Screenshots;
import helpers.Environment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pageobjects.SMPNotificationsPage;
import pageobjects.SMPOfferNotificationPage;
import pageobjects.SMP_JSecureAdminPageobjects;
import pageobjects.SMP_ServiceProviderserviceGroupobjects;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SMP_ServiceProviderserviceGroupActions extends Environment {




    // ADD Actions

public static void ClickServiceGroupTab()throws InterruptedException, IOException
{
    PageFactory.initElements(driver, SMP_ServiceProviderserviceGroupobjects.class);
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    Screenshots.captureScreenshot();

    SMP_ServiceProviderserviceGroupobjects.ClickServiceGroupTab.click();

}

    public static void ClickCreateNew()throws InterruptedException, IOException
    {
        PageFactory.initElements(driver, SMP_ServiceProviderserviceGroupobjects.class);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();

        SMP_ServiceProviderserviceGroupobjects.ClickCreateNew.click();

    }

    public static void SelectNotioficationandSGID(String Notification,String SGID )throws InterruptedException, IOException
    {
        PageFactory.initElements(driver, SMP_ServiceProviderserviceGroupobjects.class);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();

        Select Selectnotifications = new Select(SMP_ServiceProviderserviceGroupobjects.SelectNotification);

        Thread.sleep(1000);
        Selectnotifications.selectByVisibleText(Notification);

Select SelecrSGID=new Select(SMP_ServiceProviderserviceGroupobjects.SelectSGID);
        Thread.sleep(1000);
SelecrSGID.selectByVisibleText(SGID);


    }


    public static void EnterSMSandWebandIVR(String webmessage,String smsmessage,String IVRmessage)throws InterruptedException, IOException
    {
        PageFactory.initElements(driver, SMP_ServiceProviderserviceGroupobjects.class);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
SMP_ServiceProviderserviceGroupobjects.EnterWebText.sendKeys(webmessage);
SMP_ServiceProviderserviceGroupobjects.EnterSMSText.sendKeys(smsmessage);
SMP_ServiceProviderserviceGroupobjects.EnterIVRText.sendKeys(IVRmessage);


    }


    public static void ClickAllplan()throws InterruptedException, IOException
    {
        PageFactory.initElements(driver,SMP_ServiceProviderserviceGroupobjects.class);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
     SMP_ServiceProviderserviceGroupobjects.ClickAllplan.click();

    }




    public static void ClickADDbutton()throws InterruptedException, IOException
    {
        PageFactory.initElements(driver,SMP_ServiceProviderserviceGroupobjects.class);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
   //     SMP_ServiceProviderserviceGroupobjects.ClickAddbutton.click();

    }




    //Modify Actions


    public static void SGModifylink(String Notification,String ServiceGroup) throws InterruptedException,IOException {
     PageFactory.initElements(driver,SMP_ServiceProviderserviceGroupobjects.class);


        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        System.out.println("Serviceeeeeeeeeeeeee:"+ServiceGroup);
        System.out.println("Notifiiiiiiiiiiiiiiiiiiiiii:"+Notification);
        List<WebElement> SGTable = driver.findElements(By.xpath("//*[@name='sgroupNotificationCurrentForm']/table/tbody/tr"));
        int SGtablesize = SGTable.size();
        System.out.println("SGTable size.....: " + SGtablesize);

        for (int k = 3; k < SGtablesize; k++)
        {

            Thread.sleep(2000);
            List<WebElement> Servicegroup = driver.findElements(By.xpath("//*[@id=\"ServiceGroups_NavLayer\"]/form[1]/table/tbody/tr["+k+"]/td[3]"));
            List<WebElement> Notifi = driver.findElements(By.xpath("//*[@id=\"ServiceGroups_NavLayer\"]/form[1]/table/tbody/tr["+k+"]/td[5]"));
            int l = 0;
            System.out.println(Servicegroup.get(l).getAttribute("title"));
            System.out.println(Notifi.get(l).getText());



            if (Servicegroup.get(l).getAttribute("title").equalsIgnoreCase(ServiceGroup) && Notifi.get(l).getText().equalsIgnoreCase(Notification)) {

                driver.findElement(By.xpath("//*[@id=\"ServiceGroups_NavLayer\"]/form[1]/table/tbody/tr["+k+"]/td[1]")).click();

    break;
            }


            l++;

        }
    }


    public static void ClearandEnterWeb(String webmessage)throws InterruptedException, IOException
    {
        PageFactory.initElements(driver,SMP_ServiceProviderserviceGroupobjects.class);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        SMP_ServiceProviderserviceGroupobjects.ClearandEntertWebtext.clear();
        Thread.sleep(3000);
        SMP_ServiceProviderserviceGroupobjects.ClearandEntertWebtext.sendKeys(webmessage);
    }

public static void ClickSGmodify()throws InterruptedException, IOException
{
    PageFactory.initElements(driver,SMP_ServiceProviderserviceGroupobjects.class);
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    Screenshots.captureScreenshot();
//SMP_ServiceProviderserviceGroupobjects.ClickSGModifybutton.click();

}

///////Delete



public static void ClickEndDate()throws InterruptedException,IOException
{
    PageFactory.initElements(driver,SMP_ServiceProviderserviceGroupobjects.class);
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
Screenshots.captureScreenshot();

SMP_ServiceProviderserviceGroupobjects.ClickEDatepicker.click();
SMP_ServiceProviderserviceGroupobjects.ClickDate.click();



}








}
