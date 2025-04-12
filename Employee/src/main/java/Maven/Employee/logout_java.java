package Maven.Employee;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logout_java {

	@FindBy(xpath="/html/body/div/div[2]/div[2]/div/div[2]/div/h4")
	private WebElement adminclick;
	
	@FindBy(xpath="/html/body/div/div[2]/div[2]/div/div[2]/div/div/a")
	private WebElement logout;
	
	WebDriver driver;
	public logout_java(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void adminclick() {
		adminclick.click();
	}
	public void logout() {
		logout.click();
	}
	
}
