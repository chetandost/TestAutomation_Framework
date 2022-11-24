package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext_Method {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		//gettext method-register
		String text_valuedriver=driver.findElement(By.linkText("Register")).getText();
		System.out.println(text_valuedriver);
		
		//gettext method-Login
		String Login_Text=driver.findElement(By.linkText("Log in")).getText();
		System.out.println(Login_Text);
		
		//gettext method-ShoppingCart
		String Shopping_Cart=driver.findElement(By.className("cart-label")).getText();
		System.out.println(Shopping_Cart);
	
		//gettext method-Wishlist
		String Wishlist=driver.findElement(By.linkText("Wishlist")).getText();
		System.out.println(Wishlist);
		
		//gettext method-books
		String Books_driver=driver.findElement(By.linkText("Books")).getText();
		System.out.println(Books_driver);
	}

}
