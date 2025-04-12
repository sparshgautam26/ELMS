package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {                 //in this first declare an object name properties and select its path
	
	Properties pro; 
	
	String path = "C:\\Users\\hp\\Downloads\\Selenium2\\Employee\\Configuration\\Config.properties";
	
	public ReadConfig()                        //create constructor and initialize it
	{
		pro = new Properties();               //initialize it
		
		try {
			FileInputStream fis = new FileInputStream(path);
			pro.load(fis);                                           //to load that particular file
		}
		catch (Exception e)                    //follow exception and name ie e 
		{
			System.out.println("Exception"+e.getMessage());          //print that exception
		}
	}
	
	public String getApplicationUrl()
	{
		String Url = pro.getProperty("baseUrl");
		return Url;
	}
	
	public String getUserName()
	{
		String userName = pro.getProperty("username");
				
	    return userName;
	}
	
	public String getPassword()
	{
		String password = pro.getProperty("password");
		
		return password;
	}
}
