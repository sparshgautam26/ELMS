package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddAdministratorSection {
	
	WebDriver ldriver;

    public AddAdministratorSection(WebDriver rdriver){
	ldriver = rdriver;
	PageFactory.initElements(rdriver, this);                         //till here created constructor
	
}
    
    @FindBy(name="fullname")
    WebElement flname;
    
    @FindBy(name="email")
    WebElement eml;
    
    @FindBy(name="username")
    WebElement uname;
    
    @FindBy(name="password")
    WebElement pwd;
    
    @FindBy(name="confirmpassword")
    WebElement cpwd;
    
    @FindBy(name="add")
    WebElement button;
    
    public void setFullName(String uname )                  
    {
	flname.sendKeys(uname);
    }
    
    public void setemail(String uname )                 
    {
	eml.sendKeys(uname);
    }
    
    public void setusername(String ename )                 
    {
	uname.sendKeys(ename);
    }
    
    public void setpassword(String password )                 
    {
	pwd.sendKeys(password);
    }
    
    public void setConfirmPassword(String password )                 
    {
	cpwd.sendKeys(password);
    }
    
    public void clickButton()
    {
	button.click();
}
	
	
    
    
    
    

}

