package osmania_drop_down;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OsmaniaUniversity_SelectLanguage{
	public static void main(String args[]) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\T Anusha\\Downloads\\chromedriver-win64\\chromedriver-win64\\ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String applicationUrlAddress="https://www.osmania.ac.in/";
		driver.get(applicationUrlAddress);
		// id="gtranslate_selector"
		By selectLanguagesProperty=By.id("gtranslate_selector");
		WebElement selectLanguagesDropDown=driver.findElement(selectLanguagesProperty);
		By languagesProperty=By.tagName("option");
		List<WebElement>selectLanguages=selectLanguagesDropDown.findElements(languagesProperty);
		int selectLanguagesCount=selectLanguages.size();
		System.out.println("the number of languages in the select language drop down are:"+selectLanguagesCount);
		for(int arrayIndex=0;arrayIndex<selectLanguagesCount;arrayIndex++)
		{
			String language=selectLanguages.get(arrayIndex).getText();
			selectLanguages.get(arrayIndex).click();
			Thread.sleep(3000);
			File LanguageScreenShots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(LanguageScreenShots, new File("./ApplicationScreenShots/OsmaniaUniversity.png"+language));
				
			
			System.out.println(language);
			
		}
		
	}
	
		
		
	}
	
	

	

