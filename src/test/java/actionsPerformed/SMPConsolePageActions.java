package actionsPerformed;

import GlobalActions.Screenshots;
import helpers.Environment;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pageobjects.SMPConsolePage;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class SMPConsolePageActions extends Environment {

    public static void Select_SMPAdmin() throws InterruptedException, IOException {
        PageFactory.initElements(driver,SMPConsolePage.class);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        SMPConsolePage.SMPAdmin.click();
        Thread.sleep(1000);
    }
    public static void Select_Home() throws InterruptedException, IOException {
        PageFactory.initElements(driver,SMPConsolePage.class);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        SMPConsolePage.Home.click();
        Thread.sleep(1000);
    }
    public static void Select_Console() throws InterruptedException, IOException {
        PageFactory.initElements(driver,SMPConsolePage.class);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Actions action = new Actions(driver);
        action.moveToElement(SMPConsolePage.Home).build().perform();
        SMPConsolePage.Console.click();
        Thread.sleep(1000);
    }

    public static void Select_Customerservice() throws InterruptedException, IOException {
        PageFactory.initElements(driver,SMPConsolePage.class);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        SMPConsolePage.CustomerService.click();
        Thread.sleep(1000);
    }

    public static void Enter_MSISDN(String MSISDN) throws InterruptedException, IOException {
        PageFactory.initElements(driver,SMPConsolePage.class);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        SMPConsolePage.MSISDN.sendKeys(MSISDN);
        SMPConsolePage.Search.click();
        Thread.sleep(1000);
    }
}

