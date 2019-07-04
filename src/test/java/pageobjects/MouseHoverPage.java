package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import helpers.Environment;

public class MouseHoverPage extends Environment {

	// Below will click on the Header Just to move mouse
	@FindBy(how = How.ID, using = ("shop-simplicity-header-xxl"))
	public static WebElement MoveMouseOnShopHeader;

	// Below will click on the Shop Tab
	//@FindBy(how = How.XPATH, using = ("//*[@id='block-o2-theme-personaldesktopmainmenu']/div[4]/ul/li[1]/a"))
	//@FindBy(how = How.XPATH, using = ("//*[@id='pn1']"))
	@FindBy(how = How.XPATH, using = ("//div[@class='nav-consumer']/ul/li/a[contains(@href, '/shop')]"))
	public static WebElement MoveMouseOnShopTab;
	
	// Below will click on the Phones Link
	@FindBy(how = How.XPATH, using = ("//a[contains(text(), 'Phones')]"))
	public static WebElement MoveMouseOnPhones;

	//@FindBy(how = How.XPATH, using = ("//a[contains(text(), 'Pay Monthly phones')]"))
	@FindBy(how = How.XPATH, using = ("//a[contains(text(), 'Pay Monthly')]"))
	public static WebElement MoveMouseOnPAYMPhones;

	//@FindBy(how = How.XPATH, using = ("//a[contains(text(), 'Pay As You Go phones')]"))
	@FindBy(how = How.XPATH, using = ("//a[contains(text(), 'Pay as you go phones')]"))
	public static WebElement MoveMouseOnPAYGPhones;

	@FindBy(how = How.XPATH, using = ("//a[contains(text(), 'Browse Phones')]"))
	public static WebElement MoveMouseOnBrowsePhones;

	@FindBy(how = How.XPATH, using = ("//a[contains(text(), 'iPad')]"))
	public static WebElement MoveMouseOniPad;

	// Below will click on the Phone -- > Like New
	@FindBy(how = How.XPATH, using = ("//a[contains(text(), 'Like New')]"))
	public static WebElement MoveMouseOnLikeNew;

	// Below will click on the Sims
	//@FindBy(how = How.XPATH, using = ("//*[@id='pn1']/ul/li/a[contains(text(), 'Sims')]"))
	@FindBy(how = How.XPATH, using = ("//a[contains(text(), 'Sims')][1]"))
	public static WebElement MoveMouseOnSims;

	// Below will click on the Sims -- > Ipad
	//@FindBy(how = How.XPATH, using = ("//a[contains(text(), 'iPad Sims')][1]"))
	@FindBy(how = How.XPATH, using = ("//a[contains(@href, 'http://www.o2.co.uk/broadband/ipad-sim')]"))
	public static WebElement MoveMouseOnIpadSims;

	// Below will click on the Sims -- > Tablet
//	@FindBy(how = How.XPATH, using = ("//a[contains(text(), 'Tablet Sim')]"))	
	@FindBy(how = How.XPATH, using = ("//a[contains(@href, 'http://www.o2.co.uk/tablet-sims')]"))
	public static WebElement MoveMouseOnTabletSims;

	// Below will click on the Sims -- > PayM
	//@FindBy(how = How.XPATH, using = ("//a[contains(text(), 'Pay Monthly Sims')]"))
	
	@FindBy(how = How.XPATH, using = ("//a[@manual_cm_re='meganav_Shop-_-Sims-_-Pay Monthly sims']"))
	public static WebElement MoveMouseOnPayMSims;

	@FindBy(how = How.XPATH, using = ("//a[contains(text(), 'Upgrades')]"))
	public static WebElement MouseMoveonUpgrade;

	@FindBy(how = How.XPATH, using = ("//a[contains(text(), 'Upgrade now')]"))
	public static WebElement MouseMoveonUpgradeAndUpgradeNow;

	// Below will click on the Tablets Tab

	@FindBy(how = How.XPATH, using = ("//a[contains(text(), 'Browse Tablets')]"))
	public static WebElement MoveMouseOnBrowseTablets;

	@FindBy(how = How.XPATH, using = ("//a[contains(text(), 'Tablets')]"))
	public static WebElement MoveMouseOnTablets;

	// Below is the link on the Accessory
	@FindBy(how = How.XPATH, using = ("//a[contains(text(), 'Accessories')]"))
	public static WebElement MoveMouseOnAccessoriesTab;

	@FindBy(how = How.XPATH, using = ("//a[contains(text(), 'All accessories')]"))
	public static WebElement MoveMouseOnAllAccessories;

	// Below is the link on the Smart Tech

	// @FindBy(how = How.XPATH, using = "//a[contains(@href,
	// 'https://www.ref.o2.co.uk/shop/smart-tech/')]")
	//@FindBy(how = How.XPATH, using = ("//*[@id='pn1']/ul/li[10]/a"))
	//@FindBy(how = How.XPATH, using = ("//a[contains(text(), 'Smart Tech')]"))
	@FindBy(how = How.XPATH, using = ("//a[contains(@href, 'https://www.o2.co.uk/shop/smart-tech/')]"))
	public static WebElement MoveMouseOnSmarttechTab;

	// Below is the link on the Smartwatches
	@FindBy(how = How.XPATH, using = ("//a[contains(text(), 'Smartwatches')]"))
	public static WebElement MoveMouseOnSmartwatches;

	// Below is the link on the Fitness

	//@FindBy(how = How.XPATH, using = ("//a[contains(text(), 'Fitness Trackers')]"))
	
	@FindBy(how = How.XPATH, using = ("//a[contains(@href, 'https://www.o2.co.uk/shop/fitness-trackers/')]"))
	public static WebElement MoveMouseOnFitnessTrackers;

	// Below will click on the MobileBroadband Link in Shop Drop down
	@FindBy(how = How.XPATH, using = ("//a[contains(text(), 'Mobile broadband')]"))
	public static WebElement MoveMouseOnMobileBroadband;

	// Below will click on the Pay as you Go Link under MobileBroadband tab
	/*@FindBy(how = How.XPATH, using = ("//a[contains(text(), 'Pay As You Go')]"))
	public static WebElement MoveMouseOnPayGMBB;*/
	@FindBy(how = How.XPATH, using = ("//a[contains(@href, 'https://www.o2.co.uk/shop/mobile-broadband/?contractType=payasyougo')]"))
	public static WebElement MoveMouseOnPayGMBB;

	
	//@FindBy(how = How.XPATH, using = ("//a[contains(@href, 'https://www.o2.co.uk/shop/mobile-broadband/?contractType=paymonthly')]"))
	
	@FindBy(how = How.XPATH, using = ("//*[@manual_cm_re='meganav_Shop-_-Mobile broadband-_-Pay monthly']"))
	public static WebElement MoveMouseOnPayMMBB;
	//a[@href='https://www.o2.co.uk/shop/mobile-broadband/?contractType=paymonthly']
}
