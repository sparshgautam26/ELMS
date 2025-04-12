package TestCases;

import org.testng.annotations.Test;

import PageObject.LoginPageObject;

public class TC_Login extends BaseClass{                       //extend baseclass   //to call method create tc_login class
	
	@Test
	public void loginAdmin()                     //created method loginadmin
	{
		LoginPageObject pg = new LoginPageObject(driver);               //using loginadmin method declare an object
		pg.setUsername(username);                            //in realtime project pass the value ie in username like admin //using this object simply call every method
		pg.setPassword(password);
		pg.setClick();
		
	}
}
	
	
	//to read hardcoded value create readconfig class
	
	

