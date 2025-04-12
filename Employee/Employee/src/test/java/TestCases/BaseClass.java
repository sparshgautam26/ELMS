package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ReadConfig;

public class BaseClass {             //in base class we create 2 methods ie setup(to open browse) & teardown(to close browser) method

	static WebDriver driver;             //for setup method 
	
	ReadConfig config = new ReadConfig();  //declare an object of readconfig1 class and called method gtappurl which return string value ieurl and store that variable ieurl
	String Url = config.getApplicationUrl();
	String username = config.getUserName();         // samething for username
	String password = config.getPassword();
	
	
	@BeforeClass
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
	    
       	ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(Url);
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
		
		
	}
}
