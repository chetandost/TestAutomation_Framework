package selenium_basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class HandlingMultiple_Windows3 {
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Selenium/MultipleWindow.html");
		driver.manage().window().maximize();
		
		String parent_window=driver.getWindowHandle();
		System.out.println(parent_window);
				
		//identify the web element
	driver.findElement(By.cssSelector("input[value=\"Open Food Sites\"]")).click();
	
	Thread.sleep(2000);
	Set<String>total_window=driver.getWindowHandles();
	System.out.println(total_window);
	
	for(String child_window:total_window) {
		//Switch to childWindow
		driver.switchTo().window(child_window);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.close();
		
		
		//Thread.sleep(2000);
		//if(driver.getTitle().equalsIgnoreCase("NopCommerce - Home | Facebook")){
	
	}
	
		
	}

}
