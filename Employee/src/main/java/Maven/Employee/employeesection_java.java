package Maven.Employee;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class employeesection_java {

	@FindBy(xpath="//*[@id=\"menu\"]/li[2]/a/span")
	private WebElement employeeclick;
	
	@FindBy(xpath="/html/body/div/div[2]/div[3]/div/div/div/div/div/center/a")
	private WebElement addemployee;
	
	@FindBy(id="empcode")
	private WebElement empid;
	
	@FindBy(id="example-text-input")
	private WebElement Firstname;
	
	@FindBy(name="lastName")
	private WebElement lastname;
	
	@FindBy(name="email")
	private WebElement email;
	
	@FindBy(name="department")
	private WebElement dropdowndep;
	
	
	
	WebDriver driver;
	public employeesection_java(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void employeeclick() {
		employeeclick.click();
	}
	public void addemp() {
		addemployee.click();
	}
	public void empid() {
		empid.sendKeys("7847826");
	}
	public void firstname() {
		Firstname.sendKeys("dkjgf,jsh");
	}
	public void lastname() {
		lastname.sendKeys("jkhegifugwh");
	}
	public void email(){
		email.sendKeys("mbdchfidsuhgf@Yahoo.com");
	}
	public void selectbutton() {
		dropdowndep.click();
		
		Select select = new Select(dropdowndep);
		select.selectByIndex(8);
		
		 WebElement selectedOption = select.getOptions().get(8);
		 selectedOption.click();
		
		List<WebElement> options = select.getOptions();
		
		List<String> optionText = new ArrayList<>();
		
		for(WebElement option : options) {
			optionText.add(option.getText());
			
			
		}
		System.out.println("Dropdown option "+optionText);
		
		
		
	}
}
