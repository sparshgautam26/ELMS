package TestCases;

import org.testng.annotations.Test;

import PageObject.Dashboard;
import PageObject.LoginPageObject;

public class TC_Dashboard extends BaseClass {
	
	@Test
	public void AddEmployees()                   //create method ie addemployee
	{
		LoginPageObject ls = new LoginPageObject(driver);          //created an object
		ls.setUsername(username);                  //call setusername and pass variable ie username
		ls.setPassword(password);
		ls.setClick();
		
		/*Dashboard ds = new Dashboard(driver);           //created an object for particular section
		ds.clickEmployeeSection();             // call method for employee section 
		ds.clickAddEmployee(); 
		*/                                             //call method for addemployee
		
		
		Dashboard ds = new Dashboard(driver);         //for dynamic table
		ds.findNameAndClick("Arun Kumar");             //call method findnameandclick and pass string value ie arun
  
	}

}

	
	

