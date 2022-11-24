package testNG_Basics;

import org.testng.annotations.Test;

public class Groups1_TestNG {
	
	@Test (groups = "smoketest",priority = 1)
	public void register() {
		System.out.println("Executing register TC");
	}
	
	@Test(groups = "smoketest",priority = 2)
	public void login() {
		System.out.println("Executing Login TC");
	}
	
	@Test(groups = "smoketest",priority = 4)
	public void search() {
		System.out.println("Executing search TC");
	}

	@Test
	public void wishlist() {
		System.out.println("Executing wishlist TC");
	}
	
	@Test
	public void advanceSearch() {
		System.out.println("Executing advancesearch TC");
		
	}
}