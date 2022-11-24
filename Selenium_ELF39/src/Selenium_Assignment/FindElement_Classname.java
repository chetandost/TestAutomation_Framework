package Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement_Classname {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver check=new ChromeDriver();
		
		check.navigate().to("https://demowebshop.tricentis.com/");
		check.manage().window().maximize();
		
		check.findElement(By.className("search-box-text")).sendKeys("Electronics");
		check.findElement(By.className("button-1")).click();
		 check.manage().window().ma
		
	}

}
