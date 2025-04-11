package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Maven.Employee.employeesection_java;
import Maven.Employee.loginpage_java;
import Maven.Employee.logovarify;

public class base_java {


	public static void main(String[] args) {
		
	WebDriver driver;
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://project2.qualibytes.com/admin");
	
	loginpage_java a = new loginpage_java(driver);
	a.username();
	a.password();
	a.loginbutton();
	
	logovarify  b = new logovarify(driver);
	b.logo();
	
	employeesection_java c = new employeesection_java(driver);
	
	c.employeeclick();
	c.addemp();
	c.empid();
	c.firstname();
	c.lastname();
	c.email();
	c.selectbutton();
	
	}
}


