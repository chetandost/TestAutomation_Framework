package testNG_Basics;

import org.testng.annotations.Test;

public class Exclude_testNG {
	
	@Test(priority = 1)
	public void register() {
		System.out.println("Executing register TC");
	}
	
	@Test(priority = 2)
	public void login() {
		System.out.println("Executing Login TC");
	}
	
	@Test(priority = 3)
	public void search() {
		System.out.println("Executing search TC");
	}
	
	@Test(priority = 4)
	public void logout() {
		System.out.println("executing logout TC");
	}

}
