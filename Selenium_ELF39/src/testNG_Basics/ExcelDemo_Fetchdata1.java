package testNG_Basics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelDemo_Fetchdata1 {
	
	@Test
	public void fetchdata() throws IOException {
	String excelpath="./Testdata/TestData.xlsx";
	FileInputStream fis= new FileInputStream(excelpath);
	
	//create workbook
	Workbook book=new XSSFWorkbook(fis);
	
	//acces sheet
	Sheet sheet=book.getSheet("Sheet1");
	
	//get row and coloumn count
	int row_count=sheet.getPhysicalNumberOfRows();
	int col_count=sheet.getRow(0).getPhysicalNumberOfCells();
	
	
	Object[][] data=new Object[row_count-1][col_count];
	for(int row=1;row<=row_count-1;row++) {
		for (int col=0;col<=col_count-1;col++) {
			
			data[row-1][col]=sheet.getRow(row).getCell(col).getStringCellValue();
		}	
		System.out.println();
		}
	
	/*//print the value present in data object
	for(int i=0;i<=data.length-1;i++) {
		for(int j=0;j<=data[i].length-1;j++) {
		System.out.println(data[i][j]);
		}	
	}*/
	
	
	}

}