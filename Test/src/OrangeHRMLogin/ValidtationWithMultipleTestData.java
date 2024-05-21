package OrangeHRMLogin;
	import org.apache.poi.ss.usermodel.*;

	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	import org.openqa.selenium.By;

	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.chrome.ChromeDriver;

	import java.io.FileInputStream;

	import java.io.FileOutputStream;

	import java.io.IOException;

	public class ValidtationWithMultipleTestData
	{

	public static void main(String[] args) throws InterruptedException {

	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();
	

	try {

	FileInputStream fis = new FileInputStream("\"C:\\Users\\T Anusha\\Desktop\\Book10.xlsx\"");

	Workbook workbook = new XSSFWorkbook(fis);

	Sheet sheet workbook.getSheetAt(0);

	for (int i = 1; i <= sheet.getLastRowNum(); i++) {

	Row row sheet.getRow(i);

	String username row.getCell(0).getStringCellValue();

	String password = row.getCell(1).getStringCellValue();

	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); Thread.sleep(5000);

	driver.findElement(By.name("username")).sendKeys(username); driver.findElement(By.name("password")).sendKeys (password);

	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click(); Thread.sleep(3000);

	// Check if login is successful

	if (driver.getCurrentUrl().contains("dashboard")) {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/i")).click();

		driver.findElement(By.xpath("//*[text()='Logout']")).click();

		row.createCell(2).setCellValue("Valid");

		System.out.println("Wrote");

		} else {

		row.createCell(2).setCellValue("Invalid");

		System.out.println("Wrote Invalid");

		}

		FileOutputStream fos = new FileOutputStream("\"C:\\Users\\T Anusha\\Desktop\\Book10.xlsx\" ");

		workbook.write(fos);

		fos.close();

		}

		driver.quit();

		} catch (IOException e) {
			e.printStackTrace();

		}

		}

		
		}

	




