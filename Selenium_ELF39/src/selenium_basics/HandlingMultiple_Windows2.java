package selenium_basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultiple_Windows2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		//make a note of parent class
		String parent_window=driver.getWindowHandle();
		System.out.println(parent_window);
		
		//identify webelement
		driver.findElement(By.xpath("//a[contains(text(),'Facebook')]")).click();
		Thread.sleep(2000);
		
		Set<String>total_window=driver.getWindowHandles();
		System.out.println(total_window);
		
		for(String child_window:total_window) {
			//Switch to childWindow
			driver.switchTo().window(child_window);
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			if(driver.getTitle().equalsIgnoreCase("NopCommerce - Home | Facebook")){
			
			//closechild window
			driver.close();
			}
		}
		
		//identify search element in parent page
		driver.switchTo().window(parent_window);
		driver.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("Mobiles");
		Thread.sleep(2000);
		driver.close();
	}		
	}