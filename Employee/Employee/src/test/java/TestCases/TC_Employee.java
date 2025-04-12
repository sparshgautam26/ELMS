package TestCases;

import org.testng.annotations.Test;

import PageObject.AddEmployeeSection;
import PageObject.Dashboard;
import PageObject.LoginPageObject;

public class TC_Employee extends BaseClass {
	
	@Test
	public void AddEmployee()                               //create method ie addemp
	{
		LoginPageObject pg = new LoginPageObject(driver);         //create an object for login and pass driver
		pg.setUsername(username);
		pg.setPassword(password);
		pg.setClick();
		
		Dashboard ds = new Dashboard(driver);            //to perform dashboard create an object for that
		ds.clickEmployeeSection();
		ds.clickAddEmployee();
		
		AddEmployeeSection ad= new AddEmployeeSection(driver);             // to send data in all field so create object for everyone
		ad.setEmployeeId("ART1012");
		ad.setFirstName("Prince");
		ad.setLastName("Sharma");
		ad.setEmailAddress("amankumaralld02@gmail.com");
		ad.setDepartment("Marketing");
		ad.setGender("Male");
		ad.setDateofBirth("10", "12", "1995");
		ad.setContact("9140646057");
		ad.setCountry("India");
		ad.setAddress("Delhi");
		ad.setCity("Dwarka");
		ad.setPassword("Yadv@31234");
		ad.confirmPassword("Yadv@31234");
		ad.clickButton();
	}

}

