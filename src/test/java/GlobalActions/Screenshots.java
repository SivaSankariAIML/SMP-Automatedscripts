package GlobalActions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import helpers.Environment;
import helpers.Filereadingutility;
import org.openqa.selenium.WebDriver;
import steps.Hooks;

public class Screenshots extends Environment {

	public static Properties CONFIG;
	final static Logger log = Logger.getLogger("Screenshots");


	/*public static void captureScreenshot() throws IOException, InterruptedException {

		CONFIG = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\Configurations\\Properties\\AppConfig.properties");

		CONFIG.load(fis);
		fis.close();

		if (Filereadingutility
				.getPropertyValue(System.getProperty("user.dir") + "\\Configurations\\Properties\\AppConfig.properties",
						"screenshot_everyStep")
				.equalsIgnoreCase("Y")) {

			File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File dest = new File("ScreenshotsForSteps\\ScreenshotsForSteps_" + timestamp() + ".jpeg");
			FileUtils.copyFile(scr, dest);

		} else if (Filereadingutility
				.getPropertyValue(System.getProperty("user.dir") + "\\Configurations\\Properties\\AppConfig.properties",
						"screenshot_onError")
				.equalsIgnoreCase("Y")) {

			File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File dest = new File("ScreenshotsForSteps\\ScreenshotsForFailures_" + timestamp() + ".jpeg");
			FileUtils.copyFile(scr, dest);
		}

	}*/

	public static void captureScreenshot() throws IOException, InterruptedException {

		CONFIG = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\Configurations\\Properties\\AppConfig.properties");

		CONFIG.load(fis);
		fis.close();

		if (Filereadingutility
				.getPropertyValue(System.getProperty("user.dir") + "\\Configurations\\Properties\\AppConfig.properties",
						"screenshot_everyStep")
				.equalsIgnoreCase("Y")) {

			File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File dest = new File("ScreenshotsForSteps\\"+ Hooks.directoryName + "\\ScreenshotsForSteps_" + timestamp() + ".jpeg");
			FileUtils.copyFile(scr, dest);

		} else if (Filereadingutility
				.getPropertyValue(System.getProperty("user.dir") + "\\Configurations\\Properties\\AppConfig.properties",
						"screenshot_onError")
				.equalsIgnoreCase("Y")) {

			File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File dest = new File("ScreenshotsForSteps\\"+ Hooks.directoryName + "\\ScreenshotsForFailures_" + timestamp() + ".jpeg");
			FileUtils.copyFile(scr, dest);
		}

	}

	public static String timestamp() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}
}


