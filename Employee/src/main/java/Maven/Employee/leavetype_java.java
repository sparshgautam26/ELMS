package Maven.Employee;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class leavetype_java {

	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/a/span")
	private WebElement leave;
	
	@FindBy(xpath="/html/body/div/div[2]/div[3]/div/div/div/div/div/center/a")
	private WebElement leavedept;
	
	@FindBy(name="leavetype")
	private WebElement leavety;
	
	@FindBy(name="description")
	private WebElement desc;
	
	@FindBy(name = "add")	
	private WebElement addl;
	
	@FindBy(xpath ="/html/body/div/div[2]/div[3]/div/div/div/div")
	private WebElement varifyleave;
	
	WebDriver driver;
	public leavetype_java(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void leaveclick(){
		leave.click();
	}
	public void leavedept() {
		leavedept.click();
	}
	public void leavetype() {
		leavety.sendKeys("Causual");
	}
	public void description() {
		desc.sendKeys("XYZ");
	}
	public void add(){
		addl.click();
	}
	public void varifyleave() {
		String message = varifyleave.getText();
		System.out.println(message);
	}
}
