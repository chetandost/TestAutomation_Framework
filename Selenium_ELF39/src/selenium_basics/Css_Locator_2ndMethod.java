package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Locator_2ndMethod {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".ico-register")).click();
		driver.findElement(By.cssSelector(".search-box-text.ui-autocomplete-input")).sendKeys("Computer");
		driver.findElement(By.cssSelector(".button-1.search-box-button")).click();
		
}
}
