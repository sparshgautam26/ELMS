package Maven.Employee;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage_java {

	
	//Encapsulation
	@FindBy(id="exampleInputEmail1")
	private WebElement uid;
	
	@FindBy(id="exampleInputPassword1")
	private WebElement upd;
	
	@FindBy(id="form_submit")
	private WebElement submit;
	
	WebDriver driver;
	public loginpage_java(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void username() {
		uid.sendKeys("admin ");
	}
	public void password() {
		upd.sendKeys("Password@123");
	}
	public void loginbutton() {
		submit.click();
	}
	
	
}
