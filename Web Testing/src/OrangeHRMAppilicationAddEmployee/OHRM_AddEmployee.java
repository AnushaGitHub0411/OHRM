package OrangeHRMAppilicationAddEmployee;

	

	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;

	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.testng.annotations.Test;
	public class OHRM_AddEmployee extends BaseTest{

	
		
		FileInputStream orangeHRMApplicationTestDataFile;
		XSSFWorkbook orangeHRMApplicationWorkBook;
		XSSFSheet orangeHRMApplicationTestDataSheet;
		Row orangeHRMRow;
		Cell orangeHRMRowOfCell;
		FileOutputStream orangeHRMApplicationLogInTestResultFile;
	    
		@Test(priority=1,description="Validation of OrangeHRM Application LogIn Page")
		public void orangeHRMApplication_Validation_LogInPage() throws IOException, InterruptedException
		{
			orangeHRMApplicationTestDataFile=new FileInputStream("C:\\Users\\T Anusha\\Desktop\\SeleniumTest\\Web Testing\\src\\ExcelOperations\\AddEmployee_Multiple_Data.xlsx");
			
			orangeHRMApplicationWorkBook=new XSSFWorkbook(orangeHRMApplicationTestDataFile);
			
			orangeHRMApplicationTestDataSheet=orangeHRMApplicationWorkBook.getSheet("Sheet1");
			
			orangeHRMRow=orangeHRMApplicationTestDataSheet.getRow(1);
			
			orangeHRMRowOfCell=orangeHRMRow.getCell(0);
			
			String expected_OrangeHRMLogInPageText=orangeHRMRowOfCell.getStringCellValue();
			System.out.println("The Expected OrangeHRM Application LogIn Page LogIn Panel Text is:"+expected_OrangeHRMLogInPageText);
			
			//<div id="logInPanelHeading">LOGIN Panel</div>
			By orangeHRMApplicationLogInPageLogInPanelProperty=By.id("logInPanelHeading");
			WebElement orangeHRMApplicationLogInPageLogInPanel=driver.findElement(orangeHRMApplicationLogInPageLogInPanelProperty);
			
			String actual_OrangeHRMLogInPageText=orangeHRMApplicationLogInPageLogInPanel.getText();
			System.out.println("The  Actual OrangeHRM Application LogIn Page LogIn Panel Text is:"+actual_OrangeHRMLogInPageText);
			
			 orangeHRMRowOfCell=orangeHRMRow.createCell(2);
			 orangeHRMRowOfCell.setCellValue(actual_OrangeHRMLogInPageText);
			 
			 if(actual_OrangeHRMLogInPageText.equals(expected_OrangeHRMLogInPageText))
			 {
				 System.out.println("Successfully Navigated to the OrangeHRM Application LogIn PageTEXT FOUND-p0ASS");
				 orangeHRMRowOfCell=orangeHRMRow.createCell(3);
				 orangeHRMRowOfCell.setCellValue("PASS");
				 
			 }
			 else
			 {
				 System.out.println("Failed to Navigate to the OrangeHRM Application LogIn Page-FAIL");
				 orangeHRMRowOfCell=orangeHRMRow.createCell(3);
				 orangeHRMRowOfCell.setCellValue("FAIL");
			 }
			 
			 Cell expected_Title=orangeHRMRow.getCell(4);
			 String expected_OrangeHRMLogInPageTitle=expected_Title.getStringCellValue();
			 
			 System.out.println("The Expected OrangeHRM Application LogIn Page Title is:"+expected_OrangeHRMLogInPageTitle);
			 
			 String actual_OrangeHRMLogInPageTitle=driver.getTitle();
			 System.out.println("The Actual OrangeHRM Application Title is:"+actual_OrangeHRMLogInPageTitle);
			 
			 orangeHRMRowOfCell=orangeHRMRow.createCell(5);
			 orangeHRMRowOfCell.setCellValue(actual_OrangeHRMLogInPageTitle);
			 
			 if(actual_OrangeHRMLogInPageTitle.equalsIgnoreCase(expected_OrangeHRMLogInPageTitle))
			 {
				 System.out.println("Successfully Navigated to the OrangeHRM Application LogIn Page-PASS");
				 orangeHRMRowOfCell=orangeHRMRow.createCell(6);
				 orangeHRMRowOfCell.setCellValue("PASS");
				 
			 }
			 else
			 {
				 System.out.println("Failed to Navigate to the OrangeHRM Application LogIn Page-FAIL");
				 orangeHRMRowOfCell=orangeHRMRow.createCell(6);
				 orangeHRMRowOfCell.setCellValue("FAIL");
			 }		
			
			Cell userNameCell=orangeHRMRow.getCell(7);
			String LogIn_PageuserName=userNameCell.getStringCellValue();
			
			
			//<input name="txtUsername" id="txtUsername" type="text" fdprocessedid="v5xnu">
			By userNameProperty=By.id("txtUsername");
			WebElement userName=driver.findElement(userNameProperty);
			userName.sendKeys(LogIn_PageuserName);
			
			
			Cell passwordCell=orangeHRMRow.getCell(8);
			String logInPagePassword=passwordCell.getStringCellValue();
			
			//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password" fdprocessedid="pz20sc">
			
			By passwordProperty=By.id("txtPassword");
			WebElement password=driver.findElement(passwordProperty);
			password.sendKeys(logInPagePassword);
			
			//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN" fdprocessedid="fey5x">
			
			 By logInButtonProperty=By.id("btnLogin");
			 WebElement logInButton=driver.findElement(logInButtonProperty);
			 logInButton.click();
			 
			 Cell expected_Text=orangeHRMRow.getCell(9);
			 String expected_OrangeHRMApplicationHomeText=expected_Text.getStringCellValue();
			 
			 System.out.println("The Expected OrangeHRM Application Home Page Title is:"+expected_OrangeHRMApplicationHomeText);
			 
			//<a href="#" id="welcome" class="panelTrigger activated-welcome">Welcome Admin</a>
			 
			 By welComeAdminProperty=By.linkText("Welcome Admin");
			 WebElement welComeAdmin=driver.findElement(welComeAdminProperty);
			 
			 String actual_WelComeAdminText=welComeAdmin.getText();
			 System.out.println("The Actual OrangeHRM Application Home Page Title is:"+actual_WelComeAdminText);
			 
			 orangeHRMRowOfCell=orangeHRMRow.getCell(10);
			 orangeHRMRowOfCell.setCellValue(actual_WelComeAdminText);
			 
			 if(actual_WelComeAdminText.contains(expected_OrangeHRMApplicationHomeText))
			 {
				 System.out.println("Successfully Navigated to the OrangeHRM Application Home Page-TEXT FOUND--PASS");
				 orangeHRMRowOfCell=orangeHRMRow.createCell(11);
				 orangeHRMRowOfCell.setCellValue("PASS");
			 }
			 else
			 {
				 System.out.println("Failed to Navigate to the OrangeHRM Application Home Page-FAIL");
				 orangeHRMRowOfCell=orangeHRMRow.createCell(11);
				 orangeHRMRowOfCell.setCellValue("FAIL");
			 }
			 
			 //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewPimModule" id="menu_pim_viewPimModule" class="firstLevelMenu"><b>PIM</b></a>
			 
			 By pimProperty=By.id("menu_pim_viewPimModule");
			 WebElement pim=driver.findElement(pimProperty);
			 
			 Actions pimActions=new Actions(driver);
			 pimActions.moveToElement(pim).build().perform();
			 
			 //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/addEmployee" id="menu_pim_addEmployee">Add Employee</a>
			 
			 By pimAddEmployeeProperty=By.id("menu_pim_addEmployee");
			 WebElement pimAddEmployee=driver.findElement(pimAddEmployeeProperty);
			 pimAddEmployee.click();
	        int rowsCount=orangeHRMApplicationTestDataSheet.getLastRowNum();
			 
			 for(int rowIndex=1;rowIndex<=rowsCount;rowIndex++)
			 {
			
			 Cell addEmployeePageText=orangeHRMRow.getCell(12);
			 String expected_AddEmployeePageText=addEmployeePageText.getStringCellValue();
			 
			 System.out.println("The Expected OrangeHRM Application Add Employee Page Text:"+expected_AddEmployeePageText);
			 
			 //<label class="hasTopFieldHelp">Full Name</label>
			 
			 ///html/body/div[1]/div[3]/div/div[2]/form/fieldset/ol/li[1]/label
			 
			 By addEmployeetext=By.xpath("/html/body/div[1]/div[3]/div/div[2]/form/fieldset/ol/li[1]/label");
			 WebElement actual_AddEmployee=driver.findElement(addEmployeetext);
			 
			 String actual_AddEmployeeText=actual_AddEmployee.getText();
			 System.out.println("The Actual OrangeHRM Application Add Employee Page Text:"+actual_AddEmployeeText);
			 
			 orangeHRMRowOfCell=orangeHRMRow.createCell(13);
			 orangeHRMRowOfCell.setCellValue(actual_AddEmployeeText);
			 
			 if(actual_AddEmployeeText.equals(expected_AddEmployeePageText))
			 {
				 System.out.println("Successfully Navigated to OrangeHRM Application Add Employee Page-TEXT FOUND-PASS");
				 orangeHRMRowOfCell=orangeHRMRow.createCell(14);
				 orangeHRMRowOfCell.setCellValue("PASS");
				
			 }
				 else
				 {
					 System.out.println("Failed to Navigate to OrangeHRM Application Add Employee Page-TEXT NOT FOUND-PASS");
					 orangeHRMRowOfCell=orangeHRMRow.createCell(14);
					 orangeHRMRowOfCell.setCellValue("FAIL");
				 }
			  
				 orangeHRMApplicationTestDataSheet.getRow(rowsCount);
				 Cell f_name= orangeHRMRow.getCell(15);
				 String addEmployeeFirstName=f_name.getStringCellValue();
			 
				 
				 //<input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName" fdprocessedid="qa1prs">
			//  if(rowIndex=16;Rowindex<=LastRowOfCell;rowIndex++)
				 {
					 
				  
			  }
				 By addEmployee_FirstNameProperty=By.id("firstName");
				 WebElement addEmployee_FirstName=driver.findElement(addEmployee_FirstNameProperty);
				 addEmployee_FirstName.sendKeys(addEmployeeFirstName);
				 
				 Cell m_Name=orangeHRMRow.getCell(16);
				 String addEmployeeMiddleName=m_Name.getStringCellValue();
				 
				 //<input class="formInputText" maxlength="30" type="text" name="middleName" id="middleName" fdprocessedid="xj2d3r">
				 
				 By addEmployee_MiddleNameProperty=By.id("middleName");
				 WebElement addEmployee_MiddleName=driver.findElement(addEmployee_MiddleNameProperty);
				 addEmployee_MiddleName.sendKeys(addEmployeeMiddleName);
				 
				 Cell l_Name=orangeHRMRow.getCell(17);
				 String addEmployeeLastName=l_Name.getStringCellValue();
				 
				 //<input class="formInputText" maxlength="30" type="text" name="lastName" id="lastName" fdprocessedid="ef6z4p">
				 
				 By addEmployee_LastNameProperty=By.id("lastName");
				 WebElement addEmployee_LastName=driver.findElement(addEmployee_LastNameProperty);
				 addEmployee_LastName.sendKeys(addEmployeeLastName);
				 
				 Thread.sleep(5000);
				 
				 //<input type="button" class="" id="btnSave" value="Save" fdprocessedid="y4kyc">
				 
				 By saveButtonProperty=By.id("btnSave");
				 WebElement saveButton=driver.findElement(saveButtonProperty);
				 saveButton.click();
				 
				 for(int rowOfCellIndex=18;rowOfCellIndex<=rowIndex;rowOfCellIndex++)
				 {
					 
				 By employeeIDLocator=By.id("personal_txtEmployeeId");
				 WebElement employeeID=driver.findElement(employeeIDLocator);
				 String employeeID_Value=employeeID.getAttribute("value");
				 System.out.println("The Actual Employee ID is:"+employeeID_Value);
				 
				 orangeHRMRowOfCell=orangeHRMRow.createCell(rowOfCellIndex);
				 orangeHRMRowOfCell.setCellValue(employeeID_Value);	 
				 }
				 
				 //<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
				 
				 welComeAdminProperty=By.id("welcome");
				  welComeAdmin=driver.findElement(welComeAdminProperty);
				  welComeAdmin.click();
				  
				  Thread.sleep(3000);
				  
				  //<li><a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a></li>
				 
				  By logOutProperty=By.linkText("Logout");
				  WebElement logOut=driver.findElement(logOutProperty);
				  logOut.click();		  
			 }	
			
			orangeHRMApplicationLogInTestResultFile=new FileOutputStream("C:\\Users\\T Anusha\\Desktop\\SeleniumTest\\Web Testing\\src\\ExcelOperations\\AddEmployee_Multiple_Data.xlsx");
		orangeHRMApplicationWorkBook.write(orangeHRMApplicationLogInTestResultFile);
		}
	}

	


