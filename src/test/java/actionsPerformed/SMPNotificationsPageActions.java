package actionsPerformed;

import GlobalActions.Screenshots;
import helpers.Environment;
import org.openqa.selenium.support.PageFactory;
import pageobjects.SMPAdminPage;
import pageobjects.SMPNotificationsPage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class SMPNotificationsPageActions extends Environment {

    public static void Create_new_offer() throws InterruptedException, IOException {
        PageFactory.initElements(driver, SMPNotificationsPage.class);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        SMPNotificationsPage.offers.click();
        SMPNotificationsPage.newoffer.click();
        Thread.sleep(1000);
    }
}
