package tesng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Maven.Employee.loginpage_java;
import Maven.Employee.logovarify;

public class varifyuser {

	WebDriver driver;
	loginpage_java a;
	logovarify b;
	
	@Test
	public void varify() {
		System.out.println("Logo varify");
		b.logo();
	}
	@BeforeClass
	public void login() {
		System.out.println("Login browser");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.get("https://project2.qualibytes.com/admin");
	    
	    a = new loginpage_java(driver);
	    b = new logovarify(driver);
	}
	@BeforeMethod
	public void adminpage() {
	System.out.println("Loging page");
	a.username();
	a.password();
	a.loginbutton();
	}
	@AfterMethod
	public void closepage() {
		System.out.println("Close browser ");
		
		driver.close();
		
	}
	@AfterClass
	public void closebrowser() {
		System.out.println("Close Browser");
		driver.quit();
	}
	
}
