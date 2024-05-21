package com.WebTable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebTable_CapturingCompleWebTableData extends BaseTest {
	
	private Object Row;

	@Test
	public void capturingCompleWebTableData() throws IOException
	{

		  FileInputStream excelWebDataFile = new FileInputStream("C:\\Users\\T Anusha\\Desktop\\SeleniumTest\\Test\\src\\ExcelOperations\\Dateandtime.xlsx");
		  XSSFWorkbook workBook = new XSSFWorkbook(excelWebDataFile);
		  XSSFSheet testDataSheet = workBook.getSheet("Sheet1");

	for(int rowIndex=1;rowIndex<=36;rowIndex++)	
	{
		Row newRow=testDataSheet.createRow(rowIndex);
	
	for(int rowOfCellIndex=1;rowOfCellIndex<=8;rowOfCellIndex++)
	{
    	Cell newRowOfCell=newRow.createCell(rowOfCellIndex);
		
	By webTableDataProperty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+rowIndex+"]/td["+rowOfCellIndex+"]");
	WebElement webTableData=driver.findElement(webTableDataProperty);
	
	String webTableDataText=webTableData.getText();
	
	System.out.print(webTableDataText+" | ");
	newRowOfCell.setCellValue(webTableDataText);
    
	}
	System.out.println();
	}
	FileOutputStream WebDataFile1  = new FileOutputStream("C:\\Users\\T Anusha\\Desktop\\SeleniumTest\\Test\\src\\ExcelOperations\\Dateandtime.xlsx");
	workBook.write(WebDataFile1);



	}
}
