package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDoubleClick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		//Identify the web element which i have to doubleclick
		WebElement dbl_click=driver.findElement(By.xpath("//button[@ondblclick=\"myFunction()\"]"));
		//create an object for action class
		Actions action=new Actions(driver);
		action.doubleClick(dbl_click).build().perform();
		
		
	}
}