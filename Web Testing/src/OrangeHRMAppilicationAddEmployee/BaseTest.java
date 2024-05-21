package OrangeHRMAppilicationAddEmployee;

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
		}
		
			
			@AfterTest
	  public void appilicationClose()
		{
			driver.close();

}
}
