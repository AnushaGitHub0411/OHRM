package LoginFunctionality_OHRM;
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


public class Multiple_test_data {
	public static void main(String[]args)throws IOException, InterruptedException{

	WebDriver driver;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";


	System.setProperty("webdriver.chrome.driver", "C:\\Users\\T Anusha\\Desktop\\SeleniumTest\\Test\\driverFiles\\chromedriver.exe");
	//WebDriver driver = new ChromeDriver();
	driver = new ChromeDriver();

	driver.get(applicationUrlAddress);
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
	FileOutputStream testResultFile = new FileOutputStream("C:\\Users\\T Anusha\\Desktop\\SeleniumTest\\Test\\src\\ExcelOperations\\OHRM_LogInTestData.xlsx");
	workBook.write(testResultFile);
	
	driver.quit();

	}

	}
