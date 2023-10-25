package excelExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel2 {

	public static void main(String[] args) throws Exception {
		
		
		FileInputStream fis = new FileInputStream(".\\testData\\RegisterStudent.xls");
		
		
		
		//read data from xlsx file 
		
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		
		//indexing start from 0
//		workbook.getSheetAt(0);
		
		//Sheetname 
//		XSSFSheet sheet = workbook.getSheet("smokeTest");
		HSSFSheet sheet = workbook.getSheet("Student");
		
		
		
		int rowCount = sheet.getLastRowNum();
		
		int columnsCount = sheet.getRow(0).getLastCellNum();
		
		
		System.out.println("Rows Count: " + rowCount);
		System.out.println("Colum Count: " + columnsCount);
		
		
		
		
		
		
		for (int i = 1; i <= rowCount; i++) {
			
			
			String fName = sheet.getRow(i).getCell(0).toString();
			String address = sheet.getRow(i).getCell(4).toString();
			
			System.out.println("--------------------------------------------------");
			System.out.println("Details are: " + fName + " : " + address);
			
			
			
		}
		
		
		
		

	}

}
