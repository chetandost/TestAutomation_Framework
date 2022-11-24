package Selenium_Assignment;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingAlert_guru99 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement right_click=driver.findElement(By.xpath("//span[contains(text(),'right')]"));

		Actions action=new Actions(driver);
		
		
		List <WebElement> list_webelements=driver.findElements(By.xpath("//ul[contains(@class,\"context-menu-list context-menu-root\")]/li/span"));
		for(int i=0;i<list_webelements.size()-1;i++) {
			action.contextClick(right_click).build().perform();
			list_webelements.get(i).click();
			Thread.sleep(2000);
			
			Alert ale=driver.switchTo().alert();
			ale.accept();
			
		}
	}
}
