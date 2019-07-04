package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SMP_CustomerServiceServiceRemoveobjects {

    @FindBy(how = How.XPATH, using = "/html/body/form[1]/table/tbody/tr/td/table[3]/tbody/tr[1]/td[1]/table/tbody/tr[3]/td/p/span/a[2]")
    public static WebElement ClickServices;


    @FindBy(how=How.XPATH,using="/html/body/form[1]/table/tbody/tr[1]/td/table[3]/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table[1]/tbody/tr/td[6]/a/img")
    public  static  WebElement ClickRemoveTab;


    @FindBy(how=How.XPATH,using="//*[@id=\"Delete0\"]")
    public  static  WebElement ClickFirstCheckbox;


    @FindBy(how=How.NAME,using="Delete")
    public static WebElement Deletebutton;

}
