package Maven.Employee;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class departnment_java {

	@FindBy(xpath="//*[@id=\"menu\"]/li[3]/a")
	private WebElement dapt;
	
	@FindBy(xpath="/html/body/div/div[2]/div[3]/div/div/div/div/div/center/a")
	private WebElement deptcl;
	
	@FindBy(name="departmentname")
	private WebElement deptName;
	
	@FindBy(name="departmentshortname")
	private WebElement stdepatnmentName;
	
	@FindBy(name="deptcode")
	private WebElement code;
	
	@FindBy(id="add")
	private WebElement addc;
	
	@FindBy(xpath="/html/body/div/div[2]/div[3]/div/div/div/div")
	private WebElement varifydept;
	
	
	WebDriver driver;
	public departnment_java(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void department() {
		dapt.click();
	}
	public void departmentclick() {
		deptcl.click();
	}
	public void depatnmentName() {
		deptName.sendKeys("ASTROLOGY");
	}
	public void ShotDeptnmentName() {
		stdepatnmentName.sendKeys("AST");
	}
	public void deptcode() {
		code.sendKeys("1185");
	}
	public void Add() {
		addc.click();
	}
	public void varifydept() {
		String Message = varifydept.getText();
				System.out.println(Message);
	}
}
