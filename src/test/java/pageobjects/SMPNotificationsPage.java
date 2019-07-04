package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SMPNotificationsPage {

    @FindBy(how = How.XPATH, using = "//*[@id=\"contentCell\"]/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/a/img")
    public static WebElement offers;

    @FindBy(how = How.XPATH, using = "//*[@id=\"Offers_NavLayer\"]/table[1]/tbody/tr/td/a/img")
    public static WebElement newoffer ;

}
