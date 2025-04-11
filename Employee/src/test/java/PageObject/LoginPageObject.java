package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {
	
	WebDriver ldriver;               //initialize local driver
	
	public LoginPageObject(WebDriver rdriver)          //created constructor
	{
		ldriver = rdriver;           //initialize ldriver value to rdriver
		PageFactory.initElements(rdriver, this);          //setup part completed
	}
	
	// now which element we have to perform operations first locate that webelement and to perform operation create method and to call that method create testclass
	
	@FindBy(name="username")
	WebElement userName;       //return webelement and store in variable
	
	@FindBy(name="password")   
	WebElement password;           //same in this
	
	@FindBy(id="form_submit")    // for signin element located
	WebElement button;
	
	// now create method for these 3elements
	
	public void setUsername(String ename)      //create customethod name(setusername) underthis method setusernamevalue that will be string and pass argumentename
	{
		userName.sendKeys(ename);          //using that variable use sendkeys method to send data ie which arguments passed that oneonly send
	}
	
	public void setPassword(String pwd)      //create customethod name(password) underthis method setpasswordvalue that will be string and pass argumentename
	{
		password.sendKeys(pwd);          //using that variable use sendkeys method to send data not need argument
	}
	
	public void setClick()     
	{
		button.click();       
	}
	
}
	
		
		
	
	
	
	
	
	
		

