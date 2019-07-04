package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SMP_Responses {


        @FindBy(how = How.LINK_TEXT, using = ("Responses"))
        public static WebElement response;

        @FindBy(how = How.NAME, using = ("IVR"))
        public static WebElement IVR;

        @FindBy(how = How.NAME, using = ("Web"))
        public static WebElement Web;

        @FindBy(how = How.NAME, using = ("CreateNew"))
        public static WebElement Createresponse;

        @FindBy(how = How.NAME, using = ("sms_response_id"))
        public static WebElement smsrespid;

        @FindBy(how = How.NAME, using = ("ivr_response_id"))
        public static WebElement ivrespid;

        @FindBy(how = How.NAME, using = ("web_response_id"))
        public static WebElement webrespid;

        @FindBy(how = How.NAME, using = ("description"))
        public static WebElement description;

        @FindBy(how = How.NAME, using = ("spid"))
        public static WebElement spid;

        @FindBy(how = How.NAME, using = ("plan"))
        public static WebElement plan;

        @FindBy(how = How.NAME, using = ("language"))
        public static WebElement language;

        @FindBy(how = How.NAME, using = ("errorCodeSelect"))
        public static WebElement errorCodeSelect;

        @FindBy(how = How.NAME, using = ("Add"))
        public static WebElement add;



    }

