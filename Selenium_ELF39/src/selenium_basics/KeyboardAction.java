package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		//find Web element
		WebElement search=driver.findElement(By.id("small-searchterms"));
		
		Actions action=new Actions(driver);
		//action.moveToElement(search).click().sendKeys("Mobiles").perform();
		action.sendKeys(search, "Mobiles").perform();	
		Thread.sleep(2000);
		//to move page down
		action.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.PAGE_UP).perform();
		action.sendKeys(keys.)
		
		
		
	}

}
