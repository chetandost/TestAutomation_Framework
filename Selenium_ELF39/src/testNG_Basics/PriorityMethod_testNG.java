package testNG_Basics;
import org.testng.annotations.Test;

public class PriorityMethod_testNG {
	
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
	public void addtocart() {
		System.out.println("Executing addtocart TC");
	}

	@Test(priority = 5)
	public void wishlist() {
		System.out.println("Executing wishlist");
	}
	
	@Test(priority = 6)
	public void logout() {
		System.out.println("Executing logout TC");
	}
}
