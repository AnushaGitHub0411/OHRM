package com.OrangeHRMAppilicationTestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.BaseTest.BaseTest;
import com.Utility.Log;

public class OrangeHRMApplication_AddingEmployeeTest extends BaseTest{
	FileInputStream orangeHRMAppilicationTestDataFile;
	XSSFWorkbook orangeHRMAppilicationWorkBook;
	XSSFSheet orangeHRMAppilicationTestDataSheet;
	Row orangeHRMRow;
	Cell orangeHRMRowOfCell;
	FileOutputStream orangeHRMAppilicationLoginTestResultFile;
	
	@Test(priority=1,description="OrangeHRMAppilication Add Employee Test")
	public void orangeHRMAppilication_AddEmployee() throws IOException 4
	{
		orangeHRMAppilicationTestDataFile=new FileInputStream("C:\\Users\\T Anusha\\Desktop\\SeleniumTest\\OrangeHRM\\src\\main\\java\\com\\OrangeHRMAppilicationTestDataFiles\\AddEmployee.xlsx");
		orangeHRMAppilicationWorkBook=new XSSFWorkbook(orangeHRMAppilicationTestDataFile);
		orangeHRMAppilicationTestDataSheet=orangeHRMAppilicationWorkBook.getSheet("sheet1");
		orangeHRMRow=orangeHRMAppilicationTestDataSheet.getRow(1);
		orangeHRMRowOfCell=orangeHRMRow.getCell(0);
		String expected_OrangeHRMLogInPageText=orangeHRMRowOfCell.getStringCellValue();
		Log.info("The Expected OrangeHRM Application LogIn Page LogIn Panel Text is:"+expected_OrangeHRMLogInPageText);
		 FileInputStream OHRMApplication=new FileInputStream("C:\\Users\\T Anusha\\Desktop\\SeleniumTest\\OrangeHRM\\src\\main\\java\\com\\config\\OHRMAppilication.properties");
        Properties properties=new Properties();
		 properties.load(OHRMApplication);
		 
			By orangeHRMApplicationLogInPageLogInPanelProperty=By.id(properties.getProperty("logInPageLogInPanelProperty"));
			WebElement orangeHRMApplicationLogInPageLogInPanel;
			
				orangeHRMApplicationLogInPageLogInPanel = driver.findElement(orangeHRMApplicationLogInPageLogInPanelProperty);
			
			
			String actual_OrangeHRMLogInPageText=orangeHRMApplicationLogInPageLogInPanel.getText();
			
			Log.info("The  Actual OrangeHRM Application LogIn Page LogIn Panel Text is:"+actual_OrangeHRMLogInPageText);
			
			 orangeHRMRowOfCell=orangeHRMRow.createCell(2);
			 orangeHRMRowOfCell.setCellValue(actual_OrangeHRMLogInPageText);
			 if(actual_OrangeHRMLogInPageText.equals(expected_OrangeHRMLogInPageText))
			 {

				 Log.info("Successfully Navigated to the OrangeHRM Application LogIn Page-TEXT FOUND--PASS");
				 orangeHRMRowOfCell=orangeHRMRow.createCell(3);
				 orangeHRMRowOfCell.setCellValue("PASS");
			 }
			 else
			 {
				 Log.info("Failed to Navigate to the OrangeHRM Application LogIn Page-FAIL");
				 orangeHRMRowOfCell=orangeHRMRow.createCell(3);
				 orangeHRMRowOfCell.setCellValue("FAIL");
			 }
			 Cell expected_Title=orangeHRMRow.getCell(4);
			 String expected_OrangeHRMLogInPageTitle=expected_Title.getStringCellValue();
			 
			 
			 Log.info("The Expected OrangeHRM Application LogIn Page Title is:"+expected_OrangeHRMLogInPageTitle);
			 
			 String actual_OrangeHRMLogInPageTitle=driver.getTitle();
			 
			 Log.info("The Actual OrangeHRM Application Title is:"+actual_OrangeHRMLogInPageTitle);
			 
			 orangeHRMRowOfCell=orangeHRMRow.createCell(5);
			 orangeHRMRowOfCell.setCellValue(actual_OrangeHRMLogInPageTitle);
			 
			 if(actual_OrangeHRMLogInPageTitle.equalsIgnoreCase(expected_OrangeHRMLogInPageTitle))
			 {
				 Log.info("Successfully Navigated to the OrangeHRM Application LogIn Page-PASS");
				 orangeHRMRowOfCell=orangeHRMRow.createCell(6);
				 orangeHRMRowOfCell.setCellValue("PASS");
				 
			 }
			 else
			 {
				
				 Log.info("Failed to Navigate to the OrangeHRM Application LogIn Page-FAIL");
				 orangeHRMRowOfCell=orangeHRMRow.createCell(6);
				 orangeHRMRowOfCell.setCellValue("FAIL");
			     Cell userNameTestDataCell=orangeHRMRow.getCell(7);
				 String userNameTestData=userNameTestDataCell.getStringCellValue();
				  	  
		  By userNameProperty=By.id(properties.getProperty("logInPageUserNameProperty"));
		  WebElement userName=driver.findElement(userNameProperty);
		  userName.sendKeys(userNameTestData);
				 
		  Cell passwordTestDataCell=orangeHRMRow.getCell(8);
   	     String passwordTestData=passwordTestDataCell.getStringCellValue();
		   		 
		   	    By passwordProperty=By.name(properties.getProperty("logInPagepasswordProperty"));
		   	    WebElement password=driver.findElement(passwordProperty);
		   	    password.sendKeys(passwordTestData);
				 
			  By logInButtonProperty=By.className(properties.getProperty("logInPageLogInButtonProperty"));
		   WebElement logInButton=driver.findElement(logInButtonProperty);
		   logInButton.click();
			 		
			 
	  			  			 
	  		   By pimProperty=By.id(properties.getProperty("pimProperty"));
	  		   WebElement pim=driver.findElement(pimProperty);
	  		  			 
	  		   Actions pimActions=new Actions(driver);
	  		   pimActions.moveToElement(pim).build().perform();
	  		  			 
	  		  			 
	  		   By pimAddEmployeeProperty=By.id(properties.getProperty("pimAddEmployeeProperty"));
	  		  WebElement pimAddEmployee=driver.findElement(pimAddEmployeeProperty);
	  		  pimAddEmployee.click();
	  		  
	  			 Cell addEmployeePageText=orangeHRMRow.getCell(12);
		  		 String expected_AddEmployeePageText=addEmployeePageText.getStringCellValue();
		  			 
		  			 
		  	 Log.info("The Expected OrangeHRM Application Add Employee Page Text:"+expected_AddEmployeePageText);
		  			
		 		 By addEmployeetext=By.xpath("/html/body/div[1]/div[3]/div/div[2]/form/fieldset/ol/li[1]/label");
	 			 WebElement actual_AddEmployee=driver.findElement(addEmployeetext);
		  			 
	 			 String actual_AddEmployeeText=actual_AddEmployee.getText();
		  			 
		  	 Log.info("The Actual OrangeHRM Application Add Employee Page Text:"+actual_AddEmployeeText);
		  	orangeHRMRowOfCell=orangeHRMRow.createCell(13);
	  			 orangeHRMRowOfCell.setCellValue(actual_AddEmployeeText);
	  			 
	  			 if(actual_AddEmployeeText.equals(expected_AddEmployeePageText))
	  			 {
	  				 Log.info("Successfully Navigated to OrangeHRM Application Add Employee Page-TEXT FOUND-PASS");
	  				 orangeHRMRowOfCell=orangeHRMRow.createCell(14);
	  				 orangeHRMRowOfCell.setCellValue("PASS");
	  				
	  			 }
	  				 else
	  				 {
	  					 Log.info("Failed to Navigate to OrangeHRM Application Add Employee Page-TEXT NOT FOUND-PASS");
		  				 orangeHRMRowOfCell=orangeHRMRow.createCell(14);
		  				 orangeHRMRowOfCell.setCellValue("FAIL");
		  				 }
				
			 Cell f_name= orangeHRMRow.getCell(15);
			 String addEmployeeFirstName=f_name.getStringCellValue();
			 
			 By addEmployee_FirstNameProperty=By.id(properties.getProperty("pimAddEmployeeFirstNameProperty"));
			 WebElement addEmployee_FirstName=driver.findElement(addEmployee_FirstNameProperty);
			 addEmployee_FirstName.sendKeys(addEmployeeFirstName);
			 Cell m_Name=orangeHRMRow.getCell(16);
  			 String addEmployeeMiddleName=m_Name.getStringCellValue();
  			
  			 By addEmployee_MiddleNameProperty=By.id(properties.getProperty("pimAddEmployeeMiddleNameProperty"));
  			 WebElement addEmployee_MiddleName=driver.findElement(addEmployee_MiddleNameProperty);
  			 addEmployee_MiddleName.sendKeys(addEmployeeMiddleName);
  			 
  			 Cell l_Name=orangeHRMRow.getCell(17);
  			 String addEmployeeLastName=l_Name.getStringCellValue();
   			 
  			 By addEmployee_LastNameProperty=By.id(properties.getProperty("pimAddEmployeeLastNameProperty"));
  			 WebElement addEmployee_LastName=driver.findElement(addEmployee_LastNameProperty);
  			 addEmployee_LastName.sendKeys(addEmployeeLastName);
  		
  			 By saveButtonProperty=By.id(properties.getProperty("saveButtonProperty"));
  			 WebElement saveButton=driver.findElement(saveButtonProperty);
  			 saveButton.click();
  			 By employeeIDLocator=By.id(properties.getProperty("employeeIdProperty"));
  			 WebElement employeeID=driver.findElement(employeeIDLocator);
  			 String employeeID_Value=employeeID.getAttribute("value");
  			 System.out.println("The Actual Employee ID is:"+employeeID_Value);
  			 
  			 orangeHRMRowOfCell=orangeHRMRow.createCell(18);
  			 orangeHRMRowOfCell.setCellValue(employeeID_Value);	 
  			 	
  			 
    		 try
    		 {
    			By welcomeAdminProperty= By.partialLinkText(properties.getProperty("orangeHRMApplicationHomePageWelComeAdminProperty"));
    			WebElement welComeAdmin=driver.findElement(welcomeAdminProperty);
    			
    			String actual_OrangeHRMWelcomeAdminText=welComeAdmin.getText();
    			Log.info("The Actual OrangeHRM Application Home Page Text is"+actual_OrangeHRMWelcomeAdminText);
    			Cell actual_AdminText=orangeHRMRow.createCell(10);
    			actual_AdminText.setCellValue(actual_OrangeHRMWelcomeAdminText);
    			
    			
    			Cell homePageText=orangeHRMRow.getCell(9);
    			String expected_OrangeHRMWelcomeAdminText=homePageText.getStringCellValue();
    			
    			Log.info("The Expected OrangeHRM Application Home Page Text is:"+expected_OrangeHRMWelcomeAdminText);
    		 
    			
    			if(actual_OrangeHRMWelcomeAdminText.contains(actual_OrangeHRMWelcomeAdminText))
    			{
    				Log.info("Successfully Navigated to OrangeHRM Application Home Page-TEXT Found-PASS");
    				Cell homePageTextResult=orangeHRMRow.createCell(11);
    				homePageTextResult.setCellValue("PASS");
    				
    			}
    			
    			if(welComeAdmin.isDisplayed())
    			{
    				welComeAdmin.click();
    				By logOutProperty=By.partialLinkText(properties.getProperty("homePagelogOutProperty"));
    				WebElement logOut=driver.findElement(logOutProperty);
    				logOut.click();
    			}
    			
    			 
    		 }
  			 
  			 
    		 catch(Exception e)
    		 {
    			 By invalidCredentialsProperty = By.id(properties.getProperty("invalidCredentialsProperty"));
    			 WebElement invalidCredentials = driver.findElement(invalidCredentialsProperty);

    			 String actualinvalidCredentials = invalidCredentials.getText();

    			 Cell homePageTestResult = orangeHRMRow.createCell(11);

    			 String expecteddataOfLoginInvalid = orangeHRMRow.getCell(1).getStringCellValue();

    			 if (actualinvalidCredentials.equalsIgnoreCase(expecteddataOfLoginInvalid))
    			 {

    			 Log.info("Failed To login Due to invalid Credentials:-Fail");
    			 homePageTestResult.setCellValue("Fail");
    			 
    			 FileOutputStream orangeHRMApplicationTestResultFile=new FileOutputStream("C:\\Users\\T Anusha\\Desktop\\SeleniumTest\\OrangeHRM\\src\\main\\java\\com\\OrangeHRMAppilicationTestDataFiles\\AddEmployee.xlsx");
    			 orangeHRMAppilicationWorkBook.write(orangeHRMApplicationTestResultFile);

    	     
    		 }
  				}


  			 


			 }	
				



		 
		

	}
	
	

}
