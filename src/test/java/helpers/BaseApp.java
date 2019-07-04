/*
 * Added by Vinudeep for Mobile Automation Testing
 */

/*
 * Added by Vinudeep for Mobile Automation Testing
 */

package helpers;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseApp {
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
        capabilities.setCapability("app", file.getAbsoluteFile());
        driver = new AndroidDriver<>(capabilities);
        return driver;
    }
}
