package testNG_Basics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertyFile {
	
	@Test
	public void propertydemo() throws IOException {
		
		String filepath="./Test_configuration/Testconfiguration.properties";
		FileInputStream fis= new FileInputStream(filepath);
		
		//creating an object for property class
		Properties prop=new Properties();
		prop.load(fis);
		System.out.println(prop.get("firstname"));
		System.out.println(prop.get("lastname"));
			
	}

}