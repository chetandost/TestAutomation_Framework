package testNG_Basics;

import org.testng.annotations.Test;

public class DependsOnMethod_tstng {
	
	@Test(dependsOnMethods = "register")
	public void logindemoworkshop() {
		System.out.println("Executing demoworkshop  TC");
	}
	
	@Test
	public void register() {
		System.out.println("Executing register TC");
	}
	
	@Test(dependsOnMethods = "register")
	public void login() {
		System.out.println("Executing login TC");
	}
	
	@Test(dependsOnMethods = "login")
	public void search() {
		System.out.println("Executing search TC");
	}

	@Test(dependsOnMethods = "addtocart")
	public void wishlist() {
		System.out.println("Executing wishlist TC");
	}
	
	@Test(dependsOnMethods = "wishlist")
	public void logout() {
		System.out.println("Executing logout TC");
	}
	
	@Test(dependsOnMethods = "search")
	public void addtocart() {
		System.out.println("Executing addtocart TC");
	}

}


