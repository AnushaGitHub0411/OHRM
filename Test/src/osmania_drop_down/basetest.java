package osmania_drop_down;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basetest
	{

	WebDriver driver;
	String applicationUrlAddress="https://www.timeanddate.com/worldclock/";

	public void OsmaniaapplicationLaunch()
	{

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\T Anusha\\Desktop\\SeleniumTest\\Test\\driverFiles\\chromedriver.exe");
	//WebDriver driver = new ChromeDriver();
	ChromeDriver driver = new ChromeDriver();

	//ChromeDriver chromeDriver = new ChromeDriver();
	driver.get(applicationUrlAddress);

	driver.manage().window().maximize();

	//Thread.sleep(10000);



	}


	public void applicationClose()
	{
	driver.close();
	}
	public static void main(String args[])
	{
		basetest base=new basetest();
		base.OsmaniaapplicationLaunch();
		base.applicationClose();
		
	}

	}
