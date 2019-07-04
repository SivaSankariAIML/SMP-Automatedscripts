/*
 * Added by Vinudeep for Mobile Automation Testing
 */

/*
 * Added by Vinudeep for Mobile Automation Testing
 */

/*
 * Added by Vinudeep for Mobile Automation Testing
 */

package helpers;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseWeb {
    public static AndroidDriver<AndroidElement> capabilities() throws Exception
    {
        AndroidDriver<AndroidElement> driver;
        String relativePath = System.getProperty("user.dir");
        System.out.println("The Relative path of the user.dir" + relativePath);

        String EnvPropFilePath = relativePath + "/Configurations/Properties/AppConfig.properties";
        System.out.println("The Env prop path is " + EnvPropFilePath);

        String appPath = Filereadingutility.getPropertyValue(EnvPropFilePath, "appName");
        System.out.println("The App which will be used for testing is " + appPath);

        File file = new File("App\\" + appPath);

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;
    }
}
