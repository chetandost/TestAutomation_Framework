package Test_Cases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_Utility.Base_Test;
import Framework_Utility.Utility_Methods;

public class Search_TC3 extends Base_Test{	
	
	@DataProvider(name="search")
	public Object[][] testsearch() throws IOException{
		Object[][] data=Utility_Methods.getTestData("Search");
		//data[0][0]="Computers";
		
		return data;	
	}

	
	@Test(dataProvider = "search")
	public void TC3(String search){
		//Test case						
		WebElement search_textfield=driver.findElement(By.id("small-searchterms"));//test Steps.
		Utility_Methods.Entervalue_In_Editfield(search_textfield, search);//test Steps
		
		
		WebElement search_click=driver.findElement(By.xpath("//input[@type=\"submit\"]"));	//test Steps
		Utility_Methods.click_Element(search_click);
	}

}