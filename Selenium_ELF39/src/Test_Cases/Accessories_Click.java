package Test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Framework_Utility.Base_Test;
import Framework_Utility.Utility_Methods;

public class Accessories_Click extends Base_Test{
	
	@Test
	public void Accessories() throws InterruptedException{
		
		WebElement mouse=driver.findElement(By.xpath("(//a[@href=\"/computers\"])[1]"));
		
		Actions action=new Actions(driver);
		action.moveToElement(mouse).build().perform();
		
	WebElement click_accessories=driver.findElement(By.xpath("(//a[@href=\"/accessories\"])[1]"));
	Utility_Methods.click_Element(click_accessories);
	
	}

}
