package TestCases;

import org.testng.annotations.Test;

import PageObject.DashboardDE;
import PageObject.LoginPageObject;

public class TC_DashboardDE extends BaseClass {
	
	@Test
	public void AddDepartment()                   //create method ie addemployee
	{
		LoginPageObject ls = new LoginPageObject(driver);          //created an object
		ls.setUsername(username);                  //call setusername and pass variable ie username
		ls.setPassword(password);
		ls.setClick();
		
		/*DashboardDE ds = new DashboardDE(driver);           //created an object for particular section
		ds.clickDepartmentSection();             // call method for employee section 
		ds.clickAddDepartment(); 
		*/                                             //call method for addemployee
		
		
		DashboardDE ds = new DashboardDE(driver);         //for dynamic table
		ds.findDepartmentNameAndClick("Software Engineer");             //call method findnameandclick and pass string value ie arun
  
	}

}
