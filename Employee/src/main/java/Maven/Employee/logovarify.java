package Maven.Employee;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logovarify {
	
	
	@FindBy(xpath="/html/body/div/div[1]/div[1]/div/a/img")
	private WebElement logo;
	
	WebDriver driver;
	public logovarify(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void logo() {
		
		boolean result = logo.isDisplayed();
		if(result=logo.isDisplayed()) {
			System.out.println("The logo is displayed "+result);
		}else {
			System.out.println("the logo is not displayed ");
		}
		
		
	}
	

}
