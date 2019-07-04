package GlobalActions;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.apache.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.ServerSocket;

public class AppiumServerJava {

	final static Logger log = Logger.getLogger("AppiumServerJava");
	private AppiumDriverLocalService service;
	private AppiumServiceBuilder builder;
	private DesiredCapabilities cap;

	public void startServer() {
		//Set Capabilities
		cap = new DesiredCapabilities();
		cap.setCapability("noReset", "false");

		//Build the Appium service
		builder = new AppiumServiceBuilder();
		builder.withIPAddress("127.0.0.1");
		builder.usingPort(4731);
		builder.withCapabilities(cap);
		builder.withArgument(GeneralServerFlag.SESSION_OVERRIDE);
		builder.withArgument(GeneralServerFlag.LOG_LEVEL,"error");

		//Start the server with the builder
		service = AppiumDriverLocalService.buildService(builder);
		service.start();
	}

	public void stopServer() {
		try {
			service.stop();
		}
		catch (Exception e)
		{
			log.debug(e.getMessage());
		}
    }

	public boolean checkIfServerIsRunnning(int port) {
		log.debug("we are going to check if server is running or not");
		boolean isServerRunning = false;
		ServerSocket serverSocket;
		try {
			serverSocket = new ServerSocket(port);
			int portnumner = serverSocket.getLocalPort();
			log.debug(portnumner + "Some thing for port verification");
			serverSocket.close();
			log.debug("Serversocket closed on "+port);
		} catch (IOException e) {
			//If control comes here, then it means that the port is in use
			isServerRunning = true;
			log.debug("is ServerRunning is true"+e.getMessage());

		}
		return isServerRunning;
	}

	/*public static void main(String[] args) {
		AppiumServerJava appiumServer = new AppiumServerJava();

		int port = 4723;
		if(!appiumServer.checkIfServerIsRunnning(port)) {
			appiumServer.startServer();
			log.debug("Appium Started");
			*//*appiumServer.stopServer();
			log.debug("Appium Stopped");*//*


		} else {
			log.debug("Appium Server already running on Port - " + port);
		}
	}*/
}