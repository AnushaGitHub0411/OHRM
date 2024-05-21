package oHRM_LoginFunctionality;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class OrangeHRMAppilicationLoginFunctionalityTest extends BaseTest {
	FileInputStream oHRMTestDataFile;
	XSSFWorkbook oHRMWorkBook;
	XSSFSheet oHRMTestDataSheet;

	@Test(priority = 1, description = "OHRM Appilication login Validation")
	public void orangrHRMAppilicationLOginFunctionalityTest() throws IOException {
		oHRMTestDataFile = new FileInputStream("./src/ExcelOperations/Orange_HRM_Test_Data2.xlsx");
		oHRMWorkBook = new XSSFWorkbook(oHRMTestDataFile);
		oHRMTestDataSheet = oHRMWorkBook.getSheet("LogInTestData");
		Row newRow = oHRMTestDataSheet.getRow(1);
		Cell rowOfCell = newRow.getCell(0);
		String Expected_LogInPageText = rowOfCell.getStringCellValue();
		System.out.println("The OHRM  expected LoginPage text is:" + Expected_LogInPageText);

		// <div id="logInPanelHeading">LOGIN Panel</div>

		By OHRMLoginPanelProperty = By.id("logInPanelHeading");

		WebElement OHRMLoginPanel = driver.findElement(OHRMLoginPanelProperty);
		String Actual_LogInPageText = OHRMLoginPanel.getText();
		System.out.println("The OHRM  Actual LoginPage text is:" + Actual_LogInPageText);

		Cell actual_Text = newRow.createCell(2);
		actual_Text.setCellValue(Actual_LogInPageText);
		if (Actual_LogInPageText.equals(Expected_LogInPageText)) {
			Cell LoginPanelTestResult = newRow.createCell(3);
			System.out.println(" Successfully navigated to OHRM Text Found -Pass");
			LoginPanelTestResult.setCellValue("pass");
		} else {
			Cell LoginPanelTestResult = newRow.createCell(3);
			System.out.println(" Failed to navigate to OHRM Text NotFound -Fail");
			LoginPanelTestResult.setCellValue("Fail");
		}
		Cell expected_OrangeHRMTitle = newRow.getCell(4);
		String Expected_OHRMTitle = expected_OrangeHRMTitle.getStringCellValue();
		System.out.println("The Expected Title of OrangEHRM login page Title is:" + Expected_OHRMTitle);
		String Actual_loginPageTitle = driver.getTitle();
		System.out.println("The Actual Title of OrangEHRM login page Title is:" + Actual_loginPageTitle);
		Cell actual_Title = newRow.createCell(5);
		actual_Title.setCellValue(Actual_loginPageTitle);
		if (Actual_loginPageTitle.equals(Expected_OHRMTitle)) {
			Cell TitleTestResult = newRow.createCell(6);
			System.out.println(" OHRM Title Matched:-Pass");
			TitleTestResult.setCellValue("Pass");
		} else {
			Cell TitleTestResult = newRow.createCell(6);
			System.out.println(" OHRM Title NotMatched:-Fail");
			TitleTestResult.setCellValue("Fail");

		}
		System.out.println();
		int RowCount = oHRMTestDataSheet.getLastRowNum();
		for (int rowIndex = 1; rowIndex < RowCount; rowIndex++) {
			Row row1 = oHRMTestDataSheet.getRow(rowIndex);

			Cell userNameDataCell = row1.getCell(7);
			String userNameTestData = userNameDataCell.getStringCellValue();

			Cell passwordDataCell = row1.getCell(8);
			String passwordTestData = passwordDataCell.getStringCellValue();

			// <input name="txtUsername" id="txtUsername" type="text"
			// fdprocessedid="xhgk9d">

			By userNameProperty = By.id("txtUsername");
			WebElement userName = driver.findElement(userNameProperty);
			userName.sendKeys(userNameTestData);

			// <input name="txtPassword" id="txtPassword" autocomplete="off" type="password"
			// fdprocessedid="sapxs">

			By passwordProperty = By.id("txtPassword");
			WebElement password = driver.findElement(passwordProperty);
			password.sendKeys(passwordTestData);

			// <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN"
			// fdprocessedid="g3xdzi">

			By logInButtonProperty = By.id("btnLogin");
			WebElement logInButton = driver.findElement(logInButtonProperty);
			logInButton.click();

			// <a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
			try {
				By welcomeAdminProperty = By.linkText("Welcome Admin");
				WebElement welcomeAdmin = driver.findElement(welcomeAdminProperty);

				String actualwelcomeAdminText = welcomeAdmin.getText();
				System.out.println(actualwelcomeAdminText);

				String expectedwelcomeAdminText = row1.getCell(9).getStringCellValue();
				row1.createCell(10).setCellValue(actualwelcomeAdminText);

				Cell homePageTestResult = row1.createCell(11);

				if (actualwelcomeAdminText.contains(expectedwelcomeAdminText)) {

					System.out.println("Successfully Navigated to orangeHrm Home Page:-Pass");

					homePageTestResult.setCellValue("Pass");

				}

				if (welcomeAdmin.isDisplayed()) {
					welcomeAdmin.click();
					Thread.sleep(1000);
					By logOutProperty = By.linkText("Logout");

					WebElement logOut = driver.findElement(logOutProperty);

					logOut.click();

				}
			}

			catch (Exception e) {
				Cell homePageTestResult1 = row1.createCell(11);
				homePageTestResult1.setCellValue("Fail");
				Row newRow1 = oHRMTestDataSheet.getRow(1);

				By invalidCredentialsProperty = By.id("spanMessage");

				WebElement invalidCredentials = driver.findElement(invalidCredentialsProperty);

				String actualinvalidCredentials = invalidCredentials.getText();

				String expecteddataOfLoginInvalid = newRow1.getCell(1).getStringCellValue();

				if (actualinvalidCredentials.equals(expecteddataOfLoginInvalid)) {
					System.out.println("Failed To login Because of invalid Credentials:-Fail");


				}

			}
		}
		FileOutputStream oHRMTestResultFile = new FileOutputStream(
				"./src/ExcelOperationResults/Orange_HRM_TestResult_Data2.xlsx");
		oHRMWorkBook.write(oHRMTestResultFile);

	}

}