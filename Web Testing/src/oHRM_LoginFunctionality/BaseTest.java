package oHRM_LoginFunctionality;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	WebDriver driver;
	String AppilicationURLAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	
	@BeforeTest
	public void appilicationLaunch()
	{
		System.setProperty("webdriver.chrome.driver","./driverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(AppilicationURLAddress);
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

	

	}
//	@AfterTest
//	public void appilicationClose()
//	{
//		driver.close();
//	}

}
