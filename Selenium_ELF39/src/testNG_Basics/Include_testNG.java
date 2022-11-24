package testNG_Basics;

import org.testng.annotations.Test;

public class Include_testNG {

	@Test
	public void register() {
		System.out.println("Executing register TC");
	}
	
	@Test
	public void login() {
		System.out.println("Executing login TC");
	}
	
	@Test 
	public void search() {
		System.out.println("executing search TC");
	}
	
	@Test
	public void  logout() {
		System.out.println("Executing logout TC");
	}
	
}
