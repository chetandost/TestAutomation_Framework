package Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert_BrowserStack {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.browserstack.com/users/sign_up");
		
		driver.findElement(By.id("bs-auth-input-fullname")).sendKeys("Sankalp");
		driver.findElement(By.id("bs-auth-input-email")).sendKeys("Sankalpsangapur@gmail.com");
		driver.findElement(By.id("bs-auth-input-password")).sendKeys("s@123456789");
		driver.findElement(By.id("tnc_checkbox")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Sign')]"));
		

	}

}
