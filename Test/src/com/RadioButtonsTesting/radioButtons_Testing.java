package com.RadioButtonsTesting;


	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class radioButtons_Testing {

	
		public static void main(String args[]) throws InterruptedException {
			
		System.setProperty("webdriver.chrome.driver","C:\\Users\\T Anusha\\Downloads\\chromedriver-win64\\chromedriver-win64\\ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		String applicationUrlAddress="https://echoecho.com/htmlforms10.htm";
		driver.get(applicationUrlAddress);
		
		By group1RadioButtonsProperty=By.name("group1");
		List<WebElement>group1RadioButtons=driver.findElements(group1RadioButtonsProperty);
		int group1RadioButtonsCount=group1RadioButtons.size();
		
		By group2RadioButtonsProperty=By.name("group2");
		List<WebElement>group2RadioButtons=driver.findElements(group1RadioButtonsProperty);
		int group2RadioButtonsCount=group1RadioButtons.size();
		
		group1RadioButtons.addAll(group2RadioButtons);
		
		group1RadioButtonsCount=group1RadioButtons.size();
		System.out.println(group1RadioButtonsCount);
		
		for(int group1RadioButtonsArrayIndexClick=0;group1RadioButtonsArrayIndexClick<group1RadioButtonsCount;group1RadioButtonsArrayIndexClick++)
		{
			group1RadioButtons.get(group1RadioButtonsArrayIndexClick).click();
			
			
		
		Thread.sleep(10000);
		//System.out.println("Checking Status of Buttons When"+group1RadioButtonsArrayIndexClick.getAttribute("value")+"is clicked");
		
		
		
		for(int group1RadioButtonsArrayIndexStatus=0;group1RadioButtonsArrayIndexStatus<group1RadioButtonsCount;group1RadioButtonsArrayIndexStatus++)
		{
			String group1RadioButtonsName=group1RadioButtons.get(group1RadioButtonsArrayIndexStatus).getAttribute("value");	
			
			System.out.println(group1RadioButtonsName+"-");
		}
		}
		
		
	}
	}
		
			
	
			
		