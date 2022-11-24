package testNG_Basics;

import org.testng.annotations.Test;

public class DataProvider {
	
	
	@DataProvider(name = "testdata")
	public Object[][] testdata(){
		Object[][] data= new Object[5][2];	//object creation
		data[0][0]="Sankalp";	
		data[0][1]="Sangapur";
		data[1][0]="cc";
		data[1][1]="chetu";
		data[2][0]="soma";
		data[2][1]="omaa";
		data[3][0]="raja";
		data[3][1]="gowda";
		data[4][0]="kempi";
		data[4][1]="keerthana";
		
			return data;
	}
	
	@Test(dataProvider = "testdata")
	public void testdatademo(String Firstname,String lastname) {
		System.out.println(Firstname);
		System.out.println(lastname);
		
	}
	
	

}
