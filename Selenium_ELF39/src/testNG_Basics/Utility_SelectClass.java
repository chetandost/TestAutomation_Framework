package testNG_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_Utility.Base_Test;
import Framework_Utility.Utility_Methods;

public class Utility_SelectClass extends Base_Test{
	
	@DataProvider(name = "advancesearch")
	public Object advancesearch() {
		Object [][] data=new Object[1][3];
		data[0][0]="Computers";
		data[0][1]="1000";
		data[0][2]="5000";
		
		return data;
		
	}
	
	@Test(dataProvider = "advancesearch")
	public void AdvanceSearch(String search, String range_from, String range_to) {
		WebElement send_searchkeys=driver.findElement(By.id("small-searchterms"));
		Utility_Methods.Entervalue_In_Editfield(send_searchkeys, search);
		
		
		WebElement click_search_button=driver.findElement(By.xpath("//input[@value='Search']"));	//.click();
		Utility_Methods.click_Element(click_search_button);
		
	
		WebElement chechbox_click=driver.findElement(By.id("As"));
		Utility_Methods.click_Element(chechbox_click);
		
		
		//WebElement category=driver.findElement(By.id("Cid"));
		//Select select= new Select(category);
		//select.selectByIndex(3);
		Utility_Methods.Select_Method("//select[@id=\"Cid\"]", 2);
		
		WebElement element=driver.findElement(By.id("Isc"));
		Utility_Methods.click_Element(element);		
		
		//WebElement manufacturer=driver.findElement(By.id("Mid"));
		//Select select1=new Select(manufacturer);
		//select1.selectByIndex(1);
		Utility_Methods.Select_Method("//select[@id=\"Mid\"]", 0);
		
	WebElement from_range=driver.findElement(By.xpath("(//input[@type=\"text\"])[4]"));
		Utility_Methods.Entervalue_In_Editfield(from_range, range_from);
		
		WebElement To_range=driver.findElement(By.xpath("(//input[@type=\"text\"])[5]"));
		Utility_Methods.Entervalue_In_Editfield(To_range, range_to);
		
		
		
		WebElement Clickfinal_search_button=driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[3]"));
		Utility_Methods.click_Element(Clickfinal_search_button)	;	
	}	
}
