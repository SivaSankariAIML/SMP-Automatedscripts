package actionsPerformed;

import GlobalActions.Screenshots;
import helpers.Environment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pageobjects.SMPLoginPage;
import pageobjects.SMPNotificationsPage;
import pageobjects.SMPOfferNotificationPage;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SMPOfferNotificationPageActions extends Environment {

    public static void Selectplan() throws InterruptedException, IOException
    {
        PageFactory.initElements(driver, SMPOfferNotificationPage.class);
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        SMPOfferNotificationPage.Allplans.click();

    }

    public static void Selectoffer(String offer) throws InterruptedException, IOException
    {

        PageFactory.initElements(driver, SMPOfferNotificationPage.class);
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
    //    SMPOfferNotificationPage.offer.click();
        Select offerselect=new Select(SMPOfferNotificationPage.offer);
        offerselect.selectByVisibleText(offer);
    }

    public static void Selectnotification(String notID,String sms) throws InterruptedException, IOException
    {

        PageFactory.initElements(driver, SMPOfferNotificationPage.class);
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        Select notifyselect = new Select(SMPOfferNotificationPage.notifications);
        notifyselect.selectByVisibleText(notID);
        SMPOfferNotificationPage.smsmessage.sendKeys(sms);
        SMPOfferNotificationPage.Addbutton.click();
        }

    public static void Modifylink(String sms,String offer) throws InterruptedException,IOException {
        PageFactory.initElements(driver, SMPOfferNotificationPage.class);
        PageFactory.initElements(driver, SMPNotificationsPage.class);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        SMPNotificationsPage.offers.click();
        List<WebElement> ff = driver.findElements(By.xpath("//*[@name='offerNotificationCurrentForm']/table/tbody/tr"));
        int gg = ff.size();
        System.out.println("Table size.....: " + gg);
        for (int k = 3; k < gg; k++) {
            List<WebElement> hh = driver.findElements(By.xpath("//*[@name='offerNotificationCurrentForm']/table/tbody/tr[" + k + "]/td[3]"));
            List<WebElement> jj = driver.findElements(By.xpath("//*[@name='offerNotificationCurrentForm']/table/tbody/tr[" + k + "]/td[4]"));
            int l = 0;
            System.out.println(offer);
            System.out.println(sms);
            if (hh.get(l).getText().equalsIgnoreCase(sms) && jj.get(l).getText().equalsIgnoreCase(offer)) {
                System.out.println("Test1");
                driver.findElement(By.xpath("//*[@name='offerNotificationCurrentForm']/table/tbody/tr[" + k + "]/td[1]")).click();
                break;
            }

            l++;
        }
    }

    public static void ModifyDescription(String webmessage,String smsmessage) throws InterruptedException,IOException
    {
        PageFactory.initElements(driver, SMPOfferNotificationPage.class);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        SMPOfferNotificationPage.smsmessage.sendKeys(smsmessage);
        SMPOfferNotificationPage.webmessage.sendKeys(webmessage);
        //SMPOfferNotificationPage.Modifybutton.click();
    }

    public static void validation(String offer,String notID) throws InterruptedException,IOException
    {
        boolean isFound=false;
        List<WebElement> rows = driver.findElements(By.xpath("//*[@name='offerNotificationCurrentForm']/table/tbody/tr"));
        int gg=rows.size();
        for (int k = 3; k < gg; k++) {
            int l=0;
            List<WebElement> hh = driver.findElements(By.xpath("//*[@name='offerNotificationCurrentForm']/table/tbody/tr[" + k + "]/td[3]"));
            List<WebElement> jj = driver.findElements(By.xpath("//*[@name='offerNotificationCurrentForm']/table/tbody/tr[" + k + "]/td[4]"));
            if (hh.get(l).getText().equalsIgnoreCase(notID) && jj.get(l).getText().equalsIgnoreCase(offer)) {
                isFound=true;
                System.out.println("Offer notification is added");
                break;
            }

        }

    }
}
