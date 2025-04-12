package TestCases;

import org.testng.annotations.Test;

import PageObject.DashboardMA;
import PageObject.LoginPageObject;

public class TC_DashboardMA extends BaseClass {
	
	@Test
	public void AddAdministrator()                   //create method ie addemployee
	{
		LoginPageObject ls = new LoginPageObject(driver);          //created an object
		ls.setUsername(username);                  //call setusername and pass variable ie username
		ls.setPassword(password);
		ls.setClick();
		
		/*DashboardMA ds = new DashboardMA(driver);           //created an object for particular section
		ds.clickAdministratorSection();             // call method for employee section 
		ds.clickAddAdministrator(); 
		*/                                             //call method for addemployee
		
		
		DashboardMA ds = new DashboardMA(driver);         //for dynamic table
		ds.findAdministratorNameAndClick("Pranav Kumar Mallick");             //call method findnameandclick and pass string value ie arun
  
	}

}

	
	

