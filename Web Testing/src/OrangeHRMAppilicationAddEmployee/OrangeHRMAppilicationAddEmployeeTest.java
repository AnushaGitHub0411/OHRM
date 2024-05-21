package OrangeHRMAppilicationAddEmployee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class OrangeHRMAppilicationAddEmployeeTest extends BaseTest{
	FileInputStream oHrmTestDataFile;
	XSSFWorkbook OHRMWorkBook;
	XSSFSheet oHRMTestDataSheet;
	
	@Test(priority=1,description="OrangeHRM Appilication Login Test Validation")
	public void orangeHRMAppilicationLoginFunctionalityTest() throws IOException
	{
		oHrmTestDataFile=new FileInputStream("C:\\Users\\T Anusha\\Desktop\\SeleniumTest\\Web Testing\\src\\ExcelOperations\\AddEmployee_Multiple_Data.xlsx");
		OHRMWorkBook=new XSSFWorkbook(oHrmTestDataFile);
		 oHRMTestDataSheet=OHRMWorkBook.getSheet("sheet1");
		Row newRow=oHRMTestDataSheet.getRow(1);
		 Cell rowofCell=newRow.getCell(0);
		String Expected_LoginPageText=rowofCell.getStringCellValue();
		System.out.println("The Expected Login Page Login Panel Text Is:"+ Expected_LoginPageText);
		
		//id=<div id="logInPanelHeading">LOGIN Panel</div>
		 By OHRMLoginPageLoginPanelProperty=By.id("logInPanelHeading");
		 WebElement OHRMLoginPageLoginPanel=driver.findElement(OHRMLoginPageLoginPanelProperty);
		 String actual_LoginPageText=OHRMLoginPageLoginPanel.getText();
		 System.out.println("The Actual Login Page Login Panel Text Is:"+actual_LoginPageText);
		 Cell Actual_Text=newRow.createCell(2);
		 Actual_Text.setCellValue(actual_LoginPageText);
		 if(actual_LoginPageText.equals(Expected_LoginPageText))
		 {
			 Cell LoginPanelTestResult=newRow.createCell(3);
			 System.out.println("Successfully Navigated To OrangeHRM Appilication Login Page Text Found -Pass");
			 LoginPanelTestResult.setCellValue("Pass");
		 }
		 else
		 {
				Cell logInPanelTestResult=newRow.createCell(3);
				
				System.out.println("Failed to Navigate To OrangeHRM Application LogIn Page Text Not Found-FAIL");
				
				logInPanelTestResult.setCellValue("FAIL");
				
			}
		 Cell expected_Title=oHRMTestDataSheet.getCell(4);
		 String expected_OrangeHRMLogInPageTitle=expected_Title.getStringCellValue();
		 
		 System.out.println("The Expected OrangeHRM Application LogIn Page Title is:"+expected_OrangeHRMLogInPageTitle);
		 
		 String actual_OrangeHRMLogInPageTitle=driver.getTitle();
		 System.out.println("The Actual OrangeHRM Application Title is:"+actual_OrangeHRMLogInPageTitle);
		 
		 orangeHRMRowOfCell=oHRMTestDataSheet.createCell(5);
		 orangeHRMRowOfCell.setCellValue(actual_OrangeHRMLogInPageTitle);
		 
		 if(actual_OrangeHRMLogInPageTitle.equalsIgnoreCase(expected_OrangeHRMLogInPageTitle))
		 {
			 System.out.println("Successfully Navigated to the OrangeHRM Application LogIn Page-PASS");
			 orangeHRMTitle=orangeHRMRow.createCell(6);
			 orangeHRMRowOfCell.setCellValue("PASS");

		 }
		 else
		 {
			 System.out.println("Failed to Navigate to the OrangeHRM Application LogIn Page-FAIL");
			 orangeHRMRowOfCell=oHRMTestDataSheet.createCell(6);
			 orangeHRMRowOfCell.setCellValue("FAIL");
		
	}
		 Cell userNameCell=oHRMTestDataSheet.getCell(7);
			String LogIn_PageuserName=userNameCell.getStringCellValue();
			
			
			//<input name="txtUsername" id="txtUsername" type="text" fdprocessedid="v5xnu">
			By userNameProperty=By.id("txtUsername");
			WebElement userName=driver.findElement(userNameProperty);
			userName.sendKeys(LogIn_PageuserName);
			
			
			Cell passwordCell=oHRMTestDataSheet.getCell(8);
			String logInPagePassword=passwordCell.getStringCellValue();
			

	
	
	
	
	


