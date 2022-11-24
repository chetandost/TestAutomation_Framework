package selenium_basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultiple_Windows1 {
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		//make a note of parent window
		String parent_window=driver.getWindowHandle();
		System.out.println(parent_window);
		
		//identify the facebook link
		driver.findElement(By.xpath("//a[contains(text(),'Facebook')]")).click();
		Thread.sleep(2000);
		Set<String>total_window=driver.getWindowHandles();
		System.out.println(total_window);
		
		for(String child_window:total_window) {
			//System.out.println(child_window);
			
			//switch to child Window
			driver.switchTo().window(child_window);
			System.out.println(driver.getTitle());
			
			if(driver.getTitle().equalsIgnoreCase("NopCommerce - Home | Facebook")){
			driver.findElement(By.name("email")).sendKeys("Sankalp@gmail.com");
		Thread.sleep(2000);
		//closechild window
		driver.close();
		}
	}
	//close Parent Window
	driver.switchTo().window(parent_window);
	driver.close();
}
}
