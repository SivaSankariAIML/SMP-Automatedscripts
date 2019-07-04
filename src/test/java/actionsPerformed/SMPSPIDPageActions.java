package actionsPerformed;

import GlobalActions.Screenshots;
import helpers.Environment;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pageobjects.SMPAdminPage;
import pageobjects.SMPSPIDPage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class SMPSPIDPageActions extends Environment {

    public static void Click_notifications() throws InterruptedException, IOException {
        PageFactory.initElements(driver, SMPSPIDPage.class);
     //   System.out.println("Random");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
//        Select notifications=new Select(driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table[2]/tbody/tr/td[1]/table/tbody/tr[4]/td/p")));
      //  notifications.selectByVisibleText("Notifications");
       SMPSPIDPage.Notifications.click();
        Thread.sleep(1000);
    }
}
