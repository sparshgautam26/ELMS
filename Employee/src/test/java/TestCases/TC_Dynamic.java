package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import PageObject.DynamicTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_Dynamic {
	
	@Test
	public void checkName()
	{
	
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);   // launch the browser0
				
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		DynamicTable dc = new DynamicTable(driver);
		
		dc.findNameAndclick("Soundbar");          //to check rows name under pagination 
		
		
		
	}

}


