package com.OHRM1;

	import java.io.FileInputStream;

	import java.io.FileOutputStream;

	import java.io.IOException;

	import org.apache.poi.ss.usermodel.Cell;

	import org.apache.poi.ss.usermodel.Row;

	import org.apache.poi.xssf.usermodel.XSSFSheet;

	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.By;

	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.WebElement;

	import org.openqa.selenium.chrome.ChromeDriver;

		public class OrangeHRMApplicationLoginWithMultipleTestData1 {

	public static void main(String[] args) throws IOException, InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\T Anusha\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\ChromeDriver.exe");

		//WebDriver driver;

		 //driver = new ChromeDriver();
		ChromeDriver driver = new ChromeDriver();
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";


		driver.get(applicationUrlAddress);

		// Expected Title should be - OrangeHRM

		String expected_OrangeHRMApplicationLogInPageTitle="OrangeHRM";

		System.out.println(" The expected Title of the OrangeHRM Application LogIN Page is :- "+expected_OrangeHRMApplicationLogInPageTitle);


		String actual_OrangeHRMApplicationLogInPageTitle=driver.getTitle();

		System.out.println(" The actual Title of the OrangeHRM Application LogIN Page is :- "+actual_OrangeHRMApplicationLogInPageTitle);


		if(actual_OrangeHRMApplicationLogInPageTitle.equals(expected_OrangeHRMApplicationLogInPageTitle))

		{

		System.out.println(" Successfully Navigated to the OrangeHRM Application LogIN Page - PASS ");

		}

		else

		{

		System.out.println(" Failed to Navigate to the OrangeHRM Application LogIN Page - FAIL ");

		}

		

		System.out.println();

		// Expected Url Address should have - orangehrm-4.2.0.1

		String expected_OrangeHRMApplicationLogInPageUrlAddress="orangehrm-4.2.0.1";

		System.out.println(" The Expected URL address of the OrangeHRM Application LogIN Page is :- "+expected_OrangeHRMApplicationLogInPageUrlAddress);



		String actual_OrangeHRMApplicationLogInPageUrlAddress=driver.getCurrentUrl();

		System.out.println(" The Actual URL address of the OrangeHRM Application LogIN Page is :- "+actual_OrangeHRMApplicationLogInPageUrlAddress);



		if(actual_OrangeHRMApplicationLogInPageUrlAddress.contains(expected_OrangeHRMApplicationLogInPageUrlAddress))

		{

		System.out.println(" Successfully Navigated to the OrangeHRM Application LogIN Page - PASS ");

		}

		else

		{

		System.out.println(" Failed to Navigate to the OrangeHRM Application LogIN Page - FAIL ");

		}





		System.out.println();



		// Expected LogIN Page TEXT - LOGIN Panel



				String expected_OrangeHRMApplicationLogInPageText="LOGIN Panel";

				System.out.println(" The Expected TEXT of the OrangeHRM Application LogIN page is :- "+expected_OrangeHRMApplicationLogInPageText);



				// id="logInPanelHeading"

				By orangeHRMApplicationLogInPageLogInPanelTextProperty=By.id("logInPanelHeading");

				WebElement orangeHRMApplicationLogInPageLogInPanel=driver.findElement(orangeHRMApplicationLogInPageLogInPanelTextProperty);



				String actual_OrangeHRMApplicationLogInPageLogInPanelText=orangeHRMApplicationLogInPageLogInPanel.getText();



				System.out.println(" The Actual Text of OrangeHRM Application LogIn Page TEXT is :- "+actual_OrangeHRMApplicationLogInPageLogInPanelText);



				if(actual_OrangeHRMApplicationLogInPageLogInPanelText.equals(expected_OrangeHRMApplicationLogInPageText))

				{

				System.out.println(" Successfully Navigated to the OrangeHRM Application LogIN Page - TEXT Found - PASS ");

				}

				else

				{

				System.out.println(" Failed to Navigate to the OrangeHRM Application LogIN Page - TEXT NOT Found - FAIL ");

				}



				System.out.println();

		

		FileInputStream excelTestDataFile = new FileInputStream("C:\\Users\\T Anusha\\Desktop\\SeleniumTest\\Test\\src\\ExcelOperations\\OHRM_LogInTestData.xlsx");

		XSSFWorkbook workBook = new XSSFWorkbook(excelTestDataFile);

		XSSFSheet testDataSheet =workBook.getSheet("OrangeHRM_LogInTestData");



		int rowsCount=testDataSheet.getLastRowNum();

		

		for(int index=1;index<=rowsCount;index++)

		{

		Row testDataSheetOfRow=testDataSheet.getRow(index);

		Cell testDataSheetOfRowOfCell=testDataSheetOfRow.getCell(0);

		String userNameTestData=testDataSheetOfRowOfCell.getStringCellValue();



		By userNameProperty=By.id("txtUsername");

		WebElement userName=driver.findElement(userNameProperty);

		userName.sendKeys(userNameTestData);



		Cell testDataSheetOfRowOfCell1=testDataSheetOfRow.getCell(1);

		String passwordTestData=testDataSheetOfRowOfCell1.getStringCellValue();



		By passwordProperty=By.id("txtPassword");

		WebElement password=driver.findElement(passwordProperty);

		password.sendKeys(passwordTestData);

		

		System.out.println();



		// Expected Title should be - OrangeHRM





		String expected_OrangeHRMApplicationHomePageTitle="OrangeHRM";

		System.out.println(" The expected Title of the OrangeHRM Application HOME Page is :- "+expected_OrangeHRMApplicationHomePageTitle);





		String actual_OrangeHRMApplicationHomePageTitle=driver.getTitle();

		System.out.println(" The actual Title of the OrangeHRM Application Home Page is :- "+actual_OrangeHRMApplicationHomePageTitle);



		if(actual_OrangeHRMApplicationHomePageTitle.equals(expected_OrangeHRMApplicationHomePageTitle))

		{

		System.out.println(" Successfully Navigated to the OrangeHRM Application HOME Page - PASS ");

		}

		else

		{

		System.out.println(" Failed to Navigate to the OrangeHRM Application HOME Page - FAIL ");

		}



		System.out.println();





		By loginButtonProperty=By.id("btnLogin");

		WebElement loginButton=driver.findElement(loginButtonProperty);

		loginButton.click();



		String Expected_OrangeHRMApplicationURLAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";

		System.out.println("The Expected URLAddress of OrangeHRMApplication is:- "+Expected_OrangeHRMApplicationURLAddress);



		String Actual_OrangeHRMApplicationURLAddress=driver.getCurrentUrl();

		System.out.println("The Actual   URLAddress of OrangeHRMApplication is:- "+Actual_OrangeHRMApplicationURLAddress);


		if(Actual_OrangeHRMApplicationURLAddress.contains(Expected_OrangeHRMApplicationURLAddress))

		{

			
		By welcomeAdminProperty=By.linkText("Welcome Admin");

		WebElement welcomeAdmin=driver.findElement(welcomeAdminProperty);

		welcomeAdmin.click();


		Thread.sleep(5000);


		By logOutProperty=By.partialLinkText("Logo"); // considering a part of the Text of the LINK as Selector

		WebElement logOut=driver.findElement(logOutProperty);

		logOut.click();

	    

		System.out.println("Successfully Navigate to OrangeHRM Application HomePage - PASS");

		Cell testDataSheetOfRowOfCell2=testDataSheetOfRow.createCell(2);

		testDataSheetOfRowOfCell2.setCellValue("Successfully Navigate to OrangeHRM Application HomePage - PASS");



		}

		else

		{

		System.out.println("Failed To Navigate to OrangeHRM Application HomePage - FAIL");

		Cell testDataSheetOfRowOfCell3=testDataSheetOfRow.createCell(2);

		testDataSheetOfRowOfCell3.setCellValue("Failed To Navigate to OrangeHRM Application HomePage - FAIL");



		}

		FileOutputStream outPutFile = new FileOutputStream("C:\\Users\\T Anusha\\Desktop\\SeleniumTest\\Test\\src\\ExcelOperations\\OHRM_ResultTestData.xlsx");

		workBook.write(outPutFile);

		

		//driver.quit();


		}

		}

	}


