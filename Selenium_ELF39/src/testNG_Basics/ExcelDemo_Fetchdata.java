package testNG_Basics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelDemo_Fetchdata {
	
	@Test
	public void FetchExcelData() throws IOException {
		String excelpath="./Testdata/TestData.xlsx";
		FileInputStream fis= new FileInputStream(excelpath);
		
		//create workbook for object class
		Workbook book=new XSSFWorkbook(fis);
		//Access sheet
		Sheet sheet=book.getSheet("Sheet1");

		int row_count=sheet.getPhysicalNumberOfRows();
		int col_count=sheet.getRow(0).getPhysicalNumberOfCells();
		
		System.out.println(row_count);
		System.out.println(col_count);
	}
}