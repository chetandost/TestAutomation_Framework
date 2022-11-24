package Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Attribute {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		String Attribute=driver.findElement(By.linkText("Shopping cart")).getAttribute("class");
		System.out.println(Attribute);
		
		driver.findElement(By.className("ico-register")).click();
		
		String Attribute_1= driver.findElement(By.id("FirstName")).getAttribute("name");
		System.out.println(Attribute_1);
		

		
}
}
