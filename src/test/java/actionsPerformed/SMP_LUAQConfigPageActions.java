package actionsPerformed;

import GlobalActions.Screenshots;
import helpers.Environment;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pageobjects.SMPAdminPage;
import pageobjects.SMP_CustomerServicePage;
import pageobjects.SMP_LUAQ_ConfigPage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class SMP_LUAQConfigPageActions extends Environment {

    public static void ClickLUAQ() throws InterruptedException, IOException {
        PageFactory.initElements(driver, SMPAdminPage.class);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        //   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        SMPAdminPage.Services.click();
    }

    public static void CreateNew() throws InterruptedException, IOException {
        PageFactory.initElements(driver, SMP_LUAQ_ConfigPage.class);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        //   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        SMP_LUAQ_ConfigPage.CreatenewLUAQ.click();
    }

    public static void AddlUAQ(String SP,String rateplan,String Balancethreshold,String Amount,String Daysuntilpenalty,String penalty,String warndate) throws InterruptedException, IOException {
        PageFactory.initElements(driver, SMP_LUAQ_ConfigPage.class);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        //   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Select serviceprovider=new Select(SMP_LUAQ_ConfigPage.SP);
        serviceprovider.selectByVisibleText(SP);
        Select RP=new Select(SMP_LUAQ_ConfigPage.Rateplan);
        RP.selectByVisibleText(rateplan);
        SMP_LUAQ_ConfigPage.BalanceThreshold.sendKeys(Balancethreshold);
        SMP_LUAQ_ConfigPage.Amount.sendKeys(Amount);
        SMP_LUAQ_ConfigPage.Daysuntil.sendKeys(Daysuntilpenalty);
        SMP_LUAQ_ConfigPage.penalty.sendKeys(penalty);
        SMP_LUAQ_ConfigPage.warndate.sendKeys(warndate);
      //  SMP_LUAQ_ConfigPage.Add.click();
    }
}
