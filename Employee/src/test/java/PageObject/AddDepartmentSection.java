package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddDepartmentSection {
	
	WebDriver ldriver;

    public AddDepartmentSection(WebDriver rdriver){
	ldriver = rdriver;
	PageFactory.initElements(rdriver, this);                         //till here created constructor
	
}
    
    @FindBy(name="departmentname")
    WebElement deptname;
    
    @FindBy(name="departmentshortname")
    WebElement sfname;
    
    @FindBy(name="deptcode")
    WebElement codeid;
    
    @FindBy(name="add")
    WebElement button;
    
    public void setDepartmentName(String uname )                  
    {
	deptname.sendKeys(uname);
    }
    
    public void setShortFormName(String uname )                 
    {
	sfname.sendKeys(uname);
    }
    
    public void setDeptCode(String id )                 
    {
	codeid.sendKeys(id);
    }
    
    public void clickButton()
    {
	button.click();
}
	
	
    
    
    
    

}
