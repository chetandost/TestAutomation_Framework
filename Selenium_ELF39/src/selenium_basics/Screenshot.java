package selenium_basics;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;



public class Screenshot {

	public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Take screennshot
		TakesScreenshot tss=(TakesScreenshot)driver;
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		
		File ss =tss.getScreenshotAs(OutputType.FILE);
		
		File destination= new File("./screenshot/screenshot1.png");
		FileHandler.copy(ss, destination);
		
		driver.close();

	}

}
