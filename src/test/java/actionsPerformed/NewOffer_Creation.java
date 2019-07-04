package actionsPerformed;


import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pageobjects.NewPAYGOffers;

public class NewOffer_Creation {

	public static void AccessOffers() throws InterruptedException {
	pageobjects.NewPAYGOffers.SMPadmin.click();
	Thread.sleep(3000);
	pageobjects.NewPAYGOffers.Offers.click();
		
	}
	
	public static void addoffer(String offerkind,String Serviceprovider ) throws InterruptedException {
		pageobjects.NewPAYGOffers.Createoffer.click();
		Thread.sleep(4000);
		
		if (offerkind.equalsIgnoreCase("Adjustment")){
			new Select(pageobjects.NewPAYGOffers.Offerkind).selectByVisibleText("Adjustment");
			System.out.println("Adjustment");
			
		}else if (offerkind.equalsIgnoreCase("Preference")) {
			new Select(pageobjects.NewPAYGOffers.Offerkind).selectByVisibleText("Preference");
			System.out.println("Preference");
			
		}else if (offerkind.equalsIgnoreCase("Conditional")) {
			new Select(pageobjects.NewPAYGOffers.Offerkind).selectByVisibleText("Conditional");
			System.out.println("Conditional");
			
		}else if (offerkind.equalsIgnoreCase("LUAQ")) {
			new Select(pageobjects.NewPAYGOffers.Offerkind).selectByVisibleText("LUAQ");
			System.out.println("LUAQ");
			
		}else if (offerkind.equalsIgnoreCase("Purchase")) {
			new Select(pageobjects.NewPAYGOffers.Offerkind).selectByVisibleText("Purchase");
			System.out.println("Purchase");
		}
	
			if (Serviceprovider.equalsIgnoreCase("O2 UK")){
			new Select(pageobjects.NewPAYGOffers.service).selectByVisibleText("O2 UK");
			System.out.println("O2 UK");
		
		}else if(Serviceprovider.equalsIgnoreCase("Brite & Postpay")) {
			
			new Select(pageobjects.NewPAYGOffers.service).selectByVisibleText("Brite & Postpay");
			System.out.println("BP");
			
		}else if(Serviceprovider.equalsIgnoreCase("O2 & Postpay")) {
			
			new Select(pageobjects.NewPAYGOffers.service).selectByVisibleText("O2 & Postpay");
			System.out.println("P2 Postpay");
		}
	}
	
}
