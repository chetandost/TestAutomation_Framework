package Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_Xpath_register {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		//xpath keyvalue and attribute
	//	driver.findElement(By.xpath("//a[@class=\"ico-register\"]")).click();
		
		//linktext  using linktext method
		//driver.findElement(By.linkText("Log in")).click();
		
		//linktext using xpath
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		
}
}
