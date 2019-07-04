package actionsPerformed;

import GlobalActions.Screenshots;
import helpers.Environment;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pageobjects.SMP_CustomerServicePage;
import pageobjects.SMP_OrderprocessingPage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class SMP_OrderProcessingPageActions extends Environment {

    public static void ClickOrderprocessing() throws InterruptedException, IOException {
        PageFactory.initElements(driver, SMP_OrderprocessingPage.class);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        //   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        SMP_OrderprocessingPage.clickOrderProcessing.click();
    }

    public static void Verifyorderprocessing(String Ordertype) throws InterruptedException, IOException {
        PageFactory.initElements(driver, SMP_OrderprocessingPage.class);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        Select ordertype=new Select(SMP_OrderprocessingPage.SelectOrderType);
        ordertype.selectByVisibleText(Ordertype);
        SMP_OrderprocessingPage.ClickVerify.click();
        SMP_OrderprocessingPage.ClickSubmit.click();

    }

}