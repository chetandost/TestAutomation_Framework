package testNG_Basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class chronologicalConfiguration_Annotations {
	
	@Test
	void wine() {
		System.out.println("Welcome to Wineshop");
	}

	@Test
	void continentalGT() {
		System.out.println("Welcome to ride");
	}
	
		@BeforeSuite
		void beforesuit() {
			System.out.println("executing before suit");
		}
		
		@BeforeTest
		public void beforetest(){
			System.out.println("Executing before test");	
		}
		
		@BeforeClass
		public void beforeclass() {
			System.out.println("Executing before class");
		}
		@BeforeMethod
		void beforemethod() {
			System.out.println("Executing before method");
		}
		
		
		@AfterMethod
		void aftermethod() {
			System.out.println("Executing after method");
		}

		@AfterClass
		void afterclass() {
			System.out.println("Executing after class");
		}
		
		@AfterTest
		public void aftertest() {
			System.out.println("Executing aftertest");
		}

		@AfterSuite
		public void aftersuit() {
			System.out.println("Executing after suit");
		}

	}

