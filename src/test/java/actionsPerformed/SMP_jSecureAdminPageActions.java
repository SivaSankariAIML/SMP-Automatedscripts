package actionsPerformed;

import GlobalActions.Screenshots;
import helpers.Environment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pageobjects.SMPConsolePage;
import pageobjects.SMP_jSecure_AdminPage;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SMP_jSecureAdminPageActions extends Environment {

    public static void clickjSecureAdmin() throws InterruptedException, IOException {
        PageFactory.initElements(driver, SMPConsolePage.class);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        //   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        SMPConsolePage.SMPAdmin.click();
        Thread.sleep(1000);
    }

    public static void ClickAdduser() throws InterruptedException, IOException {
        PageFactory.initElements(driver, SMP_jSecure_AdminPage.class);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        //   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        SMP_jSecure_AdminPage.Addusers.click();
        Thread.sleep(1000);
    }

    public static void Adduser(String firstname,String lastname,String username,String password,String verifypassword,String group,String APIuser) throws InterruptedException, IOException {
        PageFactory.initElements(driver, SMP_jSecure_AdminPage.class);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        //   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        SMP_jSecure_AdminPage.Firstname.sendKeys(firstname);
        SMP_jSecure_AdminPage.Lastname.sendKeys(lastname);
        SMP_jSecure_AdminPage.Username.sendKeys(username);
        SMP_jSecure_AdminPage.Password.sendKeys(password);
        SMP_jSecure_AdminPage.verifypassword.sendKeys(verifypassword);
        Select grouplist=new Select(SMP_jSecure_AdminPage.Grouplist);
        grouplist.selectByVisibleText(group);
        if(APIuser.equals("Yes"))
        {
            SMP_jSecure_AdminPage.APIcheckbox.click();
        }
        SMP_jSecure_AdminPage.Addbutton.click();
    }

    public static void ClickViewModDelete() throws InterruptedException, IOException {
        PageFactory.initElements(driver, SMP_jSecure_AdminPage.class);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        //   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        SMP_jSecure_AdminPage.View_Modify_Delete.click();
    }

    public static void ModifyLink(String Username) throws InterruptedException, IOException {
        PageFactory.initElements(driver, SMP_jSecure_AdminPage.class);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        //   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        SMP_jSecure_AdminPage.wildcardsearch.click();
        List<WebElement> username = driver.findElements(By.xpath("//*[@id=\"Layer1\"]/table/tbody/tr/td[4]"));
        System.out.println(username.size());
        for (int i = 0; i <= username.size(); i++) {
            if (username.get(i).getText().equals(Username)) {
                driver.findElement(By.xpath("//*[@id=\"Layer1\"]/table/tbody/tr["+(i+2)+"]/td[2]/a")).click();
                // System.out.println("if");
                break;
            }

    }

}
    public static void ModifyUser(String firstname,String lastname,String group) throws InterruptedException, IOException {
        PageFactory.initElements(driver, SMP_jSecure_AdminPage.class);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        //   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        SMP_jSecure_AdminPage.Firstname.clear();
        SMP_jSecure_AdminPage.Firstname.sendKeys(firstname);
        SMP_jSecure_AdminPage.Lastname.clear();
        SMP_jSecure_AdminPage.Lastname.sendKeys(lastname);
        Select grouplist=new Select(SMP_jSecure_AdminPage.Grouplist);
        grouplist.selectByVisibleText(group);
        SMP_jSecure_AdminPage.Modifybutton.click();

        }


    public static void DeleteLink(String Username) throws InterruptedException, IOException {
        PageFactory.initElements(driver, SMP_jSecure_AdminPage.class);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        //   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        SMP_jSecure_AdminPage.wildcardsearch.click();
        List<WebElement> username = driver.findElements(By.xpath("//*[@id=\"Layer1\"]/table/tbody/tr/td[4]"));
        System.out.println(username.size());
        for (int i = 0; i <= username.size(); i++) {
            if (username.get(i).getText().equals(Username)) {
                driver.findElement(By.xpath("//*[@id=\"Layer1\"]/table/tbody/tr["+(i+2)+"]/td[3]/a")).click();
                // System.out.println("if");
                break;
            }

        }

    }

    public static void Viewlink(String Username) throws InterruptedException, IOException {
        PageFactory.initElements(driver, SMP_jSecure_AdminPage.class);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        //   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        SMP_jSecure_AdminPage.wildcardsearch.click();
        List<WebElement> username = driver.findElements(By.xpath("//*[@id=\"Layer1\"]/table/tbody/tr/td[4]"));
        System.out.println(username.size());
        for (int i = 0; i <= username.size(); i++) {
            if (username.get(i).getText().equals(Username)) {
                driver.findElement(By.xpath("//*[@id=\"Layer1\"]/table/tbody/tr["+(i+2)+"]/td[1]/a")).click();
                // System.out.println("if");
                break;
            }

        }

    }
}
