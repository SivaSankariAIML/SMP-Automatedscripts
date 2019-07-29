/*
 * Added by Vinudeep for Mobile Automation Testing
 */

package helpers;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

import static helpers.Environment.driver;

public class BrowserHelper extends Environment{

	public static void Invoke_browser(String BrowserType) throws InterruptedException {
		if (BrowserType.equalsIgnoreCase("ie")) {

			String OSArchitecture = System.getProperty("os.arch");
			System.out.println(OSArchitecture);
			if (OSArchitecture.equalsIgnoreCase("x86")) {

				System.setProperty("webdriver.ie.driver",
						"src\\test\\java\\InternalLibraries\\BrowserDrivers\\Internet_Explorer\\IEDriverServer_Win32_3.1.0\\IEDriverServer.exe");
			} else {
				System.setProperty("webdriver.ie.driver",
						"src\\test\\java\\InternalLibraries\\BrowserDrivers\\Internet_Explorer\\IEDriverServer_x64_3.1.0\\IEDriverServer.exe");
			}

			DesiredCapabilities capability = DesiredCapabilities.internetExplorer();
			capability.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			capability.setCapability("useLegacyInternalServer", true);
			driver = new InternetExplorerDriver(capability);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();

		} else if (BrowserType.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "Browsers/ChromeDriver/chromedriver.exe");
			// Environment.driver = new ChromeDriver();
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			ChromeOptions options = new ChromeOptions();
			options.addArguments("disable-extensions");
			options.addArguments("--start-maximized");
			//options.addArguments("user-data-dir=Browsers/userdata/");
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);

			driver = new ChromeDriver(capabilities);
			System.out.println("Launched driver");
			Thread.sleep(3000);
			driver.manage().window().maximize();

		} else if (BrowserType.equalsIgnoreCase("mozilla")) {

			FirefoxProfile profile = new FirefoxProfile();
			profile.setAssumeUntrustedCertificateIssuer(false);
			System.setProperty("webdriver.gecko.driver", "Browsers/GeckoDriver/geckodriver.exe");
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			FirefoxProfile fp = new FirefoxProfile();
			fp.setAcceptUntrustedCertificates(true);
			fp.setAssumeUntrustedCertificateIssuer(true);
			fp.setEnableNativeEvents(false);
			capabilities.setCapability(FirefoxDriver.PROFILE, fp);
			driver = new FirefoxDriver(capabilities);
			driver.manage().window().maximize();

		}

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

}
