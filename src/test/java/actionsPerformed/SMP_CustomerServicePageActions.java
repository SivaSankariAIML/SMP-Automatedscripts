package actionsPerformed;

import GlobalActions.Screenshots;
import helpers.Environment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pageobjects.SMP_CustomerServicePage;
import pageobjects.SMP_CustomerServicePartitionObjects;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SMP_CustomerServicePageActions extends Environment {

    public static void SelectOfferType(String offertype) throws InterruptedException, IOException {
        PageFactory.initElements(driver, SMP_CustomerServicePage.class);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
     //   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        SMP_CustomerServicePage.Services.click();
        System.out.println(offertype);
       // String jj="Preferences";
        if(offertype.equals("Preferences"))
        {
            SMP_CustomerServicePage.Preferenceoffer.click();
            System.out.println(offertype);
        }

        else if(offertype.equals("Purchase"))
        {
            SMP_CustomerServicePage.PurchaseOffer.click();
        }
        Thread.sleep(1000);
    }


    public static void Selectpreferenceoffer(String offername) throws InterruptedException, IOException {

        List<WebElement> allprefoffer = driver.findElements(By.xpath("//*[@id=\"prefsLayer\"]/table/tbody/tr/td[2]"));
        System.out.println(allprefoffer.size());
        for (int i = 0; i <= allprefoffer.size(); i++) {
            if (allprefoffer.get(i).getText().equals(offername)) {
                System.out.println(offername);
                driver.findElement(By.xpath("//*[@id='prefsLayer']/table/tbody/tr["+(i+1)+"]/td[1]")).click();
                break;
            }
        }
       // Thread.sleep(1000);
    }

    public static void Selectpurchaseoffer(String offername) throws InterruptedException, IOException {

        List<WebElement> allpurchaseoffer = driver.findElements(By.xpath("//*[@id=\"purchaseLayer\"]/table/tbody/tr/td[2]"));
        System.out.println(allpurchaseoffer.size());
        for (int i = 0; i <= allpurchaseoffer.size(); i++) {
            if (allpurchaseoffer.get(i).getText().equals(offername)) {
                System.out.println(offername);
                driver.findElement(By.xpath("//*[@id='purchaseLayer']/table/tbody/tr["+i+"]/td[1]")).click();
                break;
            }
        }
        // Thread.sleep(1000);
    }

    public static void adjustmentoffer(String offername) throws InterruptedException, IOException {

        List<WebElement> alladjustmentoffer = driver.findElements(By.xpath("//*[@id=\"adjustmentLayer\"]/table/tbody/tr/td[2]"));
        System.out.println(alladjustmentoffer.size());
        for (int i = 0; i <= alladjustmentoffer.size(); i++) {
            if (alladjustmentoffer.get(i).getText().equals(offername)) {
                System.out.println(offername);
                driver.findElement(By.xpath("//*[@id='adjustmentLayer']/table/tbody/tr["+(i+2)+"]/td[1]")).click();
                break;
            }
        }
    }


    public static void conditionaloffer(String offername) throws InterruptedException, IOException {

        List<WebElement> allconditionaloffer = driver.findElements(By.xpath("//*[@id=\"conditionalLayer\"]/table/tbody/tr/td[2]"));
        System.out.println(allconditionaloffer.size());
        for (int i = 0; i <= allconditionaloffer.size(); i++) {
            if (allconditionaloffer.get(i).getText().equals(offername)) {
                System.out.println(offername);
                driver.findElement(By.xpath("//*[@id='conditionalLayer']/table/tbody/tr["+(i+1)+"]/td[1]")).click();
                break;
            }
        }
           }


    public static void Confirmoffer() throws InterruptedException, IOException {

        PageFactory.initElements(driver, SMP_CustomerServicePage.class);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        //   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        SMP_CustomerServicePage.Confirmoffer.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        SMP_CustomerServicePage.Saveoffer.click();
        SMP_CustomerServicePage.Okbutton.click();

            }

    public static void ClickRecharge() throws InterruptedException, IOException {

        PageFactory.initElements(driver, SMP_CustomerServicePage.class);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        //   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        SMP_CustomerServicePage.Rechargeclick.click();
          }

    public static void ClickBalanceTab() throws InterruptedException, IOException {

        PageFactory.initElements(driver, SMP_CustomerServicePage.class);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        //   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        SMP_CustomerServicePage.Balancetab.click();
    }

    public static void Creditrealmoney(String Amount,String Reasoncode) throws InterruptedException, IOException {

        PageFactory.initElements(driver, SMP_CustomerServicePage.class);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        //   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        SMP_CustomerServicePage.CreditAmount.sendKeys(Amount);
        Select reasoncode=new Select(SMP_CustomerServicePage.Reasoncodedropdown);
        reasoncode.selectByVisibleText(Reasoncode);
        SMP_CustomerServicePage.Creditbutton.click();
        Thread.sleep(2000);
   //     driver.switchTo().alert().accept();
    //    SMP_CustomerServicePage.CreditOk.click();
    }

    public static void Clickbonus() throws InterruptedException, IOException {

        PageFactory.initElements(driver, SMP_CustomerServicePage.class);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        SMP_CustomerServicePage.Bonusmoneyclick.click();
        //   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }


    public static void Debitrealmoney(String Amount,String Reasoncode) throws InterruptedException, IOException {

        PageFactory.initElements(driver, SMP_CustomerServicePage.class);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        //   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        SMP_CustomerServicePage.DebitAmount.sendKeys(Amount);
        Select reasoncode=new Select(SMP_CustomerServicePage.Reasoncodedropdown2);
        reasoncode.selectByVisibleText(Reasoncode);
        SMP_CustomerServicePage.Debittbutton.click();
        Thread.sleep(2000);
       // driver.switchTo().alert().accept();
        //SMP_CustomerServicePage.CreditOk.click();
    }

    public static void Clickdebitbonus() throws InterruptedException, IOException {

        PageFactory.initElements(driver, SMP_CustomerServicePage.class);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        SMP_CustomerServicePage.Bonusmoneydebitclick.click();
        //   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    public static void CreditPartition(String PartitionName,String Partition,String Value,String ReasonCode) throws InterruptedException,IOException{
        PageFactory.initElements(driver,SMP_CustomerServicePartitionObjects.class);
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        SMP_CustomerServicePartitionObjects.ClickPartitionTab.click();
        Select partitionname=new Select((SMP_CustomerServicePartitionObjects.SelectCreditPatitionName));
        partitionname.selectByVisibleText(PartitionName);
        Select partition=new Select((SMP_CustomerServicePartitionObjects.SelectCreditPatitionType));
        partition.selectByVisibleText(Partition);
        SMP_CustomerServicePartitionObjects.CreditValue.sendKeys(Value);
        Select Reasoncode=new Select((SMP_CustomerServicePartitionObjects.SelectCreditReasoncode));
        Reasoncode.selectByVisibleText(ReasonCode);
        SMP_CustomerServicePartitionObjects.ClickCreditButton.click();

    }


    public static void DebitPartition(String PartitionName,String Partition,String Value,String ReasonCode) throws InterruptedException,IOException{
        PageFactory.initElements(driver,SMP_CustomerServicePartitionObjects.class);
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        SMP_CustomerServicePartitionObjects.ClickPartitionTab.click();
        Select partitionname=new Select((SMP_CustomerServicePartitionObjects.SelectDebitPatitionName));
        partitionname.selectByVisibleText(PartitionName);
        Select partition=new Select((SMP_CustomerServicePartitionObjects.SelectDebitPatitionType));
        partition.selectByVisibleText(Partition);
        SMP_CustomerServicePartitionObjects.CreditValue.sendKeys(Value);
        Select Reasoncode=new Select((SMP_CustomerServicePartitionObjects.SelectDebitReasoncode));
        Reasoncode.selectByVisibleText(ReasonCode);
        SMP_CustomerServicePartitionObjects.ClickDebitButton.click();

    }
}



