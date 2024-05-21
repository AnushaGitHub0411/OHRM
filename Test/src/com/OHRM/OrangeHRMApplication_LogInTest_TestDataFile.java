package com.OHRM;

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

public class OrangeHRMApplication_LogInTest_TestDataFile {
	public static void main(String[] args) throws IOException, InterruptedException {


		WebDriver driver;
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\T Anusha\\Desktop\\SeleniumTest\\Test\\driverFiles\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		driver = new ChromeDriver();

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
		// Expected Url Address shold have - orangehrm-4.2.0.1


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

		System.out.println(" The Acutal Text of OrangeHRM Application LogIn Page TEXT is :- "+actual_OrangeHRMApplicationLogInPageLogInPanelText);

		if(actual_OrangeHRMApplicationLogInPageLogInPanelText.equals(expected_OrangeHRMApplicationLogInPageText))
		{
		System.out.println(" Successfully Navigated to the OrangeHRM Application LogIN Page - TEXT Found - PASS ");
		}
		else
		{
		System.out.println(" Failed to Navigate to the OrangeHRM Application LogIN Page - TEXT NOT Found - FAIL ");
		}

		System.out.println();

		// getting the Test Data from the External File


		FileInputStream logInTestDataFile = new FileInputStream("C:\\Users\\T Anusha\\Desktop\\SeleniumTest\\Test\\src\\ExcelOperations\\OHRM_LogInTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(logInTestDataFile);
		XSSFSheet logInTestDataSheet = workBook.getSheet("OrangeHRM_LogInTestData");

		Row logInTestDataRow=logInTestDataSheet.getRow(1);
		Cell logInUserNameRowOfCell=logInTestDataRow.getCell(0);

		String userNameTestData=logInUserNameRowOfCell.getStringCellValue();


		// String userNameTestData="srini"; // TestData assigned to a Variable
		 
		By userNameProperty=By.id("txtUsername"); // Property of an element assigned to a variable
		WebElement userName=driver.findElement(userNameProperty); // Identify the element in the Current WebPage
		userName.sendKeys(userNameTestData);// Operation on the Identified WebElement

		// <input name="txtPassword" id="txtPassword" autocomplete="off" type="password">

		// String passwordTestData="Q@Trainer7";

		Cell logInPasswordRowOfCell=logInTestDataRow.getCell(1);
		String passwordTestData=logInPasswordRowOfCell.getStringCellValue();

		By passwordProperty=By.name("txtPassword");
		WebElement password=driver.findElement(passwordProperty);
		password.sendKeys(passwordTestData);

		// <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">

		By logInButtonProperty=By.className("button");
		WebElement logInButton=driver.findElement(logInButtonProperty);
		logInButton.click();

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


		// Validating HOME Page
		// expected Text should have - Admin

		String expected_OrangeHRMApplicationHomePageText="Admin";
		System.out.println(" The Expected TEXT of OrangeHRM Application Home Page is :- "+expected_OrangeHRMApplicationHomePageText);

		// <a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>

		// By welComeAdminProperty=By.linkText("Welcome Admin");

		By welComeAdminProperty=By.partialLinkText("Welcome");


		WebElement welComeAdmin=driver.findElement(welComeAdminProperty);
		String actual_welComeAdminText=welComeAdmin.getText();

		System.out.println(" The Actual Text of the OrangeHRM Application HomePage is :- "+actual_welComeAdminText);
		for( int rowsCount=0;rowsCount<5;rowsCount++)

		if(actual_welComeAdminText.contains(expected_OrangeHRMApplicationHomePageText))
		{
		System.out.println(" Successfully Navigated to the OrangeHRM Application HOME Page - PASS ");
		Cell testResultCell=logInTestDataRow.createCell(rowsCount);
		testResultCell.setCellValue("Successfully Navigated to the OrangeHRM Application HOME Page - PASS ");
		}

		else
		{
		System.out.println(" Failed to Navigate to the OrangeHRM Application HOME Page - FAIL ");
		Cell testResultCell=logInTestDataRow.createCell(rowsCount);
		testResultCell.setCellValue("Failed to Navigate to the OrangeHRM Application HOME Page - FAIL  ");
		}

		FileOutputStream testResultFile = new FileOutputStream("C:\\Users\\T Anusha\\Desktop\\SeleniumTest\\Test\\src\\ExcelOperations\\OHRM_ResultTestData.xlsx");
		workBook.write(testResultFile);


		welComeAdmin.click();

		Thread.sleep(5000);

		// <a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
		/*
		By logOutProperty=By.linkText("Logout");
		OR
		*/

		By logOutProperty=By.partialLinkText("Logo"); // considering a part of the Text of the LINK as Selector
		WebElement logOut=driver.findElement(logOutProperty);
		logOut.click();

		// LogIn Page Validation

		driver.quit();

		}

		}



