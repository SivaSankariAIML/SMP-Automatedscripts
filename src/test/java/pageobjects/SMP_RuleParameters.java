package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SMP_RuleParameters {

    @FindBy(how = How.LINK_TEXT, using = ("SMP Administration"))
    public static WebElement SMPadmin;

    @FindBy(how = How.LINK_TEXT, using = ("Rule Parameters"))
    public static WebElement rulep;

    @FindBy(how = How.NAME, using = ("CreateNew"))
    public static WebElement create;

    @FindBy(how = How.NAME, using = ("value"))
    public static WebElement value;

    @FindBy(how = How.NAME, using = ("description"))
    public static WebElement description;

    @FindBy(how = How.NAME, using = ("start_date"))
    public static WebElement startdt;

    @FindBy(how = How.NAME, using = ("end_date"))
    public static WebElement enddt;

    @FindBy(how = How.NAME, using = ("Add"))
    public static WebElement add;


}
