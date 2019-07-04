package GlobalActions;


import java.io.IOException;

//Change the variable name like "Ele" , rest all remains the same
//Arraylist is not used, if not required, feel free to remove it

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
1. Get all the product names in an array(Array1)
2. Apply sort
3. Apply sort on the web application
4. Again get all the names in a different array (Array2)
5. Compare the 2 arrays.
*/

public class SortandCompare {

	public static void main(String[] args) throws IOException, InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\subbaiv1\\regression2\\Browsers\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.o2.co.uk/shop/tariff/apple/iphone-7-plus/?productId=01190b51-c8cc-40cb-a135-53461ac9206f&contractType=paymonthly#tariff");
		driver.manage().window().maximize();



		WebElement select = driver.findElement(By.xpath("//*[@id='dataFilterSelect']"));

		/*==============================================
		
			Below is for sorting featured
		
		==============================================*/


		WebElement ele0=select.findElement(By.xpath("//a[contains(text(),'Featured')]"));
		if (ele0 != null)
		{
			System.out.println("Current dropdown is Featured and the values are as below for data");
			try{
			List<WebElement> outercontainer = driver.findElements(By.xpath("//*[@id='tariff-tile']"));

			  // =====================================
			 //		Below will display the Data available per month
			 //====================================
			List<WebElement> DataContainer = outercontainer.get(0).findElements(By.xpath("//*[@class='col-xs-6 col-sm-3 dmt-container info-container']/ul/li[1]/h2"));


			        for (int i=0; i<=DataContainer.size();i++)
			        {

			        	System.out.println(DataContainer.get(i).getText());
			        	}

		  			}
			catch (IndexOutOfBoundsException e) {

			}
		}

//=============================================================================================================================================
		//Below is for sorting monthly High to Low
//=============================================================================================================================================
		driver.findElement(By.xpath("//*[@id='dataFilterSelectSelectBoxItArrow']")).click();
		WebElement ele1=select.findElement(By.xpath("//a[contains(text(),'Monthly data (High to low)')]"));
			if (ele1 != null)
			{
				System.out.println("For dropdown as Monthly data (High to low), the values are as below");
				try{
					ele1.click();

					List<WebElement> outercontainer11 = driver.findElements(By.xpath("//*[@id='tariff-tile']"));
					  // =====================================
					 //		Below will display the Data available per month
					 //====================================
					List<WebElement> DataContainer11 = outercontainer11.get(0).
							findElements(By.xpath("//*[@class='col-xs-6 col-sm-3 dmt-container info-container']/ul/li[1]/h2"));

					//Defining an arraylist
				    List<String> all_elements_text=new ArrayList<>();


					        for (int i=0; i<=DataContainer11.size();i++)
					        {
					        	//loading text of each element in to array all_elements_text
					            all_elements_text.add(DataContainer11.get(i).getText());

					        	System.out.println(DataContainer11.get(i).getText());
					        	//System.out.println(all_elements_text);
					        }

					}
					catch (IndexOutOfBoundsException e) {
					}
			}


/*=============================================================================================================================================
					Below is for sorting monthly low to high
=============================================================================================================================================*/
					driver.findElement(By.xpath("//*[@id='dataFilterSelectSelectBoxItArrow']")).click();
					WebElement ele2=select.findElement(By.xpath("//a[contains(text(),'Monthly data (Low to High)')]"));
						if (ele2 != null)
						{
							System.out.println("For dropdown as Monthly data (High to low), the values are as below");
							try{
								ele2.click();
								//1. Get all the product names in an array(Array1)
								List<WebElement> outercontainer11 = driver.findElements(By.xpath("//*[@id='tariff-tile']"));
								  // =====================================
								 //		Below will display the Data available per month
								 //====================================
								List<WebElement> DataContainer11 = outercontainer11.get(0).
										findElements(By.xpath("//*[@class='col-xs-6 col-sm-3 dmt-container info-container']/ul/li[1]/h2"));

								//Defining an arraylist
							    List<String> all_elements_text=new ArrayList<>();


								        for (int i=0; i<=DataContainer11.size();i++)
								        {
								        	//loading text of each element in to array all_elements_text
								            all_elements_text.add(DataContainer11.get(i).getText());

								        	System.out.println(DataContainer11.get(i).getText());
								        	//System.out.println(all_elements_text);
								        }

								}
								catch (IndexOutOfBoundsException e) {
								}
						}




/*=============================================================================================================================================
					Below is for sorting monthly cost High to Low
=============================================================================================================================================*/
					driver.findElement(By.xpath("//*[@id='dataFilterSelectSelectBoxItArrow']")).click();
					WebElement ele3=select.findElement(By.xpath("//a[contains(text(),'Monthly cost (High to low)')]"));
						if (ele3 != null)
						{
							System.out.println("For dropdown as Monthly cost (High to low), the values are as below");
							try{
								ele3.click();
								//1. Get all the product names in an array(Array1)
								List<WebElement> outercontainer11 = driver.findElements(By.xpath("//*[@id='tariff-tile']"));
								  // =====================================
								 //		Below will display the Cost available per month
								 //====================================
								List<WebElement> DataContainer11 = outercontainer11.get(0).
										findElements(By.xpath("//*[@class='col-xs-6 monthly']"));

								//Defining an arraylist
							    List<String> all_elements_text=new ArrayList<>();


								        for (int i=0; i<=DataContainer11.size();i++)
								        {
								        	//loading text of each element in to array all_elements_text
								            all_elements_text.add(DataContainer11.get(i).getText());

								        	System.out.println(DataContainer11.get(i).getText());
								        	//System.out.println(all_elements_text);
								        }

								}
								catch (IndexOutOfBoundsException e) {
								}
						}


	/*=============================================================================================================================================
						Below is for sorting monthly cost Low to High

						Change the variable name like "Ele" , rest all remains the same
	=============================================================================================================================================*/
						driver.findElement(By.xpath("//*[@id='dataFilterSelectSelectBoxItArrow']")).click();
						WebElement ele4=select.findElement(By.xpath("//a[contains(text(),'Monthly cost (Low to High)')]"));
							if (ele4 != null)
							{
								System.out.println("For dropdown as Monthly cost (Low to High), the values are as below\b");
								try{
									ele4.click();
									//1. Get all the product names in an array(Array1)
									List<WebElement> outercontainer11 = driver.findElements(By.xpath("//*[@id='tariff-tile']"));
									  // =====================================
									 //		Below will display the Cost available per month
									 //====================================
									List<WebElement> DataContainer11 = outercontainer11.get(0).
											findElements(By.xpath("//*[@class='col-xs-6 monthly']"));

									//Defining an arraylist
								    List<String> all_elements_text=new ArrayList<>();


									        for (int i=0; i<=DataContainer11.size();i++)
									        {
									        	//loading text of each element in to array all_elements_text
									            all_elements_text.add(DataContainer11.get(i).getText());

									        	System.out.println(DataContainer11.get(i).getText());
									        	//System.out.println(all_elements_text);
									        }

									}
									catch (IndexOutOfBoundsException e) {
									}
							}



/*=============================================================================================================================================
							Below is for sorting Upfront cost (High to low)

							Change the variable name like "Ele" , rest all remains the same
=============================================================================================================================================*/
							driver.findElement(By.xpath("//*[@id='dataFilterSelectSelectBoxItArrow']")).click();
							WebElement ele5=select.findElement(By.xpath("//a[contains(text(),'Upfront cost (High to low)')]"));
								if (ele5 != null)
								{
									System.out.println("For dropdown as Upfront cost (Low to High), the values are as below\b");
									try{
										ele5.click();
										//1. Get all the product names in an array(Array1)
										List<WebElement> outercontainer11 = driver.findElements(By.xpath("//*[@id='tariff-tile']"));
										  // =====================================
										 //		Below will display the Cost available per month
										 //====================================
										List<WebElement> DataContainer11 = outercontainer11.get(0).
												findElements(By.xpath("//*[@class='col-xs-6 upfront']"));

										//Defining an arraylist
									    List<String> all_elements_text=new ArrayList<>();


										        for (int i=0; i<=DataContainer11.size();i++)
										        {
										        	//loading text of each element in to array all_elements_text
										            all_elements_text.add(DataContainer11.get(i).getText());

										        	System.out.println(DataContainer11.get(i).getText());
										        	//System.out.println(all_elements_text);
										        }

										}
										catch (IndexOutOfBoundsException e) {
										}
								}

/*=============================================================================================================================================
				Below is for sorting Upfront cost (Low to High)

				Change the variable name like "Ele" , rest all remains the same
	=============================================================================================================================================*/
				driver.findElement(By.xpath("//*[@id='dataFilterSelectSelectBoxItArrow']")).click();
				WebElement ele6=select.findElement(By.xpath("//a[contains(text(),'Upfront cost (Low to high)')]"));
					if (ele6 != null)
					{
						System.out.println("For dropdown as Upfront cost (Low to High), the values are as below\b");
						try{
							ele6.click();
							//1. Get all the product names in an array(Array1)
							List<WebElement> outercontainer11 = driver.findElements(By.xpath("//*[@id='tariff-tile']"));
							  // =====================================
							 //		Below will display the Cost available per month
							 //====================================
							List<WebElement> DataContainer11 = outercontainer11.get(0).
									findElements(By.xpath("//*[@class='col-xs-6 upfront']"));

							//Defining an arraylist
						    List<String> all_elements_text=new ArrayList<>();


							        for (int i=0; i<=DataContainer11.size();i++)
							        {
							        	//loading text of each element in to array all_elements_text
							            all_elements_text.add(DataContainer11.get(i).getText());

							        	System.out.println(DataContainer11.get(i).getText());
							        	//System.out.println(all_elements_text);
							        }

							}
							catch (IndexOutOfBoundsException e) {
							}
					}





	}


}
