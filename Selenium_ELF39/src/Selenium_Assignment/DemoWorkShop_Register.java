package Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWorkShop_Register {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver check=new ChromeDriver();
		
		check.navigate().to("https://demowebshop.tricentis.com/");
		check.manage().window().maximize();
		
		check.findElement(By.linkText("Register")).click();					//by linktext
		check.findElement(By.id("FirstName")).sendKeys("Sankalp");	  		//by id
		check.findElement(By.name("LastName")).sendKeys("Sangapur");		//by name
		check.findElement(By.name("Email")).sendKeys("Sankalpsangapur9@gmail.com");	// by id
		check.findElement(By.id("Password")).sendKeys("helloSankalp");				
		check.findElement(By.id("ConfirmPassword")).sendKeys("helloSankalp");	
	}
	}