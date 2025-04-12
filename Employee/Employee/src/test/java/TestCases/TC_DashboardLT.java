package TestCases;

import org.testng.annotations.Test;

import PageObject.DashboardLT;
import PageObject.LoginPageObject;

public class TC_DashboardLT extends BaseClass {
	
	@Test
	public void AddLeaveType()                   //create method ie addemployee
	{
		LoginPageObject ls = new LoginPageObject(driver);          //created an object
		ls.setUsername(username);                  //call setusername and pass variable ie username
		ls.setPassword(password);
		ls.setClick();
		
		/*DashboardLT ds = new DashboardDE(driver);           //created an object for particular section
		ds.clickLeavetypesSection();             // call method for employee section 
		ds.clickAddLeavetype(); 
		*/                                             //call method for addemployee
		
		
		DashboardLT ds = new DashboardLT(driver);         //for dynamic table
		ds.findLeaveTypeAndClick("Weather Leave");             //call method findnameandclick and pass string value ie arun
  
	}

}

