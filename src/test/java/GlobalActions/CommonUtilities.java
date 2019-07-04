package GlobalActions;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static helpers.Environment.driver;

public class CommonUtilities{

	// switch to window
	public static void switchToWindow(WebDriver driver) {
		try {
			String mainWindowHandle = driver.getWindowHandle ();
			//Switch to child window and close it
			for (String childWindowHandle : driver.getWindowHandles ()) {
				//If window handle is not main window handle then close it
				if (!childWindowHandle.equals (mainWindowHandle)) {
					driver.switchTo ().window (childWindowHandle);
					// Close child windows
					// driver.close();
				} else {
					//switch back to main window
					driver.switchTo ().window (mainWindowHandle);
					System.out.println ();
				}
			}
		} catch (Exception e){
			System.out.println ("Failed to switch to window :: " + e.getStackTrace ());

		}
	}

	public static void switchToMainWindow(WebDriver driver) {
		try {
			String mainWindowHandle = driver.getWindowHandle ();
			//Switch to child window and close it
			for (String childWindowHandle : driver.getWindowHandles ()) {
				//If window handle is not main window handle then close it
				if (!childWindowHandle.equals (mainWindowHandle)) {
					driver.switchTo ().window (childWindowHandle);
					// Close child windows
					// driver.close();
				} else {
					//switch back to main window
					driver.switchTo ().window (mainWindowHandle);
					System.out.println ();
				}
			}
		} catch (Exception e){
			System.out.println ("Failed to switch to window :: " + e.getStackTrace ());

		}
	}


	//driver Sleep
	public static void driverWait(WebDriver driver, int waitTime) throws InterruptedException {
		try {
			Thread.sleep (waitTime);
		} catch (Exception e){
			// TODO: handle exception
			System.out.println ("Failed to wait the driver : " + e.getStackTrace ());
		}
	}

	// select the value from the DropDown
	public static void selectValueFromDropDown(WebDriver driver, WebElement locater, String byIndex, String byValue, String byVisibleText) throws InterruptedException {
		try {
			Select select = new Select (locater);
			highlightElement (driver, locater);
			if (!byIndex.contains ("null")) {
				int indexVal = Integer.parseInt (byIndex);
				select.selectByIndex (indexVal);
				System.out.println ("select the value from drop index  : " + indexVal);
				driverWait (driver,1000);
			} else if (!byValue.contains ("null")) {
				select.selectByValue (byValue);
				System.out.println ("select the value from drop  ByValue : " + byValue);
				driverWait (driver,1000);
			} else if (!byVisibleText.contains ("null")) {
				select.selectByVisibleText (byVisibleText);
				driverWait (driver,1000);
			} else {
				System.out.println (" please try to give valid value ");
				driverWait (driver,1000);
			}
		} catch (Exception e){
			// TODO: handle exception
			System.out.println ("Failed to Select value from dropDown : " + e.getStackTrace ());
		}

	}


	// set data to the text fields
	public static void setDataForTextField(WebDriver driver, WebElement locater, String inputVal) throws InterruptedException {
		try {
			locater.isDisplayed ();
			highlightElement (driver, locater);
			locater.sendKeys (Keys.CLEAR);
			locater.sendKeys (inputVal);
			driverWait (driver, 2000);
			locater.sendKeys (Keys.TAB);

		} catch (Exception e){
			// TODO: handle exception
			System.out.println ("Failed to Set input data to the Field : " + e.getStackTrace ());
		}
	}

	// click the web element using javaScript functions
	public static void clickWebElement(WebDriver driver, WebElement locater) throws InterruptedException {
		try {
			//locater.isDisplayed();
			driverWait (driver, 3000);
			highlightElement (driver, locater);
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript ("arguments[0].click();", locater);
			driverWait (driver, 3000);

		} catch (Exception e){
			// TODO: handle exception
			System.out.println ("Failed to Click WebElement : " + e.getStackTrace ());
		}
	}
	public static void clickWebElement(WebElement locater) throws InterruptedException {
		try {
			//locater.isDisplayed();
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript ("arguments[0].click();", locater);
			driverWait (driver, 3000);

		} catch (Exception e){
			// TODO: handle exception
			System.out.println ("Failed to Click WebElement : " + e.getStackTrace ());
		}
	}

	// scroll to web element for viewing
	public static void scrollToElement(WebDriver driver, WebElement locater) throws InterruptedException {
		try {
			driverWait (driver, 3000);
			//JavascriptExecutor executor = (JavascriptExecutor)driver;
			((JavascriptExecutor) driver).executeScript ("arguments[0].scrollIntoView();", locater);
			highlightElement (driver, locater);
			driverWait (driver, 1000);
		} catch (Exception e){
			// TODO: handle exception
			System.out.println ("Failed to Scroll to Element : " + e.getStackTrace ());
		}
	}


	// mouse hour on element
	public static void mouseHousrOnElement(WebDriver driver, WebElement locater) throws InterruptedException {
		try {
			Actions actions = new Actions (driver);
			highlightElement (driver, locater);
			actions.moveToElement (locater).perform ();
			driverWait (driver, 3000);
			// actions.click();
			//actions.perform();
		} catch (Exception e){
			// TODO: handle exception
			System.out.println ("Failed to mouse Hover to Element : " + e.getStackTrace ());
		}
	}

	// verify the Element is exists or not
	public static void VerifyElementExists(WebDriver driver, String verify){
		try {
			WebElement ele = driver.findElement (By.xpath ("//*[contains(text(),'" + verify + "')]"));
			highlightElement (driver, ele);
			if (ele.isDisplayed ()) {
				System.out.println ("Element present");
			} else
				System.out.println ("Element not present");
		} catch (Exception e){
			// TODO: handle exception
			System.out.println ("Failed to identify/verify the Element : " + e.getStackTrace ());
		}
	}

	public static void VerifyElementExists(WebElement locator){
		try {

					if (locator.isDisplayed ()) {
				System.out.println ("Element present");
			} else
				System.out.println ("Element not present");
		} catch (Exception e){
			System.out.println ("Failed to identify/verify the Element : " + e.getStackTrace ());
		}
	}
	public static void VerifyElementExist_withoutAssert(List<WebElement> locator){
		try {
			Thread.sleep(3000);
			int sizeElement = locator.size();
			if(sizeElement>0)
			{
				System.out.println("Expected popup/screen is displayed");
			}
			else
			{
				System.out.println("Expected popup/screen is not displayed");
			}
		} catch (Exception e){
			System.out.println ("Failed to identify/verify the Element : " + e.getStackTrace ());
		}
	}
	//get the text value from the application
	public static void getText(WebDriver driver, WebElement locater){
		try {
			String getTextval = locater.getText ();
			highlightElement (driver, locater);
			if (!getTextval.contains ("")) {
				System.out.println ("Element present");
			} else
				System.out.println ("Element not present");
			//Assert.assertTrue("");

		} catch (Exception e){
			// TODO: handle exception
			System.out.println ("Failed to getTextVal : " + e.getStackTrace ());
		}
	}

	// check the checkbox irrespective of weather selected or not
	public static void checkCheckBox(WebDriver driver, WebElement locater) {
		try {
			boolean checkStatus = locater.isSelected ();
			highlightElement (driver, locater);
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
	public static void unCheckCheckBox(WebDriver driver, WebElement locater){
		try {
			boolean checkStatus = locater.isSelected ();
			highlightElement (driver, locater);
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
	public static void switchToFrame(WebDriver driver, String value){
		try {
			driver.switchTo ().frame (value);
		} catch (Exception e){
			// TODO: handle exception
			System.out.println ("Failed to switch to frame" + e.getStackTrace ());
		}
	}

	// swatch back to freame/ back to default position
	public static void defaultFrame(WebDriver driver, String value){
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
			highlightElement (driver, locater);
			locater.click ();
		} catch (Exception e){
			// TODO: handle exception
			System.out.println ("Failed to back to default frame" + e.getStackTrace ());
		}
	}

	// highlight the webelement if it visible
	public static void highlightElement(WebDriver driver, WebElement locater) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript ("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", locater);
		Thread.sleep (2000);
		js.executeScript ("arguments[0].setAttribute('style','border: solid 2px white')", locater);
	}



	public static String VerifyText(WebDriver driver, String verify) throws InterruptedException{
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
