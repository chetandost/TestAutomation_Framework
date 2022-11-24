package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Absolute {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("file:///C:/Users/91779/Downloads/xpath1.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(/html/body/div[1]/input)[1]")).sendKeys("Sankalp");
		driver.findElement(By.xpath("/html/body/div[1]/input[2]")).sendKeys("Sangapur");
		driver.findElement(By.xpath("/html/body/div[2]/input[1]")).sendKeys("TestYantra");
		
	}

}
