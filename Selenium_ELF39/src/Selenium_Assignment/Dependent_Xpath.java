package Selenium_Assignment;
//incomplete assignment
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dependent_Xpath {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href=\"/computers\"]")).click();
		driver.findElement(By.xpath("//img[@alt=\"Picture for category Desktops\"]")).click();
		driver.findElement(By.xpath("(//input[@type=\"button\"])[3]")).click();
		driver.findElement(By.xpath("//input[@id=\"add-to-cart-button-16\"]")).click();
		driver.findElement(By.xpath("(//input[@type=\"button\"])[3]/preceding-sibling::script/following-sibling::input")).click();
	
	}

}
