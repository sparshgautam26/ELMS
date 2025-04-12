package TestCases;

import org.testng.annotations.Test;

import PageObject.AddLeaveTypesSection;
import PageObject.DashboardLT;
import PageObject.LoginPageObject;

public class TC_LeaveTypes extends BaseClass {
	

	@Test
	public void AddLeaveTypes()                               //create method ie addemp
	{
		
		LoginPageObject pg = new LoginPageObject(driver);         //create an object for login and pass driver
		pg.setUsername(username);
		pg.setPassword(password);
		pg.setClick();
		
		DashboardLT ds = new DashboardLT(driver);            //to perform dashboard create an object for that
		ds.clickLeaveTypesSection();
		ds.clickAddLeaveTypes();
		
		AddLeaveTypesSection ad= new AddLeaveTypesSection(driver);             // to send data in all field so create object for everyone
		ad.setLeaveTypes("Weather Leave");
		ad.setShortDescription("WL");
		ad.clickButton();
	}

	
	

}


