package com.RadioButtonsTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	WebDriver driver;
	String applicationUrlAddress="https://echoecho.com/htmlforms10.htm";

	public void applicationLauch()
	{

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\T Anusha\\Desktop\\SeleniumTest\\Test\\driverFiles\\chromedriver.exe");
	//WebDriver driver = new ChromeDriver();
	driver = new ChromeDriver();

	driver.get(applicationUrlAddress);

	driver.manage().window().maximize();

	//Thread.sleep(10000);

	}

	public void applicationClose()
	{
	driver.close();
	}
	//public static void main(String args[]){
	//	BaseTest base=new BaseTest();
		//base.applicationLauch();
		//base.applicationClose();
		
		
		
	}

	}


