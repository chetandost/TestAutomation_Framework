package selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_method {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		//launch the chrome browser
		WebDriver driver=new ChromeDriver();
		
		
		
		//navigate to Outlook
		driver.get("https://login.microsoftonline.com/common/oauth2/authorize?client_id=00000002-0000-0ff1-ce00-000000000000&redirect_uri=https%3a%2f%2foutlook.office.com%2fowa%2f&resource=00000002-0000-0ff1-ce00-000000000000&response_mode=form_post&response_type=code+id_token&scope=openid&msafed=1&msaredir=1&client-request-id=e0a0804f-3869-2229-025e-5dd62ab545de&protectedtoken=true&claims=%7b%22id_token%22%3a%7b%22xms_cc%22%3a%7b%22values%22%3a%5b%22CP1%22%5d%7d%7d%7d&nonce=638017704445669522.2c144697-3e95-4e98-8fea-f4b9087dc9fa&state=DctPC4IwGIDxWd-l23LOd3_eg3QQQsIuFhTetjlBaSgqRt--HX7P7UkIIcfoECUshiiZa5YpxQBASImC8zN3GYBERXOPgoJHTXXvDe3BItOqc9ibJL51On1Nelk3s_kiOy2-GxbvtudUmKphrrrL-od7925Wy3GpA4Y2fMb2IUbL2W5f19mWONtw232p_w");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	}

}
