package Framework_Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility_Methods {
	
	static WebDriver driver;
	
	//utility method for sendkeys
	public static void Entervalue_In_Editfield(WebElement element,String value) {
		element.sendKeys(value);
	}
	
	
	
	//utility method for click
	public static void click_Element(WebElement element) {
	element.click();	
	}
	
	
	
	//Utility methods for Select class{
	public static void Select_by_index(WebElement element, String index) {
		Select options=new Select(element);	
		int a= Integer.parseInt(index);
		
		options.selectByIndex(a);
		
	}
	
	public static void select_by_visibleText(WebElement element, String value) {
		Select options=new Select(element);
		options.selectByVisibleText(value);
	}
	
	public static void select_by_value(WebElement element, String value) {
		Select options=new Select(element);
		options.selectByValue(value);
	}
	//}
	
	
	
	//test configuration
	public static String Test_configuration() throws IOException {
		String filepath="./Test_configuration/Testconfiguration.properties";
		FileInputStream fis= new FileInputStream(filepath);
		
		//creating object for property class
		Properties prop=new Properties();
		prop.load(fis);
		String url=prop.getProperty("url");
		
		return url;	
	}
	
	
	
	public static Object[][] getTestData(String sheetname) throws IOException {
	//filepath
	String excelpath="./Testdata/TestData.xlsx";
	FileInputStream fis= new FileInputStream(excelpath);
	
	//create workbook
	Workbook book=new XSSFWorkbook(fis);
	
	//acces sheet
	Sheet sheet=book.getSheet(sheetname);
	
	//get row and coloumn count
	int row_count=sheet.getPhysicalNumberOfRows();
	int col_count=sheet.getRow(0).getPhysicalNumberOfCells();
	
	
	Object[][] data=new Object[row_count-1][col_count];
	for(int row=1;row<=row_count-1;row++) {
		for (int col=0;col<=col_count-1;col++) {
			
			data[row-1][col]=sheet.getRow(row).getCell(col).getStringCellValue();
		}	
		//System.out.println();
		}
	book.close();
	return data;
	}
	
	
	//Action class
	public static Actions action(WebDriver driver, WebElement element) {
		Actions action =new Actions(driver);
		action.moveToElement(element).build().perform();
		return action;
	}

}