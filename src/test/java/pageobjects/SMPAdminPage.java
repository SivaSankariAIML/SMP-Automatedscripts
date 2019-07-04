package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SMPAdminPage {

    @FindBy(how = How.XPATH, using = "/html/body/table/tbody/tr[3]/td[1]/table[2]/tbody/tr/td/span/a[1]")
    public static WebElement ServiceProvider;

    @FindBy(how = How.XPATH, using = "/html/body/form[1]/table/tbody/tr/td/table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td/table/tbody/tr/td[2]")
    public static WebElement SPID;

   // @FindBy(how = How.XPATH, using = "/html/body/form[1]/table/tbody/tr/td/table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td/table/tbody/tr[7]/td[1]/div/a")
    //public static WebElement SPID993;

    //@FindBy(how = How.XPATH, using = "/html/body/form[1]/table/tbody/tr/td/table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td/table/tbody/tr[7]/td[1]/div/a")
    //public static WebElement SPID284;

    @FindBy(how=How.XPATH, using="/html/body/table/tbody/tr[2]/td[4]/table[2]/tbody/tr/td/p/span/a[1]")
    public static WebElement Services;

}
