package selenium_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Selenium/iframe.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		//identify the frame
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		//switch to main frame
	driver.switchTo().parentFrame();
	
	//in parent click on google
	//driver.switchTo().defaultContent();
	driver.findElement(By.linkText("Google")).click();
	
	}

}
