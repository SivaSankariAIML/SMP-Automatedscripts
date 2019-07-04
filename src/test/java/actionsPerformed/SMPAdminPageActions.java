package actionsPerformed;

import GlobalActions.Screenshots;
import helpers.Environment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pageobjects.SMPAdminPage;
import pageobjects.SMPConsolePage;
import pageobjects.SMP_Services_page;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static pageobjects.SMPOfferNotificationPage.offer;

public class SMPAdminPageActions extends Environment {

    public static void Click_ServiceProvider(String SPID) throws InterruptedException, IOException {

        PageFactory.initElements(driver, SMPAdminPage.class);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        SMPAdminPage.ServiceProvider.click();

        List<WebElement> allSPID = driver.findElements(By.xpath("/html/body/form[1]/table/tbody/tr/td/table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td/table/tbody/tr/td[2]"));
        System.out.println(allSPID.size());
        for (int i = 0; i <= allSPID.size(); i++) {
            if (allSPID.get(i).getText().equals(SPID)) {
                driver.findElement(By.xpath("/html/body/form[1]/table/tbody/tr/td/table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td/table/tbody/tr["+(i+2)+"]/td[1]/div/a")).click();
               // System.out.println("if");
                break;
            }
           // System.out.println(i);
                }
       // System.out.println("Test");
        Thread.sleep(1000);
         }

    public static void Click_Services() throws InterruptedException, IOException {

        PageFactory.initElements(driver, SMPAdminPage.class);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        SMPAdminPage.Services.click();
        Thread.sleep(1000);
    }
}
