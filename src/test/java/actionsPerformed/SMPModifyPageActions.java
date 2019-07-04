package actionsPerformed;

import GlobalActions.Screenshots;
import helpers.Environment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pageobjects.SMPLoginPage;
import pageobjects.SMP_Services_page;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SMPModifyPageActions extends Environment {

    public static void Modify_service_link(String name) throws InterruptedException, IOException {
        //  PageFactory.initElements(driver, SM.class);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        List<WebElement> allvalue = driver.findElements(By.xpath("/html/body/form[1]/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr/td[3]"));
        System.out.println(allvalue.size());
        for (int i = 0; i <= allvalue.size(); i++) {
            if (allvalue.get(i).getText().equals(name))
            {
                 driver.findElement(By.xpath("  /html/body/form[1]/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr["+(i+3)+"]/td[1]/div/a")).click();
                }

            }

        }

        public static void Modify_service(String description) throws InterruptedException,IOException{

        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        Screenshots.captureScreenshot();
        SMP_Services_page.services_description.sendKeys(description);
        SMP_Services_page.services_Modify.click();
        //SMP_Services_page.Modify_ok.click();
        }


    }



