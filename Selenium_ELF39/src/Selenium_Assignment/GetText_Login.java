package Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText_Login {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("Sankalpsangapur6@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("S@7795224447");
		driver.findElement(By.cssSelector("input[value=\"Log in\"]")).click();
		
		String Excepted="Sankalpsangapur6@gmail.com";
		
		String Actual=driver.findElement(By.className("account")).getText();
		if(Excepted.equalsIgnoreCase(Actual)) {
			System.out.println("Succesfully Logined");
		}
		
		else {
			System.out.println("login unsuccesful");
		}
}
}