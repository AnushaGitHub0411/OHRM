package osmania_drop_down;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TimeAndDate{

	System.setProperty("")


	public void time()
	{
		
		///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		
		///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[8]
		for(int rowIndex=1;rowIndex<=36;rowIndex++)
		{
			for(int rowOfCellIndex=1;rowOfCellIndex<=8;rowOfCellIndex++)
			{
				By nameProperty=By.xpath("html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+rowIndex+"]/td["+rowOfCellIndex+"]");
				WebElement name=driver.findElement(nameProperty);
				
				String nameText=name.getText();
				System.out.print(nameText+" ");
			}
			System.out.println();
		}
	}
	
	
	

}
