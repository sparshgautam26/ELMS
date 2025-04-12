package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddEmployeeSection {
	
WebDriver ldriver;

    public AddEmployeeSection(WebDriver rdriver){
	ldriver = rdriver;
	PageFactory.initElements(rdriver, this);                         //till here created constructor
	
}
    @FindBy(name="empcode")                                  //locate empid section under addemployee section
    WebElement eid;

    @FindBy(name="firstName")                             //similarly locate every section
    WebElement fstname;

    @FindBy(name="lastName")
    WebElement lstname;

    @FindBy(name="email")
    WebElement eml;

    @FindBy(name="department")
    WebElement dept;

    @FindBy(name="gender")
    WebElement type;

    @FindBy(name="dob")
    WebElement date;

    @FindBy(name="mobileno")
    WebElement no;


    @FindBy(name="country")
    WebElement cnt;

    @FindBy(name="address")
    WebElement addr;
    
    @FindBy(name="city")
    WebElement cty;
    
    @FindBy(name="password")
    WebElement pwd;
    
    @FindBy(name="confirmpassword")
    WebElement cnfpwd;
    
    @FindBy(id="update")
    WebElement button;
    
    public void setEmployeeId(String id)                 //create method for empid and pass parameter ie string 
    {
	eid.clear();                          //if we have already id on that application then to clear that id use clear
	eid.sendKeys(id);                     //using that variable pass sendkeys method and pass that id 
}
    public void setFirstName(String uname)                      //for 1st name 
    {
	fstname.sendKeys(uname);                     //same
}
    
    public void setLastName(String lname)            //similary for all
    {
	lstname.sendKeys(lname);
}
    
    public void setEmailAddress(String mail)
    {
	eml.sendKeys(mail);
}
    
    public void setDepartment(String dep)                  //since there is dropdown under department
    {
	Select sc = new Select(dept);               //so use select class and pass that parameter 
	sc.selectByVisibleText(dep);
}
    
    public void setGender(String gen)
    {
	Select sc1 = new Select(type);
	sc1.selectByVisibleText(gen);
		
}
    
    public void setDateofBirth(String dd,String mm,String yyyy)      
    {
	date.sendKeys(dd);                                 //when call method then pass 3parameter
	date.sendKeys(mm);
	date.sendKeys(yyyy);
}
    
    public void setContact(String number)
    {                                                 
	no.sendKeys(number);                             //to send data ie no
}
    
    public void setCountry(String country)
    {
	cnt.sendKeys(country);
}
    
    public void setAddress(String address)
    {
	addr.sendKeys(address);
}
    
    public void setCity(String city)
    {
	cty.sendKeys(city);
}
    
    public void setPassword(String password)
    {
	pwd.sendKeys(password);
}
    
    public void confirmPassword(String passwrd)
    {
	cnfpwd.sendKeys(passwrd);
}
    
    public void clickButton()
    {
	button.click();
}
}

