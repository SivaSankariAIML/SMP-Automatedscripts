package GlobalActions;

import helpers.Environment;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CommonActions extends  Environment{

    final static Logger log = Logger.getLogger("scrollToAnElement");

    // switch to window
    public static void switchToWindow() {
        try {
            String mainWindowHandle = driver.getWindowHandle ();
            //Switch to child window and close it
            for (String childWindowHandle : driver.getWindowHandles ()) {
                //If window handle is not main window handle then close it
                if (!childWindowHandle.equals (mainWindowHandle)) {
                    driver.switchTo ().window (childWindowHandle);
                    System.out.println(" Driver is Switch to Child Window");
                    log.info(" Driver is Switch to Child Window");
                } else {
                    //switch back to main window
                    driver.switchTo ().window (mainWindowHandle);
                    System.out.println(" Driver is still stands in Main Window");
                    log.info(" Driver is still stands in Main Window");
                }
            }
        } catch (Exception e){
            System.out.println ("Failed to switch to window :: " + e.getStackTrace ());
            log.info("Failed to switch to window :: " + e.getStackTrace ());

        }
    }

    //Switch back to parent/main window
    public static void switchToMainWindow() {
        try {
            String mainWindowHandle = driver.getWindowHandle ();
            //Switch to child window and close it
            for (String childWindowHandle : driver.getWindowHandles ()) {

                //If window handle is not main window handle then close it
                if (childWindowHandle.equals (mainWindowHandle)) {
                    driver.switchTo ().window (mainWindowHandle);
                    System.out.println(" Driver is Navigate back to Main Window");
                    log.info(" Driver is Navigate back to Main Window");
                } else {
                    //switch back to main window
                    System.out.println(" Failed to Driver is Navigate back to Main Window");
                    log.info(" Failed to Driver is Navigate back to Main Window");
                }
            }
        } catch (Exception e){
            System.out.println ("Failed to switch to window :: " + e.getStackTrace ());

        }
    }


    //driver Sleep
    public static void driverWait(int waitTime) {
        try {
            Thread.sleep(waitTime);
        } catch (Exception e){
            // TODO: handle exception
            System.out.println ("Failed to wait the driver : " + e.getStackTrace ());
        }
    }


    //driver wiat untill page get load
    public static void WaitUntillPageLoad() {
        try {
            driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        } catch (Exception e){
            // TODO: handle exception
            System.out.println ("Failed to wait driver, untill page get Loaded : " + e.getStackTrace ());
        }
    }


    // select the value from the select DropDown
    public static void selectValueFromDropDown(WebElement locater, String byIndex, String byValue, String byVisibleText) {
        try {
            Select select = new Select (locater);
            highlightElement (locater);
            if (!byIndex.contains ("null")) {
                int indexVal = Integer.parseInt (byIndex);
                select.selectByIndex (indexVal);
                System.out.println ("select the value from drop index  : " + indexVal);
            } else if (!byValue.contains ("null")) {
                select.selectByValue (byValue);
                System.out.println ("select the value from drop  ByValue : " + byValue);
            } else if (!byVisibleText.contains ("null")) {
                select.selectByVisibleText (byVisibleText);
            } else {
                System.out.println (" Failed to select a value from dropdown");
            }
        } catch (Exception e){
            // TODO: handle exception
            System.out.println ("Failed to Select value from dropDown : " + e.getStackTrace ());
        }

    }


    // set data to the text fields
    public static void setDataForTextField(WebElement locater, String inputVal) {
        try {
            if(locater.isEnabled()) {
                highlightElement(locater);
                locater.sendKeys(Keys.CLEAR);
                locater.sendKeys(inputVal);
                driverWait(2000);
                locater.sendKeys(Keys.TAB);
            }else
                System.out.println("Not able to set the data to the field");

        } catch (Exception e){
            // TODO: handle exception
            System.out.println ("Failed to Set input data to the Field : " + e.getStackTrace ());
        }
    }

    // click the web element using javaScript functions
    public static void clickWebElement(WebElement locater) {
        try {
            //locater.isDisplayed();
            driverWait (1000);
            highlightElement (locater);
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript ("arguments[0].click();", locater);
            driverWait (1000);

        } catch (Exception e){
            // TODO: handle exception
            System.out.println ("Failed to Click WebElement : " + e.getStackTrace ());
        }
    }

    // scroll to web element for viewing
    public static void scrollToElement(WebElement locater) {
        try {
            driverWait (1000);
            //JavascriptExecutor executor = (JavascriptExecutor)driver;
            ((JavascriptExecutor) driver).executeScript ("arguments[0].scrollIntoView();", locater);
            highlightElement (locater);
            driverWait (1000);
        } catch (Exception e){
            // TODO: handle exception
            System.out.println ("Failed to Scroll to Element : " + e.getStackTrace ());
        }
    }


    // mouse hour on element
    public static void mouseHousrOnElement(WebElement locater) {
        try {
            Actions actions = new Actions (driver);
            highlightElement (locater);
            actions.moveToElement (locater).perform ();
            driverWait (1000);
            // actions.click();
            //actions.perform();
        } catch (Exception e){
            // TODO: handle exception
            System.out.println ("Failed to mouse Hover to Element : " + e.getStackTrace ());
        }
    }

    // verify the Element is exists or not
    public static void VerifyTextExists(String verify){
        try {
            WebElement verfifyTxtPresent = driver.findElement (By.xpath ("//*[contains(text(),'" + verify + "')]"));
            highlightElement (verfifyTxtPresent);
            if (verfifyTxtPresent.isDisplayed ()) {
                System.out.println (verfifyTxtPresent + " :: is test is present in the page"+driver.getTitle());
            } else
                System.out.println ("Element not present in a page :: " + driver.getTitle());
        } catch (Exception e){
            // TODO: handle exception
            System.out.println ("Failed to identify/verify the Element : " + e.getStackTrace ());
        }
    }

    public static void VerifyElementExists(WebElement locator) {
        try {
            if (locator.isDisplayed()) {
                System.out.println("Element present in a page  ::" + driver.getTitle());
            } else
                System.out.println("Element not present");
        } catch (Exception e) {
            System.out.println("Failed to identify/verify the Element : " + e.getStackTrace());
        }
    }

    //get the text value from the application
    public static void getTextofElement(WebElement locater){
        try {
            if(locater.isEnabled()) {
                String getTextval = locater.getText();
                highlightElement(locater);
                if (!getTextval.contains("")) {
                    System.out.println("Element present");
                } else
                    System.out.println("Element not present");
                //Assert.assertTrue("");
            }else
                System.out.println("Webelement is not displayed ");
        } catch (Exception e){
            // TODO: handle exception
            System.out.println ("Failed to getTextVal : " + e.getStackTrace ());
        }
    }

    // check the checkbox irrespective of weather selected or not
    public static void checkCheckBox(WebElement locater) {
        try {
            boolean checkStatus = locater.isSelected ();
            highlightElement (locater);
            if (checkStatus == false) {
                ((JavascriptExecutor) driver).executeScript (
                        "arguments[0].scrollIntoView(true);", locater);
                System.out.println ("CheckBox is checked Now");
                locater.click ();
            } else {
                System.out.println ("CheckBox already checked");
            }
        } catch (Exception e){
            // TODO: handle exception
            System.out.println ("Failed to check the checkBox" + e.getStackTrace ());
        }
    }

    // unCheck the checkbox irrespective of weather selected or not
    public static void unCheckCheckBox(WebElement locater){
        try {
            boolean checkStatus = locater.isSelected ();
            highlightElement (locater);
            if (checkStatus == true) {
                ((JavascriptExecutor) driver).executeScript (
                        "arguments[0].scrollIntoView(true);", locater);
                System.out.println ("CheckBox is unChecked Now");
                locater.click ();
            } else {
                System.out.println ("CheckBox already unChecked");
            }
        } catch (Exception e){
            // TODO: handle exception
            System.out.println ("Failed to unCheck the checkBox" + e.getStackTrace ());
        }
    }

    // switch to frame
    public static void switchToFrame(String value){
        try {
            driver.switchTo ().frame (value);
        } catch (Exception e){
            // TODO: handle exception
            System.out.println ("Failed to switch to frame" + e.getStackTrace ());
        }
    }

    // swatch back to freame/ back to default position
    public static void defaultFrame(String value){
        try {
            driver.switchTo ().defaultContent ();
        } catch (Exception e){
            // TODO: handle exception
            System.out.println ("Failed to back to default frame" + e.getStackTrace ());
        }
    }

    // select the radio button
    public static void selectRadioButton(WebDriver driver, WebElement locater){
        try {
            ((JavascriptExecutor) driver).executeScript (
                    "arguments[0].scrollIntoView(true);", locater);
            System.out.println ("select the Radio button");
            highlightElement (locater);
            locater.click ();
        } catch (Exception e){
            // TODO: handle exception
            System.out.println ("Failed to back to default frame" + e.getStackTrace ());
        }
    }

    // highlight the webelement if it visible
    public static void highlightElement(WebElement locater) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript ("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", locater);
        Thread.sleep (2000);
        js.executeScript ("arguments[0].setAttribute('style','border: solid 2px white')", locater);
    }



    public static String VerifyText(String verify) {
        String ele="";
        try{
            ele= driver.findElement(By.xpath("//*[contains()='"+verify+"']")).getText();
            //return ele;
        }catch (Exception e) {
            System.out.println("Failed to identify Element : " + e.getStackTrace());
        }
        return ele;
    }


}
