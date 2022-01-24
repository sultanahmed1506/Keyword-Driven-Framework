package keyworddrivenfwk.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	protected WebDriver driver;
	@Parameters({"browserType"})
	@BeforeClass
	public void invokeBrowser(String browserType)
	{		 		
		if(browserType.equals("FF"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();  
		}
		else if(browserType.equals("IE"))
		{
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver(); 

		}
		else if (browserType.equals("CH"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(); 
		}

	}
		
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}



}
