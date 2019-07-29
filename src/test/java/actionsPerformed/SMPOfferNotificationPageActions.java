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

    public static void Selectnotification(String notification,String sms) throws InterruptedException, IOException
    {

        PageFactory.initElements(driver, SMPOfferNotificationPage.class);
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        Select notifyselect = new Select(SMPOfferNotificationPage.notifications);
        notifyselect.selectByVisibleText(notification);
        SMPOfferNotificationPage.smsmessage.sendKeys(sms);
        SMPOfferNotificationPage.Addbutton.click();
        //Don't Commit Changes
        Thread.sleep(2000);
        SMPOfferNotificationPage.confirm_cancelButton.click(); // Cancel add action
        }

    public static void Modifylink(String notification,String offerName) throws InterruptedException,IOException {
        PageFactory.initElements(driver, SMPOfferNotificationPage.class);
        PageFactory.initElements(driver, SMPNotificationsPage.class);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        SMPNotificationsPage.offers.click();
        List<WebElement> trOffers = driver.findElements(By.xpath("//*[@name='offerNotificationCurrentForm']/table/tbody/tr"));
        int trCount = trOffers.size();
        System.out.println("Offers Table size.....: " + trCount);
        System.out.println(offerName);
        System.out.println(notification);
        for (int k = 3; k < trCount; k++) {
            List<WebElement> weOffer = driver.findElements(By.xpath("//*[@name='offerNotificationCurrentForm']/table/tbody/tr[" + k + "]/td[3]"));
            List<WebElement> weNotification = driver.findElements(By.xpath("//*[@name='offerNotificationCurrentForm']/table/tbody/tr[" + k + "]/td[4]"));
            if (weOffer.get(0).getText().equalsIgnoreCase(offerName) && weNotification.get(0).getText().equalsIgnoreCase(notification)) {
                System.out.println("Offer: "+ weOffer.get(0).getText() +" and notification :" + weNotification.get(0).getText()+" found on the page");
                driver.findElement(By.xpath("//*[@name='offerNotificationCurrentForm']/table/tbody/tr[" + k + "]/td[1]")).click();
                break;
            }
        }
    }

    public static void ModifyDescription(String webmessage,String smsmessage) throws InterruptedException,IOException
    {
        PageFactory.initElements(driver, SMPOfferNotificationPage.class);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        //Clear the Existing data
        SMPOfferNotificationPage.smsmessage.clear();
        SMPOfferNotificationPage.webmessage.click();
        //Update New
        SMPOfferNotificationPage.smsmessage.sendKeys(smsmessage);
        SMPOfferNotificationPage.webmessage.sendKeys(webmessage);
        SMPOfferNotificationPage.Modifybutton.click();

        // Dont Commit Changes
        Thread.sleep(2000);
        SMPOfferNotificationPage.confirm_cancelButton.click();
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
