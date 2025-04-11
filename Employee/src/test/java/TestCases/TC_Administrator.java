package TestCases;

import org.testng.annotations.Test;

import PageObject.AddAdministratorSection;
import PageObject.DashboardMA;
import PageObject.LoginPageObject;

public class TC_Administrator extends BaseClass {
	
	@Test
	public void AddAdministrator()                                 //create method ie addemp
	{
		LoginPageObject pg = new LoginPageObject(driver);         //create an object for login and pass driver
		pg.setUsername(username);
		pg.setPassword(password);
		pg.setClick();
		
		DashboardMA ds = new DashboardMA(driver);            //to perform dashboard create an object for that
		ds.clickAdministratorSection();
		ds.clickAddAdministrator();
		
		AddAdministratorSection ad= new AddAdministratorSection(driver);             // to send data in all field so create object for everyone
		ad.setFullName("Pranav Kumar Mallick");
		ad.setemail("pkm70230@gmail.com");
		ad.setusername("Pk33316");
		ad.setpassword("Pkm@123");
		ad.setConfirmPassword("Pkm@123");
		ad.clickButton();
	}

	
	

	
}
