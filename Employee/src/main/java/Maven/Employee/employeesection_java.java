package Maven.Employee;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

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
	
	@FindBy(name="gender")
	private WebElement Gender;
	
	@FindBy(id="birthdate")
	private WebElement Dateofbirth;
	
	@FindBy(name="mobileno")
	private WebElement contactnumber;
	
	@FindBy(name="country")
	private WebElement cc;
	
	@FindBy(name="address")
	private WebElement add;
	
	@FindBy(name="city")
	private WebElement city;
	
	@FindBy(name="password")
	private WebElement pw;
	
	@FindBy(name="confirmpassword")
	private WebElement cpwd;
	
	@FindBy(id="update")
	private WebElement proceed;
	
	@FindBy(xpath="/html/body/div/div[2]/div[3]/div/div/div/div/div[1]")
	private WebElement uservarify;
	
	
	
	
	
	
	
	
	
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
	
	public void Gender() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0, 500);");
		
		
		Select gg = new Select(Gender);
		gg.selectByValue("Male");
		List<WebElement> options = gg.getOptions();
		List<String> optionlist = new ArrayList<>();
		for(WebElement option: options) {
			optionlist.add(option.getText());
		}
		System.out.println("Gender list "+optionlist);
	}
	
	public void dateofbirth() {
		
		 Dateofbirth.sendKeys("26-07-2000");
		
					        }
	
	public void contractnumber() {
		contactnumber.click();
		contactnumber.sendKeys("47328749237492379");
	}
	
	public void country() {
		cc.sendKeys("North Koria");
	}
	
	public void address() {
		add.sendKeys("North koriya");
	}
	public void city() {
		city.sendKeys("asdjahsgdfkjh");
	}
	public void password() {
		pw.sendKeys("Sparsh@123");
	}
	public void confirmpassword() {
		cpwd.sendKeys("Sparsh@123");
	
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 File destination = new File("Downloads.png");

			        try {
			            // Copy the screenshot to the specified location
			            FileUtils.copyFile(screenshot, destination);
			            System.out.println("Screenshot saved at: " + destination.getAbsolutePath());
			        } catch (IOException e) {
			            e.printStackTrace();

	
		
			        }
		
	}
	public void proceed() {
		proceed.click();
	}
	public void uservarify() {
		String meassge = uservarify.getText();
		System.out.println(meassge);
	}
			
}
