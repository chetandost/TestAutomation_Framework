package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndToEnd_Register {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Sankalp");
		driver.findElement(By.name("LastName")).sendKeys("Sangapur");
		driver.findElement(By.id("Email")).sendKeys("Sankalpsangapur9@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("S@7795224447");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("S@7795224447");
		driver.findElement(By.className("button-1 register-next-step-button")).click();
		
	}

}
