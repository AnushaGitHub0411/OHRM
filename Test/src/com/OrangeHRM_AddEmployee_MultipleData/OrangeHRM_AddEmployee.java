package com.OrangeHRM_AddEmployee_MultipleData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_AddEmployee {
 public static void main(String[]args) throws IOException
 {
	 System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\T Anusha\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\ChromeDriver.exe");
	    ChromeDriver driver = new ChromeDriver();

	    String applicationUrlAddress="http://orangehrm.qedgetech.com/symfony/web/index.php/dashboard";
     driver.get(applicationUrlAddress);
     
     driver.manage().window().maximize();
     
     FileInputStream excelTestDataFile = new FileInputStream("C:\\Users\\T Anusha\\Desktop\\SeleniumTest\\Test\\src\\ExcelOperations\\AddEmployee_Multiple_Data.xlsx");
     XSSFWorkbook workBook = new XSSFWorkbook(excelTestDataFile);
     XSSFSheet testDataSheet = workBook.getSheet("Sheet1");
     
     Object [] [] data= new Object [testDataSheet.getLastRowNum()][testDataSheet.getRow(0).getLastCellNum()];
     for(int i=1;i<=3;i++) {
     	
     	for(int j=0;j<3;j++)
     	{
     		Row row=testDataSheet.createRow(i);
     		Cell rowOfCell=row.createCell(0);
     	  	rowOfCell.setCellValue("LOGIN Panel");
     		
     		By orangeHRMApplicationLogInPageLogInPanelTextProperty=By.id("logInPanelHeading");
     		WebElement orangeHRMApplicationLogInPageLogInPanel=driver.findElement(orangeHRMApplicationLogInPageLogInPanelTextProperty);

     		String actual_OrangeHRMApplicationLogInPageLogInPanelText=orangeHRMApplicationLogInPageLogInPanel.getText();
     		
     		Cell actual_LoginText=row.createCell(2);
     	actual_LoginText.setCellValue(actual_OrangeHRMApplicationLogInPageLogInPanelText);
     	String cell1=testDataSheet.getRow(i).getCell(0).getStringCellValue();
     	String cell2=testDataSheet.getRow(i).getCell(2).getStringCellValue();
     	
     		if(cell1==cell2) {
     			Cell result=row.createCell(3);
     			result.setCellValue("PASS");
     			
     		}
     		else {
     			Cell result=row.createCell(3);
     			result.setCellValue("FAIL");
     		}
     		Cell rowOfCell1=row.createCell(4);
     		rowOfCell1.setCellValue("OrangeHRM");
     		
     		String actual_orangeHRMApplicationTitleText=driver.getTitle();
     		Cell actual_LoginTitle=row.createCell(5);
     		actual_LoginTitle.setCellValue(actual_orangeHRMApplicationTitleText);
     		String cell3=testDataSheet.getRow(i).getCell(4).getStringCellValue();
	        	String cell4=testDataSheet.getRow(i).getCell(5).getStringCellValue();
	        	if(cell4==cell3) {
     			Cell result=row.createCell(6);
     			result.setCellValue("PASS");
     			
     		}
     	
     		else {
     			Cell result=row.createCell(6);
     			result.setCellValue("FAIL");
     		}
     	}
     			
     
     	
     	for(int rowIndex=1;rowIndex<=3;rowIndex++)
     	{
     		
     		Row row1=testDataSheet.createRow(rowIndex);
     		Cell rowOfCell11=row1.createCell(7);
     	  	rowOfCell11.setCellValue("Anusha");    		
     	}
     	for(int rowIndex=1;rowIndex<=3;rowIndex++)
     	{
     		
     		Row row1=testDataSheet.createRow(rowIndex);
     		Cell rowOfCell11=row1.createCell(8);
     	  	rowOfCell11.setCellValue("Anusha@04");    		
     	}
     	
     	
     	
     
	        	
     	
 	
     	
     	
     


     FileOutputStream outPutFile = new FileOutputStream("C:\\Users\\T Anusha\\Desktop\\SeleniumTest\\Test\\src\\ExcelOperations\\AddEmployee_Multiple_Data.xlsx");

		workBook.write(outPutFile);

	}

 }
}


