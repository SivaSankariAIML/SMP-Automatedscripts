package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SMP_Actionsetspage {

    @FindBy(how = How.LINK_TEXT, using = ("SMP Administration"))
    public static WebElement SMPadmin;


    @FindBy(how = How.LINK_TEXT, using = ("Action Sets"))
    public static WebElement Acset;


    @FindBy(how = How.NAME, using = ("CreateNew"))
    public static WebElement create;

    @FindBy(how = How.NAME, using = ("action_set_id"))
    public static WebElement acsid;

    @FindBy(how = How.NAME, using = ("actionSetName"))
    public static WebElement acsname;

    @FindBy(how = How.NAME, using = ("action_id"))
    public static WebElement action; //visibility of text

    @FindBy(how = How.NAME, using = ("offer_id"))
    public static WebElement offer;

    @FindBy(how = How.NAME, using = ("plan_id"))
    public static WebElement plan;

    @FindBy(how = How.NAME, using = ("category_id"))
    public static WebElement category;

    @FindBy(how = How.NAME, using = ("response_id"))
    public static WebElement response;

    @FindBy(how = How.NAME, using = ("session_action_set_id"))
    public static WebElement sacsid;

    @FindBy(how = How.NAME, using = ("start_date"))
    public static WebElement startdt;

    @FindBy(how = How.NAME, using = ("end_date"))
    public static WebElement enddt;


    @FindBy(how = How.NAME, using = ("Add"))
    public static WebElement add;

}
