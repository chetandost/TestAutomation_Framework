package testNG_Basics;

import org.testng.annotations.Test;

public class Groups2_testNG {
	
	@Test
	public void register() {
		System.out.println("Executing register TC");
	}
	
	@Test
	public void login() {
		System.out.println("Executing Login TC");
	}
	
	@Test
	public void search() {
		System.out.println("Executing search TC");
	}

	@Test
	public void addtocart() {
		System.out.println("Executing addtocart TC");
	}
	
	@Test(groups = "smoketest",priority = 3)
	public void searchbutton() {
		System.out.println("Executing searchbutton TC");
	}
	

}
