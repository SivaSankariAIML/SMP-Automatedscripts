package StepDefinition;

import Environment.*;
import Resources.SeleniumHelper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.annotation.Resources.Filereadingutility;


public class Tariff_selection_Flow {
	
	
	public static String relativePath = null;
	public static String EnvPropFilePath = null;
	public static String BrowserType = null;

	@Given("^that I am an acquisition/upgrading customer$")
	public void that_I_am_an_acquisition_upgrading_customer() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		relativePath = System.getProperty("user.dir");
		System.out.println(relativePath);
		EnvPropFilePath = relativePath + "\\src\\test\\java\\Properties\\AppConfig.properties";
		BrowserType = Filereadingutility.getPropertyValue(EnvPropFilePath, "Browser_Type");
		System.out.println(BrowserType);
		SeleniumHelper.Invoke_browser(BrowserType);
		Environment.driver.get("https://www.o2.co.uk");
		Thread.sleep(5000);
		 WebElement ele = Environment.driver.findElement(By.xpath("//*[@id='pn1']/a/dl"));
		   Actions action = new Actions(Environment.driver);
		   action.moveToElement(ele).build().perform();
		   Thread.sleep(5000);
		   
		   WebElement ele1 = Environment.driver.findElement(By.xpath("//*[@id='pn1']/ul/li[3]/a"));
		   Actions action1 = new Actions(Environment.driver);
		   action1.moveToElement(ele1).build().perform();
		   Thread.sleep(5000);
		
		   
		   Environment.driver.findElement(By.xpath("//*[@id='pn1']/ul/li[3]/ul/li[3]/a")).click();
		   Thread.sleep(5000);
		   Environment.driver.findElement(By.xpath("//*[@id='o2-page-wrapper']/div[2]/div[3]/div[1]/div[2]")).click();
		   Thread.sleep(10000);
		   Environment.driver.findElement(By.xpath("//form[@id='chooseTariffForm']/div[4]/div[3]/div/div/button")).click();
		   
		   
	}

	@When("^I select a tariff and go to the basket page$")
	public void I_select_a_tariff_and_go_to_the_basket_page() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		 Thread.sleep(10000);
		  Environment.driver.findElement(By.xpath("//*[@id='PayAsYouGoTariffsGridTab']/ul[1]/li[1]/div/button[contains(text(),'Select')]")).sendKeys(Keys.ENTER);
		  Thread.sleep(10000);
		  Environment.driver.findElement(By.xpath("//*[@id='header']/div[2]/div[1]/div/button")).click();
	}

	@When("^I click on Choose a different tariff$")
	public void I_click_on_Choose_a_different_tariff() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		
		Environment.driver.findElement(By.xpath("//a[contains(text(),'Choose a different tariff')]")).click();
	   
	}

	@Then("^I should land on the tariffs and extras page$")
	public void I_should_land_on_the_tariffs_and_extras_page() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		
		String p=Environment.driver.getTitle();
		if(p.contains("O2 | HTC Desire 530 | Tariffs And Extras"))
		    //Pass
		    System.out.println("Page title contains:"+ " "+ p +" "+"Scenario passed");
		else
		    //Fail
		    System.out.println("Page title doesn't contains \"Scenario failed\" ");
	}

	@Then("^I should be able to select a different tariff$")
	public void I_should_be_able_to_select_a_different_tariff() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	   
		Environment.driver.findElement(By.xpath("//*[@id='PayAsYouGoTariffsGridTab']/ul[1]/li[3]/div/button[contains(text(),'Select')]")).click();
		
	}

}
