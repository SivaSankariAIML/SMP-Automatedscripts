package helpers;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

public class setRuntimeProperty {

	public static Properties RUNTIME;
	final static Logger log = Logger.getLogger("setRuntimeProperty");

	public static void setProperty(String object, String data) {
		log.debug("updating runtime properties");
		RUNTIME = new Properties();
		try {
			// loads existing property file
			FileInputStream fis = new FileInputStream(
					System.getProperty("user.dir") + "\\Configurations\\Properties\\Run.properties");

			RUNTIME.load(fis);
			fis.close();

			//RUNTIME.clear();

			// modifies existing or adds new property value
			RUNTIME.setProperty(object, data);

			// saves modified property file
			FileOutputStream fos = new FileOutputStream(
					System.getProperty("user.dir") + "\\Configurations\\Properties\\Run.properties");
			RUNTIME.store(fos, null);
			fos.close();

			log.debug("Pass: Updated the RunTime Property file successfully");

		} catch (Exception e) {
			log.debug("Fail: Cannot update the RunTime Property File" + " - " + e.getMessage());
		}
	}

}
