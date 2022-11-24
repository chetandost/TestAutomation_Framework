package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		//identify the Webelement on which to mouseover;
		WebElement electronics=driver.findElement(By.xpath("(//a[@href=\"/electronics\"])[1]"));
		
		//Creating a object for action class
	Actions action=new Actions(driver);
	action.moveToElement(electronics).build().perform();
	
		}
}