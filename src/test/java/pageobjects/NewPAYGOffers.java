package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewPAYGOffers {


	@FindBy(how = How.NAME, using = ("username"))
	public static WebElement username;
	
	@FindBy(how = How.NAME, using = ("password"))
	public static WebElement password;
	
	
	@FindBy(how = How.NAME, using = ("Submit"))
	public static WebElement Submit;

	@FindBy(how = How.LINK_TEXT, using = ("SMP Administration"))
	public static WebElement SMPadmin;
	
	
	@FindBy(how = How.LINK_TEXT, using = ("Offers"))
	public static WebElement Offers;
	
	@FindBy(how = How.ID_OR_NAME, using =("offerKind"))
	public static WebElement Offerkind;

	@FindBy(how = How.ID_OR_NAME, using =("spid"))
	public static WebElement service;
	
	@FindBy(how = How.XPATH, using = ("//td/a/img[@name='CreateNew']"))
	public static WebElement Createoffer;


}
