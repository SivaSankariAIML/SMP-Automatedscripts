package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SMPSPIDPage {

    @FindBy(how = How.XPATH, using = "(//a[text()='Notifications'])[2]")
    public static WebElement Notifications;


}
