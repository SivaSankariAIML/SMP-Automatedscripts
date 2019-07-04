package actionsPerformed;

import GlobalActions.Screenshots;
import helpers.Environment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pageobjects.SMPPartitionsPage;
import pageobjects.SMP_Services_page;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SMPPartitionPageActions extends Environment {

    public static void Partitions() throws InterruptedException, IOException {

        PageFactory.initElements(driver, SMPPartitionsPage.class);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        SMPPartitionsPage.Partitions.click();
    }

    public static void Fill_Partition_details(String servicegroup, String name, String LowBalance, String MaxBalance, String BonusMax, String description) throws InterruptedException, IOException {

        PageFactory.initElements(driver, SMPPartitionsPage.class);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        SMPPartitionsPage.Servicegroup.sendKeys(servicegroup);
        SMPPartitionsPage.Name.sendKeys(name);
        SMPPartitionsPage.LowBalance.sendKeys(LowBalance);
        SMPPartitionsPage.MaxBalance.sendKeys(MaxBalance);
        SMPPartitionsPage.BonusBalance.sendKeys(BonusMax);
        SMPPartitionsPage.Description.sendKeys(description);
        //   SMPPartitionsPage.Add_partition.click();


    }

    public static void Modify_partition_link(String name) throws InterruptedException, IOException {
        //  PageFactory.initElements(driver, SM.class);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        List<WebElement> allvalue = driver.findElements(By.xpath("/html/body/form[1]/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td[4]"));
        System.out.println(allvalue.size());
        for (int i = 0; i <= allvalue.size(); i++) {
            if (allvalue.get(i).getText().equals(name)) {
                driver.findElement(By.xpath("/html/body/form[1]/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr[" + (i + 3) + "]/td[1]/div/a")).click();
                break;
            }

        }
        //  System.out.println("out");
    }

    public static void Modify_partition(String description, String LowBalance, String BonusMax) throws InterruptedException, IOException {
        PageFactory.initElements(driver, SMPPartitionsPage.class);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        SMPPartitionsPage.Description.clear();
        SMPPartitionsPage.Description.sendKeys(description);
        SMPPartitionsPage.LowBalance.clear();
        SMPPartitionsPage.LowBalance.sendKeys(LowBalance);
        SMPPartitionsPage.BonusBalance.clear();
        SMPPartitionsPage.BonusBalance.sendKeys(BonusMax);
        //  SMPPartitionsPage.Modify_Partition.click();

    }

    public static void Delete_partition(String name) throws InterruptedException, IOException {
        PageFactory.initElements(driver, SMPPartitionsPage.class);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        List<WebElement> allvalue = driver.findElements(By.xpath("/html/body/form[1]/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td[4]"));
        System.out.println(allvalue.size());
        System.out.println(name);

        for (int i = 0; i <= allvalue.size(); i++) {
                System.out.println(allvalue.get(i).getText());
                if (allvalue.get(i).getText().equals(name)) {
                System.out.println("Test");
                driver.findElement(By.xpath("/html/body/form[1]/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr["+i+"]/td[2]/div/input")).click();
                break;
            }
        }
        //  SMPPartitionsPage.Delete_partition.click();

    }
}

