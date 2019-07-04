/*
 * Added by Vinudeep for Mobile Automation Testing
 */

/*
 * Added by Vinudeep for Mobile Automation Testing
 */

package helpers;

import GlobalActions.AppiumServerJava;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AndroidCapability extends Environment {

    final static Logger log = Logger.getLogger("AndroidCapability");

    public void startApp() throws Exception {

        AppiumServerJava appiumServer = new AppiumServerJava();

        int port = 4731;
        if (!appiumServer.checkIfServerIsRunnning(port)) {
            appiumServer.startServer();
            System.out.println("Appium server started");
        } else {
            System.out.println("Appium Server already running on Port - " + port);
        }

        //Below is default code

        log.debug("Started Appium Server.waiting for some 10 seconds before actual execution");
        Thread.sleep(20000);
        String relativePath = System.getProperty("user.dir");
        log.debug("The Relative path of the user.dir" + relativePath);

        String EnvPropFilePath = relativePath + "/Configurations/Properties/AppConfig.properties";
        log.debug("The Env prop path is " + EnvPropFilePath);

        String appPath = Filereadingutility.getPropertyValue(EnvPropFilePath, "appName");
        log.debug("The App which will be used for testing is " + appPath);

        File file = new File("App\\" + appPath);

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
        //capabilities.setCapability("app", file.getAbsoluteFile());
        capabilities.setCapability("app", file.getAbsoluteFile());
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4731/wd/hub"), capabilities);
    }

    public void startMobileWeb() throws Exception {



        AppiumServerJava appiumServer = new AppiumServerJava();

        int port = 4731;
        if (!appiumServer.checkIfServerIsRunnning(port)) {
            appiumServer.startServer();
            System.out.println("Appium server started");
        } else {
            System.out.println("Appium Server already running on Port - " + port);
        }

        //Below is default code
        log.debug("Started Appium Server.waiting for some 10 seconds before actual execution as server start will take some time");
        Thread.sleep(10000);
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4731/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String relativePath = System.getProperty("user.dir");
        String EnvPropFilePath = relativePath + "/Configurations/Properties/AppConfig.properties";
        String Currenturl = Filereadingutility.getPropertyValue(EnvPropFilePath, "url");
        driver.manage().deleteAllCookies();
        log.debug("Deleted all Cookies");
        //driver.navigate().refresh();


        //  System.out.println(driver.manage().getCookies());


        log.debug("Going to launch browser");
        driver.get(Currenturl);
        log.debug("Invoked URL");

    }

    public void stopAppiumServer() throws Exception {
        AppiumServerJava appiumServer = new AppiumServerJava();
        System.out.println("Going to stop appium server");

        int port = 4731;
        if (appiumServer.checkIfServerIsRunnning(port)) {
            System.out.println("Returned - "+appiumServer.checkIfServerIsRunnning(port));
            appiumServer.stopServer();
            System.out.println("Appium server was running , hence stopped on port - " + port);
            log.debug("Stopped Appium Server.waiting for some 10 seconds ..");
        } else {
            System.out.println("Appium Server was not running on port -  " + port);
            log.debug("Appium Server was not running on port");
        }
        Thread.sleep(10000);
    }
}


