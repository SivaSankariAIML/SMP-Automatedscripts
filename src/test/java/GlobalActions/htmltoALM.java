/*
package GlobalActions;


import java.util.LinkedHashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import atu.alm.wrapper.ALMServiceWrapper;
import atu.alm.wrapper.ITestCase;
import atu.alm.wrapper.enums.StatusAs;
import atu.alm.wrapper.exceptions.ALMServiceException;

public class htmltoALM {
	 static int RunContIncrement = 1;
	public static void AlmIntegration() throws Exception {
		
		//set the Chrome browser property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\subbaiv1\\git\\regression\\Browsers\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new HtmlUnitDriver();
		//launch the report sheet
		driver.get("file:///C:/Users/subbaiv1/Desktop/ALM%20integration/2017-10-24%2017-23-35/2017-10-24%2017-23-35/cucumber-results-feature-overview%20-%20edited.html");

		// Get the title of the page
		System.out.println("Title of the page " + driver.getTitle());
		List<WebElement> tableRows = driver.findElements(By.xpath("//html//table[3]//tr/td[2]"));		
		
		//creating map object
		LinkedHashMap<String, String> tableRecord = new LinkedHashMap<>();	
		  //Below is ALM stuffs   
	     ALMServiceWrapper wrapper = new ALMServiceWrapper(
	                 "https://almo2uk.saas.hp.com/qcbin/");
	     
	   //  htmltoALM refObj = new htmltoALM();
	     wrapper.connect("Venkata.Subbaiah", "Welcome123", "DEFAULT_TELEFONICA_UK", "O_HS_NEW");
	     RunContIncrement = RunContIncrement++;
		for (int rnum = 2; rnum <= tableRows.size()+1; rnum++){			
			String featureName = driver.findElement(By.xpath("//html//table[3]//tr["+rnum+"]/td[1]")).getText();
			String statusValue = driver.findElement(By.xpath("//html//table[3]//tr["+rnum+"]/td[2]")).getText().toUpperCase();
			
			System.out.println("The Reoprt Values are ::: FeatureName @ " + featureName + " & Status is " + statusValue );
			tableRecord.put(featureName, statusValue);		
			if(statusValue.equalsIgnoreCase("skipped"))
			{
				statusValue="failed";
			}
				ITestCase loginTest = wrapper.updateResult("SampleTestSetFolder\\SubTestSetFolder1",
		                "TestSet2",603,featureName , StatusAs.valueOf(statusValue.toUpperCase()));		
					wrapper.createNewRun(loginTest, "Run"+RunContIncrement, StatusAs.valueOf(statusValue.toUpperCase()));			
						  
			//System.out.println("The Report Values are ::: FeatureName @ " + featureName + " & Status is " + statusValue );
	
			tableRecord.put(featureName, statusValue);			
		}	
	        
	        wrapper.close();
	    }  
	}  

	

*/
