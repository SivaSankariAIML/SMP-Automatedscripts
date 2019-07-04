package helpers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Filereadingutility {
	
	public static String getPropertyValue (String filepath,String key)
	{
		String value =null;
				
		File file = new File (filepath);
		FileInputStream fis = null;
		try
		{
			fis = new FileInputStream(file);
			Properties prop = new Properties();
			prop.load(fis);
			value = prop.getProperty(key);
			
		}catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}			
		}
		return value;
		
	}
	
	

}
