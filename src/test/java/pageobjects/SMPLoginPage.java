package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SMPLoginPage {

    @FindBy(how = How.NAME, using = "username")
    public static WebElement username;

    @FindBy(how = How.XPATH, using = "/html/body/table/tbody/tr/td/form/table/tbody/tr[3]/td[2]/input")
    public static WebElement password;

    @FindBy(how = How.XPATH, using = "/html/body/table/tbody/tr/td/form/table/tbody/tr[4]/td/div/input")
    public static WebElement submit;
}
