package TestCases;

import org.testng.annotations.Test;

import PageObject.AddDepartmentSection;
import PageObject.DashboardDE;
import PageObject.LoginPageObject;

public class TC_Department extends BaseClass{
	
	@Test
	public void AddDepartment()                                 //create method ie addemp
	{
		LoginPageObject pg = new LoginPageObject(driver);         //create an object for login and pass driver
		pg.setUsername(username);
		pg.setPassword(password);
		pg.setClick();
		
		DashboardDE ds = new DashboardDE(driver);            //to perform dashboard create an object for that
		ds.clickDepartmentSection();
		ds.clickAddDepartment();
		
		AddDepartmentSection ad= new AddDepartmentSection(driver);             // to send data in all field so create object for everyone
		ad.setDepartmentName("Software Engineer");
		ad.setShortFormName("SE");
		ad.setDeptCode("SE121");
		ad.clickButton();
	}

	
	

}
