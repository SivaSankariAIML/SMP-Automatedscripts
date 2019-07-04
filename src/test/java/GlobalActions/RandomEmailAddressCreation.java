package GlobalActions;

import java.io.IOException;
import java.util.UUID;

import org.apache.log4j.Logger;

import helpers.Environment;



public class RandomEmailAddressCreation extends Environment {

	final static Logger log = Logger.getLogger("RandomEmailAddressCreation");

	public static String RandomEmail() throws IOException, InterruptedException {

		String RandomEmail = "STester11" + UUID.randomUUID().toString() + "@gmail.com";
		log.debug("Random Email Address is "+RandomEmail);
		log.debug("Random Email Address is "+RandomEmail);


		return RandomEmail;

	}




}