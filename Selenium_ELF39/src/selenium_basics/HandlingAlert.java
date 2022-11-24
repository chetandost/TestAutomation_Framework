package selenium_basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingAlert {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		WebElement double_click=driver.findElement(By.xpath("//button[contains(text(),Double)]"));
		
		Actions action= new Actions(driver);
		action.doubleClick(double_click).build().perform();
		
		//switiching to alert
		Alert ale=driver.switchTo().alert();
		ale.accept();		//Handling the Alert
		
	}

}
