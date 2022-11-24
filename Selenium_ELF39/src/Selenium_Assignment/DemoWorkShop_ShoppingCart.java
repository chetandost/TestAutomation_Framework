package Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWorkShop_ShoppingCart {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver check=new ChromeDriver();
		
		check.get("https://demowebshop.tricentis.com/");
		check.manage().window().maximize();
		check.findElement(By.partialLinkText("Shopping")).click();
	}
}