package Maven.Employee;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class manageleave_leave {

	@FindBy(xpath="//*[@id=\"menu\"]/li[5]/a")
	private WebElement manageclick;
	
	
	@FindBy(xpath="//*[@id=\"menu\"]/li[5]/ul/li[1]/a")
	private WebElement pendingclick;
	
	@FindBy(xpath="//*[@id=\"menu\"]/li[5]/ul/li[2]/a")
	private WebElement Approved;
	
	@FindBy(xpath="//*[@id=\"menu\"]/li[5]/ul/li[3]/a")
	private WebElement decline;
	
	@FindBy(xpath="//*[@id=\"menu\"]/li[5]/ul/li[4]/a")
	private WebElement leavehistory;
	
	WebDriver driver;
	public manageleave_leave(WebDriver driver) {
		this.driver=driver;
PageFactory.initElements(driver, this);
	}
	
	public void manageclick() {
		manageclick.click();
	}
	public void pending() {
		pendingclick.click();
	}
	public void approvedclick() {
		Approved.click();
	}
	public void declineclick() {
		decline.click();
	}
	public void history() {
		leavehistory.click();
	}
}
