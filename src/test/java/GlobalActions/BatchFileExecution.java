package GlobalActions;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import helpers.Environment;

public class BatchFileExecution extends Environment  {

	final static Logger log = Logger.getLogger("BatchFileExecution");

		public static void BatchFileTermination() throws InterruptedException 
		{
	System.out.println("executing batch run");
		     String filePath = "C:/batchfileForSelenium/QuitAllRemoveTemp.bat";
	         try {
	              
	             Process p = Runtime.getRuntime().exec(filePath);
	             
	         } catch (Exception e) {
	             e.printStackTrace();
	         }
	     }
	  		  	  

	}

