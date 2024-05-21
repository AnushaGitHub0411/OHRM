package MultipleValidations;

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

	public class Orange_HRM_Validations {

	public static void main(String[] args) throws IOException, InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\T Anusha\\Desktop\\SeleniumTest\\Test\\driverFiles\\chromedriver.exe");
	WebDriver driver;

	driver = new ChromeDriver();

	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";

	driver.get(applicationUrlAddress);


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

	By paaswordProperty=By.id("txtPassword");
	WebElement password=driver.findElement(paaswordProperty);
	password.sendKeys(passwordTestData);

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

	       By logoutProperty=By.linkText("Logout");
	WebElement logout=driver.findElement(logoutProperty);
	logout.click();


	System.out.println("Succesfully Navigate to OrangeHRM Application HomePage - PASS");
	Cell testDataSheetOfRowOfCell2=testDataSheetOfRow.createCell(2);
	testDataSheetOfRowOfCell2.setCellValue("Succesfully Navigate to OrangeHRM Application HomePage - PASS");

	}
	else
	{
	System.out.println("Failed To Navigate to OrangeHRM Application HomePage - FAIL");
	Cell testDataSheetOfRowOfCell3=testDataSheetOfRow.createCell(2);
	testDataSheetOfRowOfCell3.setCellValue("Failed To Navigate to OrangeHRM Application HomePage - FAIL");

	}

	FileOutputStream outPutFile = new FileOutputStream("C:\\Users\\T Anusha\\Desktop\\SeleniumTest\\Test\\src\\ExcelOperations\\OHRM_ResultTestData.xlsx");
	workBook.write(outPutFile);



	}


	}

	}



