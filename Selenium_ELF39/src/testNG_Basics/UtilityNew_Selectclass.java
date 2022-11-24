package testNG_Basics;

import org.apache.bcel.classfile.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_Utility.Base_Test;
import Framework_Utility.Utility_Methods;

public class UtilityNew_Selectclass extends Base_Test{
	
	
	@DataProvider(name="advancesearch")
	public Object Advancesearchoption() {
		Object[][] data=new Object[1][3];
		data[0][0]="computers";
		data[0][1]="1000";
		data[0][2]="5000";
		
		return data;
	}
	
	@Test(dataProvider = "advancesearch")
	public void Advancesearch(String search,String range_from,String range_to) throws InterruptedException {
	WebElement send_searchkeys=driver.findElement(By.id("small-searchterms"));
	Utility_Methods.Entervalue_In_Editfield(send_searchkeys, search);
	
	WebElement click_search_button=driver.findElement(By.xpath("//input[@type=\"submit\"]"));
	Utility_Methods.click_Element(click_search_button);
	
	WebElement checkbox_click=driver.findElement(By.id("As"));
	Utility_Methods.click_Element(checkbox_click);
	
	WebElement dropdown= driver.findElement(By.xpath("//select[@id=\"Cid\"]"));
	Utility_Methods.Select_by_index(dropdown, 1);
	
	WebElement checkbox_product_click=driver.findElement(By.id("Isc"));
	Utility_Methods.click_Element(checkbox_product_click);
	
	Utility_Methods.Select_by_index(driver.findElement(By.xpath("//select[@id=\"Mid\"]")), 1);
	
	Utility_Methods.Entervalue_In_Editfield(driver.findElement(By.xpath("//input[@id=\"Pf\"]")), range_from);
	Utility_Methods.Entervalue_In_Editfield(driver.findElement(By.xpath("//input[@id=\"Pt\"]")), range_to);
	
	Utility_Methods.click_Element(driver.findElement(By.xpath("(//input[@type=\"submit\"])[2]")));
	
	}

	
}
