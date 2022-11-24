package selenium_basics;

import java.util.Set;

import org.apache.xpath.operations.Equals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultiple_Windows4 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Selenium/MultipleWindow.html");
		driver.manage().window().maximize();
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		
		driver.findElement(By.cssSelector("input[value=\"Open Food Sites\"]")).click();
		Thread.sleep(2000);
		Set<String> total=driver.getWindowHandles();
		System.out.println(total);
		
		for(String child:total) {
			driver.switchTo().window(child);
			Thread.sleep(2000);
			System.out.println(driver.getTitle());
			
			if (driver.getTitle().equalsIgnoreCase("Olive Garden Italian Restaurant | Family Style Dining | Italian Food")){
				driver.close();
			}
			
			
		}
	}

}
