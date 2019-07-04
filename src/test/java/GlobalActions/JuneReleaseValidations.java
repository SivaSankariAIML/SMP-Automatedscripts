package GlobalActions;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import helpers.Environment;


//Below is for redirecting the Url back to reference shop from live shop

public class JuneReleaseValidations extends Environment {
	


public static void QuantityValidationsBasket() throws InterruptedException, IOException{
		
	WebElement BasketQuantity = driver.findElement(By.id("accessory-quantitySelectBoxIt"));
	String BasketQuantityvalue = BasketQuantity.getText();
	System.out.println("Basket value is "+BasketQuantityvalue);
	Assert.assertEquals("4", BasketQuantityvalue);
	System.out.println(
			"Values are correct , Basket quantity = " + BasketQuantityvalue + "Device added value = 4");
	Screenshots.captureScreenshot();

	}

public static void QuantityValidationsDelivery() throws IOException, InterruptedException {
	// TODO Auto-generated method stub
	WebElement BasketQuantity = driver.findElement(By.className("basket-nonconnected"));
	String BasketQuantityvalue = BasketQuantity.getText();
	System.out.println("Your order contents is "+BasketQuantityvalue);
	Screenshots.captureScreenshot();
	
	if(BasketQuantityvalue.contains("Quantity: 4"))
	{
		System.out.println(
				"Values are correct , Basket quantity = " + BasketQuantityvalue + "Device added value = 4");

	}
	else
	{
		System.out.println("Not Working fine");
		Assert.fail("Quantity Values are not correct");
	}
	
	//Assert.assertEquals(BasketQuantityvalue, "Quantity: 4" );
	
}


public static void QuantityValidationsReview() {
	// TODO Auto-generated method stub
	
}

public static void QuantityValidationsBasket_Grouped() throws Exception{
	// TODO Auto-generated method stub
	WebElement BasketQuantity1 = driver.findElement(By.xpath("//*[@class='orders']/li[1]//*[@id='accessory-quantitySelectBoxIt']"));
	String BasketQuantityvalue1 = BasketQuantity1.getText();
	WebElement BasketElement1 = driver.findElement(By.xpath("//*[@class='orders']/li[1]//*[@class='ac-qauantity-heading']/span"));
	String Basketname1 = BasketElement1.getText();
	System.out.println("Basket is having "+Basketname1+" and the Basketquantity 1 is "+BasketQuantityvalue1);

	
	WebElement BasketQuantity2 = driver.findElement(By.xpath("//*[@class='orders']/li[2]//*[@id='accessory-quantitySelectBoxIt']"));
	String BasketQuantityvalue2 = BasketQuantity2.getText();
	WebElement BasketElement2 = driver.findElement(By.xpath("//*[@class='orders']/li[2]//*[@class='ac-qauantity-heading']/span"));
	String Basketname2 = BasketElement2.getText();
	System.out.println("Basket is having "+Basketname2+" and the Basketquantity 2 is "+BasketQuantityvalue2);

	
	if(BasketQuantityvalue1.contains("2") && BasketQuantityvalue1.contains("3"))
	{
		System.out.println(
				"Values are correct , Basket quantity 1 = " + BasketQuantityvalue1 + " Device added value = 3");
		System.out.println(
				"Values are correct , Basket quantity 2 = " + BasketQuantityvalue2 + " Device added value = 2");
	}
	else
	{
		System.out.println("Not Working fine");
		Assert.fail("Quantity Values are not correct");
	}	
	Screenshots.captureScreenshot();
}

public static void QuantityValidationsDelivery_Grouped() throws IOException, InterruptedException {
	WebElement BasketQuantity = driver.findElement(By.className("basket-nonconnected"));
	String BasketQuantityvalue = BasketQuantity.getText();
	System.out.println("Your order contents is "+BasketQuantityvalue);
	Screenshots.captureScreenshot();
	
	if(BasketQuantityvalue.contains("Quantity: 4"))
	{
		System.out.println(
				"Values are correct , Basket quantity = " + BasketQuantityvalue + "Device added value = 4");

	}
	else
	{
		System.out.println("Not Working fine");
		Assert.fail("Quantity Values are not correct");
	}
	
}

public static void QuantityValidationsReviewPage_Grouped() {
	
}


public static void NavigatebackFromDelivery() 
{
	
	//Please include relevant steps after june release
	driver.findElement(By.xpath("//*[@title='Exit checkout']")).click();
	System.out.println("Clicked on the exit checkout");
}

public static void ChangeQuantity() throws InterruptedException {
	// TODO Auto-generated method stub
	
	WebElement element2 = driver
			.findElement(By.id("accessory-quantity"));
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].setAttribute('style', 'display:block;')", element2);
	new Select(element2).selectByValue("2");
	Thread.sleep(4000);
		
}

public static void updatedQuantityValidationsDelivery() throws IOException, InterruptedException {
	// TODO Auto-generated method stub
	WebElement BasketQuantity = driver.findElement(By.className("basket-nonconnected"));
	String BasketQuantityvalue = BasketQuantity.getText();
	System.out.println("Your order contents is "+BasketQuantityvalue);
	Screenshots.captureScreenshot();
	
	if(BasketQuantityvalue.contains("Quantity: 2"))
	{
		System.out.println(
				"Values are correct , Basket quantity = " + BasketQuantityvalue + "Device added value = 2");

	}
	else
	{
		System.out.println("Not Working fine");
		Assert.fail("Quantity Values are not correct");
	}
	
	
}
}


