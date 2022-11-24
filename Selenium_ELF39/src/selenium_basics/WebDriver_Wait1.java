package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriver_Wait1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		//creating an object of  WebdriverWait
		WebDriverWait wait=new WebDriverWait(driver,20);
		
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("ico-register"))));
	
	driver.findElement(By.className("ico-register")).click();
	driver.findElement(By.id("gender-male")).click();
	driver.findElement(By.id("FirstName")).sendKeys("Sankalp");
	driver.findElement(By.id("LastName")).sendKeys("Sangapu");
	driver.findElement(By.id("Email")).sendKeys("Sanky21z2@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("s@123456789");
	driver.findElement(By.id("ConfirmPassword")).sendKeys("s@123456789");
	driver.findElement(By.id("register-button")).click();
	
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@class='button-1 register-continue-button']"))));
	driver.findElement(By.xpath("//input[@class='button-1 register-continue-button']")).click();
	
	}
}