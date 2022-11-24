package Test_Cases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Framework_Utility.Base_Test;
import Framework_Utility.Utility_Methods;

public class Advance_Search extends Base_Test{

	@DataProvider(name = "advancesearch")
	public Object[][] testadvancesearch() throws Throwable{
		Object[][]data=Utility_Methods.getTestData("AdvanceSearch");
		/*Object[][]data=new Object[1][5];
		data[0][0]="computers";
		data[0][1]="1000";
		data[0][2]="90000";
		data[0][3]=2;
		data[0][4]=1;*/
		return data;
	}
	
	@Test(dataProvider = "advancesearch")
	public void Advancesearch(String search,String range_from,String range_to,String a, String b) throws InterruptedException {
	WebElement send_searchkeys=driver.findElement(By.id("small-searchterms"));
	Utility_Methods.Entervalue_In_Editfield(send_searchkeys, search);
	
	WebElement click_search_button=driver.findElement(By.xpath("//input[@type=\"submit\"]"));
	Utility_Methods.click_Element(click_search_button);
	
	WebElement checkbox_click=driver.findElement(By.id("As"));
	Utility_Methods.click_Element(checkbox_click);
	
	//category dropdown
	WebElement dropdown= driver.findElement(By.xpath("//select[@id=\"Cid\"]"));
	Utility_Methods.Select_by_index(dropdown, a);

	
	WebElement checkbox_product_click=driver.findElement(By.id("Isc"));
	Utility_Methods.click_Element(checkbox_product_click);
	
	//manfacture dropdown
	Utility_Methods.Select_by_index(driver.findElement(By.xpath("//select[@id=\"Mid\"]")), b);
	
	Utility_Methods.Entervalue_In_Editfield(driver.findElement(By.xpath("//input[@id=\"Pf\"]")), range_from);
	Utility_Methods.Entervalue_In_Editfield(driver.findElement(By.xpath("//input[@id=\"Pt\"]")), range_to);
	
	Utility_Methods.click_Element(driver.findElement(By.xpath("(//input[@type=\"submit\"])[2]")));
	
	}
	

}


	/*@Test(dataProvider = "advancesearch")
	public void Advance(String search, String range_from, String range_to ) {
		driver.findElement(By.id("small-searchterms")).sendKeys(search);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		
		driver.findElement(By.id("As")).click();
		
		WebElement category=driver.findElement(By.id("Cid"));
		Select select= new Select(category);
		select.selectByIndex(3);
		
		driver.findElement(By.id("Isc")).click();
		
		WebElement manufacturer=driver.findElement(By.id("Mid"));
		Select select1=new Select(manufacturer);
		select1.selectByIndex(1);
		
		driver.findElement(By.xpath("(//input[@type=\"text\"])[4]")).sendKeys(range_from);
		driver.findElement(By.xpath("(//input[@type=\"text\"])[5]")).sendKeys(range_to);
		driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[3]")).click();
	}	*/