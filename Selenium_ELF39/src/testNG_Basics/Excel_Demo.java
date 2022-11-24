package testNG_Basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel_Demo {
	
	@Test
	public void FetchExcel_value() throws IOException {
		String filepath="./Test_Data/TestData.xlsx";
		
		FileInputStream fis= new FileInputStream(filepath);
		
		//creating object for excel file
		Workbook book=new XSSFWorkbook(fis);	//upcast
		
		//Access the sheet
		Sheet sheet = book.getSheet("sheet1");
		
		//access row count and cellcount
		int row_count=sheet.getPhysicalNumberOfRows();
		int col_count=sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(row_count);
		System.out.println(col_count);
		
		
		/*//access the row and cell
		String value=sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);
		System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
		System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
		*/
		
		
	
		
		
		
	}

}
