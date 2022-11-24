package Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_autoSuggestion_Demoworkshop {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).sendKeys("Compu");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id=\"ui-id-4\"]")).click();
		//driver.findElement(By.xpath("(//input[@type=\"button\"])[3]")).click();
}
}

