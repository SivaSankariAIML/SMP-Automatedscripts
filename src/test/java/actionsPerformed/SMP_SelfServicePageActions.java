package actionsPerformed;

import GlobalActions.Screenshots;
import helpers.Environment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pageobjects.SMP_OrderprocessingPage;
import pageobjects.SMP_SelfServicePage;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SMP_SelfServicePageActions extends Environment {

    public static void ClickBusinessProcesses() throws InterruptedException, IOException {
        PageFactory.initElements(driver, SMP_SelfServicePage.class);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        SMP_SelfServicePage.Businessprocess.click();
    }

    public static void AddBP(String BPID, String Description) throws InterruptedException, IOException {

        PageFactory.initElements(driver, SMP_SelfServicePage.class);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        SMP_SelfServicePage.BPID.sendKeys(BPID);
        SMP_SelfServicePage.BPDescription.sendKeys(Description);
        //  SMP_SelfServicePage.AddBP.click();
    }

    public static void DeleteBP(String BPID) throws InterruptedException, IOException {

        PageFactory.initElements(driver, SMP_SelfServicePage.class);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        List<WebElement> allvalue = driver.findElements(By.xpath("/html/body/form[1]/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]"));
        System.out.println(allvalue.size());
        for (int i = 0; i <= allvalue.size(); i++) {
            if (allvalue.get(i).getText().equals(BPID)) {
                driver.findElement(By.xpath("/html/body/form[1]/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr[" + (i + 3) + "]/td[1]/div/input")).click();
            }

        }
      //  SMP_SelfServicePage.DeleteBP.click();

    }



    public static void ClickWebRequests() throws InterruptedException, IOException {
        PageFactory.initElements(driver, SMP_SelfServicePage.class);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        SMP_SelfServicePage.Requests.click();
    }

    public static void AddWebRequests(String SPID, String Plan,String BP,String ReqID,String VRS) throws InterruptedException, IOException {

        PageFactory.initElements(driver, SMP_SelfServicePage.class);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        SMP_SelfServicePage.CreatenewWebRequests.click();
        Select SPIDinput=new Select(SMP_SelfServicePage.SPID);
        SPIDinput.selectByVisibleText(SPID);
        Select Planinput=new Select(SMP_SelfServicePage.Plan);
        Planinput.selectByVisibleText(Plan);
        Select BPinput=new Select(SMP_SelfServicePage.BusinessProcess);
        BPinput.selectByVisibleText(BP);
        Select VRSinput=new Select(SMP_SelfServicePage.ValidationRequests);
        VRSinput.selectByVisibleText(ReqID);
        Select ReqIDinput=new Select(SMP_SelfServicePage.ReqID);
        ReqIDinput.selectByVisibleText(VRS);
      //  SMP_SelfServicePage.AddWebRequest.click();
    }

    public static void Deletewebreq(String BPID) throws InterruptedException, IOException {

        PageFactory.initElements(driver, SMP_SelfServicePage.class);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        List<WebElement> allvalue = driver.findElements(By.xpath("/html/body/form[1]/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]"));
        System.out.println(allvalue.size());
        for (int i = 0; i <= allvalue.size(); i++) {
            if (allvalue.get(i).getText().equals(BPID)) {
                driver.findElement(By.xpath("/html/body/form[1]/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr[" + (i + 3) + "]/td[1]/div/input")).click();
            }

        }
        //  SMP_SelfServicePage.DeleteBP.click();

    }
}
