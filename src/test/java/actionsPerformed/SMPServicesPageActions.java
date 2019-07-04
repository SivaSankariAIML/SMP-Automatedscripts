package actionsPerformed;

import GlobalActions.Screenshots;
import helpers.Environment;
import org.apache.http.cookie.SM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pageobjects.SMP_Services_page;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SMPServicesPageActions extends Environment {

    public static void Create_new() throws InterruptedException, IOException {

        PageFactory.initElements(driver, SMP_Services_page.class);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        SMP_Services_page.Createnew.click();
    }

    public static void Fill_details(String name, String description, String SyntaxON, String SyntaxOFF) throws InterruptedException, IOException

    {
        Thread.sleep(1000);
        SMP_Services_page.services_name.sendKeys(name);
        SMP_Services_page.services_description.sendKeys(description);
        SMP_Services_page.services_syntaxon.sendKeys(SyntaxON);
        SMP_Services_page.services_syntaxoff.sendKeys(SyntaxOFF);
        //SMP_Services_page.services_Add.click();
    }

    public static void Delete_service(String name) throws InterruptedException, IOException

    {
        List<WebElement> allvalue = driver.findElements(By.xpath("/html/body/form[1]/table/tbody/tr/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table[1]/tbody/tr/td[3]"));
        System.out.println(allvalue.size());
        for (int i = 0; i <= allvalue.size(); i++) {
            if (allvalue.get(i).getText().equals(name)) {
                driver.findElement(By.xpath("/html/body/form[1]/table/tbody/tr/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table[1]/tbody/tr[" + (i + 2) + "]/td[2]/div/input")).click();
                break;
            }
        //   driver.findElement(By.xpath("/html/body/form[1]/table/tbody/tr/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table[1]/tbody/tr[60]/td/div/input")).click();
        }
    }
}
