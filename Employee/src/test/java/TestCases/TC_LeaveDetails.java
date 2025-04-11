package TestCases;

import org.testng.annotations.Test;

import PageObject.Dashboard;
import PageObject.LeaveDetails;
import PageObject.LoginPageObject;

public class TC_LeaveDetails extends BaseClass{
	
	@Test
	public void setLeaveDetails() throws InterruptedException          //call setleavedetails method
	{

		LoginPageObject ls = new LoginPageObject(driver);         //to perform loginpageobject
		ls.setUsername(username);
		ls.setPassword(password);
		ls.setClick();
		
		Dashboard ds = new Dashboard(driver);
		ds.findNameAndClick("Pranav Kumar");             //this method will inspect all row and check that fullname
		
		LeaveDetails ld= new LeaveDetails(driver);
		ld.setAction();
		Thread.sleep(3000);
		ld.setStatus("Approve");
		Thread.sleep(3000);
		ld.setDescription("Approve Leave");
		ld.setApply();
		
		
		
	}

}

