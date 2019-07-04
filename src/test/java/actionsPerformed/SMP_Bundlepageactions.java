package actionsPerformed;

import GlobalActions.Screenshots;
import helpers.Environment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pageobjects.SMPPartitionsPage;
import pageobjects.SMP_Bundleconfigpage;
import pageobjects.SMP_Services_page;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SMP_Bundlepageactions extends Environment {

    public static void BundleConfigurations() throws InterruptedException, IOException {

        PageFactory.initElements(driver, SMP_Bundleconfigpage.class);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        SMP_Bundleconfigpage.Bundleconfigurations.click();
    }

    public static void Createnew() throws InterruptedException, IOException {

        PageFactory.initElements(driver, SMP_Bundleconfigpage.class);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        SMP_Bundleconfigpage.createnew.click();
    }

    public static void Filldetails(String bundlename, String description) throws InterruptedException, IOException {

        PageFactory.initElements(driver, SMP_Bundleconfigpage.class);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        SMP_Bundleconfigpage.bundlename.sendKeys(bundlename);
        SMP_Bundleconfigpage.bundledescription.sendKeys(description);

    }

    public static void AddServices(String service1, String service2, String service3, String service4) throws InterruptedException, IOException {

        PageFactory.initElements(driver, SMP_Bundleconfigpage.class);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        Select services = new Select(SMP_Bundleconfigpage.services);
        services.selectByVisibleText(service1);
        services.selectByVisibleText(service2);
        services.selectByVisibleText(service3);
        services.selectByVisibleText(service4);
        SMP_Bundleconfigpage.Include.click();
    }


    public static void Addpartition(String SG, String PartType, String PartAction, String value, String lifespan) throws InterruptedException, IOException {

        PageFactory.initElements(driver, SMP_Bundleconfigpage.class);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        SMP_Bundleconfigpage.AddPartitions.click();
        Select servicegroup = new Select(SMP_Bundleconfigpage.SG);
        servicegroup.selectByVisibleText(SG);
        Select parttype = new Select(SMP_Bundleconfigpage.Parttype);
        parttype.selectByVisibleText(PartType);
        Select partaction = new Select(SMP_Bundleconfigpage.PartAction);
        partaction.selectByVisibleText(PartAction);
        SMP_Bundleconfigpage.Value.sendKeys(value);
        SMP_Bundleconfigpage.LifeSpan.sendKeys(lifespan);
        //     SMP_Bundleconfigpage.addbutton.click();
    }

    public static void ModifyBundle(String bundledescription, String bundlename) throws InterruptedException, IOException {

        PageFactory.initElements(driver, SMP_Bundleconfigpage.class);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        SMP_Bundleconfigpage.Bundleconfigurations.click();
        Screenshots.captureScreenshot();
        List<WebElement> allvalue = driver.findElements(By.xpath("/html/body/form[1]/table/tbody/tr/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table[1]/tbody/tr/td[3]"));
        System.out.println(allvalue.size());
        for (int i = 0; i <= allvalue.size(); i++) {
            System.out.println(allvalue.get(i + 1).getText());
            // if(allvalue.getText().equals("4GADD")) {
            //   System.out.println(allvalue.size());
            // driver.findElement(By.xpath("/html/body/form[1]/table/tbody/tr/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table[1]/tbody/tr[" + i + "]/td[1]/div/a")).click();
            //    break;

            driver.findElement(By.xpath("/html/body/form[1]/table/tbody/tr/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table[1]/tbody/tr[12]/td[1]/div/a")).click();
            SMP_Bundleconfigpage.bundledescription.clear();
            SMP_Bundleconfigpage.bundledescription.sendKeys(bundledescription);

            //   SMP_Bundleconfigpage.modifybutton.click();

        }

    }

    public static void DeleteBundle(String bundlename) throws InterruptedException, IOException {

        PageFactory.initElements(driver, SMP_Bundleconfigpage.class);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        SMP_Bundleconfigpage.Bundleconfigurations.click();
        Screenshots.captureScreenshot();
        List<WebElement> allvalue = driver.findElements(By.xpath("/html/body/form[1]/table/tbody/tr/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table[1]/tbody/tr/td[3]"));
        System.out.println(allvalue.size());
        for (int i = 0; i <= allvalue.size(); i++) {
            System.out.println(allvalue.get(i + 1).getText());
            if (allvalue.get(i).getText().equals(bundlename)) {
                //   System.out.println(allvalue.size());
                // driver.findElement(By.xpath("/html/body/form[1]/table/tbody/tr/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table[1]/tbody/tr[" + i + "]/td[1]/div/a")).click();
                //    break;
            }

            driver.findElement(By.xpath("/html/body/form[1]/table/tbody/tr/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table[1]/tbody/tr[" + i + "]/td[2]/div/input")).click();

            //   SMP_Bundleconfigpage.deletebutton.click();

        }

    }

    public static void Confirmbundle(String bundlename) throws InterruptedException, IOException {
        PageFactory.initElements(driver, SMP_Bundleconfigpage.class);
        List<WebElement> allvalue = driver.findElements(By.xpath("/html/body/form[1]/table/tbody/tr/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table[1]/tbody/tr/td[3]"));
        System.out.println(allvalue.size());
        for (int i = 0; i <= allvalue.size(); i++) {
            System.out.println(allvalue.get(i + 1).getText());
            if (allvalue.get(i).getText().equals(bundlename)) {
                System.out.println("Bundle added");
            } else {
                System.out.println("Bundle not found");
            }
        }
    }
}

