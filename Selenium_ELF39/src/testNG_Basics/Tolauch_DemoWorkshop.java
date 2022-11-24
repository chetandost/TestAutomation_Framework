package testNG_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tolauch_DemoWorkshop {
	
	@Test
	void Demo(){
		//test case
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("small-searchterms")).sendKeys("Mobiles");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		driver.quit();
	}
}