package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddLeaveTypesSection {
	
	WebDriver ldriver;

    public AddLeaveTypesSection(WebDriver rdriver){
	ldriver = rdriver;
	PageFactory.initElements(rdriver, this);   

}
    
    @FindBy(name="leavetype")
    WebElement leavetype;
    
    @FindBy(name="description")
    WebElement sd;
    
    @FindBy(name="add")
    WebElement button;
    
    public void setLeaveTypes(String uname )                  
    {
	leavetype.sendKeys(uname);
    }
    
    public void setShortDescription(String uname )                 
    {
	sd.sendKeys(uname);
    }
    
    public void clickButton()
    {
	button.click();
}

    
    

}
