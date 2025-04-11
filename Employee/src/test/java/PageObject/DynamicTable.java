package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicTable {
	
WebDriver ldriver;
	
	public DynamicTable(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}

	@FindBy(xpath = "//ul[@class='pagination']//li//a")          //xpath of pagination under testautomationblogspot.com website
	List<WebElement> pagination;
	
	@FindBy(xpath="//table[@id='productTable']//tr")              //xpath for table rows under pagination 
	List<WebElement> tablerows;
	
	public void findNameAndclick(String ename)               //create method //to call method pass parameter ie name
	{
		boolean nameFound=false;                              //to access all rows and page write logic //create variable namefound and set to false
		
		for(int pageIndex=1;pageIndex<=pagination.size();pageIndex++)       //created outer for loop to move one page to another page
		{
			for(int i=1;i<tablerows.size();i++)                 //using this loop  access table rows
			{
				WebElement fullname =tablerows.get(i-1).findElement(By.xpath("//table[@id='productTable']//tr["+i+"]//td[2]"));       // 
				String name = fullname.getText();                //text sotre in variable
				
				if(name.equalsIgnoreCase(ename))              //undertable name if small letter or capital letter not effect it capture text under that row to compare 2strings create method ie equalignorecase
				{
					System.out.println("Name Found");
					
					WebElement button = tablerows.get(i-1).findElement(By.xpath("//table[@id='productTable']//tr["+i+"]//td[4]//input"));
					
					button.click();
					
					
					nameFound=true;
					
					break;
				}
				
				
			}
			
			if(nameFound==true)
			{
				break;
			}
			
			if(pageIndex<pagination.size())
			{
				WebElement page=pagination.get(pageIndex);
				page.click();
			}
		}
		
		if(nameFound==false)
		{
			System.out.println("Element not found");
		}
	}
	

}


