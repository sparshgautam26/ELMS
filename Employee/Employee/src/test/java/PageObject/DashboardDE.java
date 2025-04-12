package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardDE {
	
    WebDriver ldriver;
	
	public DashboardDE(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);                //till here setup part
		
	}
	

	@FindBy(xpath="//*[@id=\"menu\"]/li[3]/a/span")               //xpath of employee section
	WebElement dep;                                           //return value ie webelement and store in variable ie emp

	@FindBy(xpath ="/html/body/div/div[2]/div[3]/div/div/div/div/div/center/a")        //xpath of addnewemployee under employee section
	WebElement  Adddep;                                                  //return value ie webelement and store in variable ie addemp
	
	
	
	@FindBy(xpath="//table[@class='table table-hover table-bordered table-striped progress-table text-center']//tbody//tr")
	List<WebElement> tablerows;                             //xpath for dynamic table under dashboard section

	
	public void clickDepartmentSection()                           //to perform click operation create method 
	{
		dep.click();                                          
	}
	
	public void clickAddDepartment()
	{
		Adddep.click();
	}
	
	
	
	// Access through each row and find the full name from column;                   //for dynamic table 
	
	public void findDepartmentNameAndClick(String nameFind)               //create particular method and pass an argument ie string
	
	{
		
	for(int i=1;i<=tablerows.size();i++)
		
	{
		WebElement departmentname = tablerows.get(i-1).findElement(By.xpath("//table[@class='table table-hover table-bordered table-striped progress-table text-center']//tbody//tr["+i+"]//td[3]//a"));
		String name= departmentname.getText();                    //call method ie tablerows.get and pass xpath 
		
		if(name.equalsIgnoreCase(nameFind))
		{
			System.out.println("Name Found");
			WebElement button =tablerows.get(i-1).findElement(By.xpath("//table[@class='table table-hover table-bordered table-striped progress-table text-center']//tbody//tr["+i+"]//td[5]"));
			button.click();
			break; 
		}
		
	}
	}
}

