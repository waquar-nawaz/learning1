package excelExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws Exception {
		
		
		FileInputStream fis = new FileInputStream(".\\testData\\RegistrationData.xlsx");
		
		
		
		//read data from xlsx file 
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		//indexing start from 0
//		workbook.getSheetAt(0);
		
		//Sheetname 
//		XSSFSheet sheet = workbook.getSheet("smokeTest");
		XSSFSheet sheet = workbook.getSheet("Student");
		
		
		
		int lastrowCount = sheet.getLastRowNum();
		int firstrowCount = sheet.getFirstRowNum();
		
		
		
		int rowCount = lastrowCount - firstrowCount;
		
		System.out.println("last rows: " + lastrowCount);
		System.out.println("first rows: " + firstrowCount);
		
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
