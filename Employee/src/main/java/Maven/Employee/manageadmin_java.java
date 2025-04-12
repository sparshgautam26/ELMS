package Maven.Employee;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class manageadmin_java {

	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/a")
	private WebElement mangeclick;
	
	@FindBy(xpath="/html/body/div/div[2]/div[3]/div/div/div/div/div/center/a")
	private WebElement addamin;
	
	@FindBy(name="fullname")
	private WebElement fullName;
	
	@FindBy(name="email")
	private WebElement email;
	
	@FindBy(name="username")
	private WebElement userName;
	
	@FindBy(name="password")
	private WebElement pass;
	
	@FindBy(name="confirmpassword")
	private WebElement cpass;
	
	@FindBy(id="update")
	private WebElement proced;
	
	@FindBy(xpath="/html/body/div/div[2]/div[3]/div/div/div/div/div[1]")
	private WebElement varify;
	WebDriver driver;
	public manageadmin_java(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void mangclick() {
		mangeclick.click();
	}
	public void Admin() {
		addamin.click();
	}
	public void fullname() {
		fullName.sendKeys("reibndsfb");
	}
	public void email() {
		email.sendKeys("hdfsgdfwgfihef@gmail.com");
	}
	public void username() {
		userName.sendKeys("jaksoxs");
	}
	public void password() {
		pass.sendKeys("akhdsdajk");
	}
	public void cmp() {
		cpass.sendKeys("akhdsdajk");
	}
	public void sumit() {
		proced.click();
	}
	public void varifyuser() {
		String message = varify.getText();
		System.out.println(message);
	}
}
