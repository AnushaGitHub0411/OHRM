
	package Tsrtc_Screenshots;
	import java.io.File;
	import java.io.IOException;
	import java.util.List;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Tsrtc_HeaderLinks_Screenshots{
		WebDriver driver;
		
	public void tsrtc_Application_Launch(){
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\T Anusha\\Desktop\\SeleniumTest\\Test\\driverFiles\\chromedriver.exe");
		    driver = new ChromeDriver();
		
			String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
			driver.get(applicationUrlAddress);
	}
	public void links_Check() throws IOException {


			By tsrtcHomePageHeaderBlockProperty=By.className("menu-wrap");
			WebElement tsrtcHomePageHeaderBlock=driver.findElement(tsrtcHomePageHeaderBlockProperty);

			

			By tsrtcHomePageHeaderBlockLinksProperty=By.tagName("a");
			List<WebElement>tsrtcHomePageHeaderBlockLinks=tsrtcHomePageHeaderBlock.findElements(tsrtcHomePageHeaderBlockLinksProperty);
	     
			int tsrtcHeaderBlockLinksCount=tsrtcHomePageHeaderBlockLinks.size();
			System.out.println(tsrtcHeaderBlockLinksCount);

			
			for(int arrayIndex=0;arrayIndex<tsrtcHeaderBlockLinksCount;arrayIndex++)
			{
				String tsrtcHomePageHeaderBlocLinkName=
				        tsrtcHomePageHeaderBlockLinks.get(arrayIndex).getText();
				System.out.println(arrayIndex+" - "+tsrtcHomePageHeaderBlocLinkName);

				String expected_LinkUrlAddress=tsrtcHomePageHeaderBlockLinks.get(arrayIndex).getAttribute("href");
				System.out.println(" The expected link URL Address is :- "+expected_LinkUrlAddress);

				
				tsrtcHomePageHeaderBlockLinks.get(arrayIndex).click();

			
				String actual_WebPageTitle=driver.getTitle();
				System.out.println(" The Title of the Navigated WebPage is:-  "+actual_WebPageTitle);

				String actual_WebPageCurrentUrlAddress=driver.getCurrentUrl();
				System.out.println(" The Current Url Address of the Navigated WebPage is:-  "+actual_WebPageCurrentUrlAddress);
				
				if(actual_WebPageCurrentUrlAddress.equals(expected_LinkUrlAddress))
				{
				System.out.println(" Successfully Navigated to The Links Related Url Address WebPage - PASS");
				}
				else
				{
				System.out.println(" Failed to Navigate to The Links Related Url Address WebPage - FAIL");
				}
				

				  File TsrtcScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					
			      FileUtils.copyFile(TsrtcScreenShot, new File("./ApplicationScreenShots/tsrtc.png"+tsrtcHomePageHeaderBlocLinkName));
				

					System.out.println();
				   driver.navigate().back();
					
				tsrtcHomePageHeaderBlockProperty=By.className("menu-wrap");
				tsrtcHomePageHeaderBlock=driver.findElement(tsrtcHomePageHeaderBlockProperty);
				tsrtcHomePageHeaderBlockLinksProperty=By.tagName("a");
				
				tsrtcHomePageHeaderBlockLinks=tsrtcHomePageHeaderBlock.findElements(tsrtcHomePageHeaderBlockLinksProperty);
				
				System.out.println();

				}
		}
		public void close_Application()
		{
				driver.close();
		}

				public static void main(String[] args) throws IOException{
					
					Tsrtc_HeaderLinks_Screenshots tsrtc =new Tsrtc_HeaderLinks_Screenshots();
					
					tsrtc.tsrtc_Application_Launch();
					tsrtc.links_Check();
					tsrtc.close_Application();
					
			}

		}


			

