package GlobalActions;

import java.io.IOException;

import org.apache.log4j.Logger;

import helpers.Environment;
import steps.Hooks;

//Below is for redirecting the Url back to reference shop from live shop

public class Autoredirection extends Environment {

	final static Logger log = Logger.getLogger("Autoredirection");

	public static void redirect() throws InterruptedException, IOException {
		String newUrl = null;
		String url = driver.getCurrentUrl();
		log.debug("The current url is " + url);
		log.debug("The current url is " + url);

		int length = url.length();// length of url
		log.debug("the length of url is " + length);
		int numofChars = 1;
		int preo2inurl = url.indexOf("o"); // this will get index of the o2 -1 ,
		// so it will be till www

		// log.debug("the index of o is "+preo2inurl);

		String refurl = ".ref."; // put newurl name here
		if (!url.contains("ref.o2.co.uk")) {
			newUrl = url.substring(0, preo2inurl - numofChars) + refurl + url.substring(12, length);

			log.debug("The new url is " + newUrl);

			log.debug("The new url is " + newUrl);

			driver.get(newUrl);
			Thread.sleep(2000);

			log.debug("Did Auto Redirection Successfully");
		}

		else {

			log.debug("Auto Redirection is not required, URL already pointed to Ref");
		}
		Screenshots.captureScreenshot();
	}

	public static void redirectUpgrades() throws InterruptedException, IOException {

		String url = driver.getCurrentUrl();
		log.debug("The current url is " + url);
		log.debug("The current url is " + url);
		int length = url.length();// length of url
		log.debug("the length of url is " + length);
		int numofChars = 2;
		int preo2inurl = url.indexOf("2"); // this will get index of the o2 -1 ,
		// so it will be till www

		// log.debug("the index of o is "+preo2inurl);

		String refurl = ".ref."; // put newurl name here
		if (!url.contains("ref.o2.co.uk")) {
			String newUrl = url.substring(0, preo2inurl - numofChars) + refurl + url.substring(17, length);
			log.debug("The new url is " + newUrl);
			log.debug("The new url is " + newUrl);

			driver.get(newUrl);
			Thread.sleep(2000);

			log.debug("Did Auto Redirection Successfully");
		}

		else {

			log.debug("Auto Redirection is not required, URL already pointed to Ref");
		}
		Screenshots.captureScreenshot();
		//Screenshots.captureScreenshot(Hooks.directoryName);
	}

	public static void redirectforHTTPconnections() throws InterruptedException, IOException {

		String url = driver.getCurrentUrl();
		log.debug("The current url is " + url);
		log.debug("The current url is " + url);

		int length = url.length();// length of url
		log.debug("the length of url is " + length);
		int numofChars = 1;
		int preo2inurl = url.indexOf("o"); // this will get index of the o2 -1 ,
		// so it will be till www

		// log.debug("the index of o is "+preo2inurl);

		String refurl = ".ref."; // put newurl name here
		if (!url.contains("ref.o2.co.uk")) {
			String newUrl = url.substring(0, preo2inurl - numofChars) + refurl + url.substring(11, length);
			log.debug("The new url is " + newUrl);
			log.debug("The new url is " + newUrl);

			driver.get(newUrl);
			Thread.sleep(2000);
			log.debug("Did Auto Redirection Successfully");
		} else {

			log.debug("Auto Redirection is not required, URL already pointed to Ref");
		}
		Screenshots.captureScreenshot();
	}

	public static void redirectforHTTPsconnections() throws InterruptedException, IOException {

		String url = driver.getCurrentUrl();
		log.debug("The current url is " + url);
		log.debug("The current url is " + url);

		int length = url.length();// length of url
		log.debug("the length of url is " + length);
		int numofChars = 1;
		int preo2inurl = url.indexOf("o"); // this will get index of the o2 -1 ,
		// so it will be till www

		// log.debug("the index of o is "+preo2inurl);

		String refurl = ".ref."; // put newurl name here

		if (!url.contains("ref.o2.co.uk")) {

			String newUrl = url.substring(0, preo2inurl - numofChars) + refurl + url.substring(12, length);
			log.debug("The new url is " + newUrl);
			log.debug("The new url is " + newUrl);

			driver.get(newUrl);
			Thread.sleep(2000);
			log.debug("Did Auto Redirection Successfully");
		} else {

			log.debug("Auto Redirection is not required, URL already pointed to Ref");
		}
		Screenshots.captureScreenshot();

	}

}
