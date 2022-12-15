package practice_1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgClass {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite Method");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test tagname Method");
	}
	
		@BeforeClass
		public void beforeclass() {
			System.out.println("Before class Method");
		}
		@BeforeMethod
		public void beforemethod() {
			System.out.println("Before  Method");
		}
		@Test
		public void test() {
			System.out.println("Test Annotation");
		}
		@Test
		public void test1() {
			System.out.println("Test1 Annotation");
		}
		@Test
		public void test2() {
			System.out.println("Test2 Annotation");
		}
		@AfterSuite
		public void afterSuite() {
			System.out.println("After Suite Method");
		}
		@AfterTest
		public void afterTest() {
			System.out.println("After Test tagname Method");
		}
		
			@AfterClass
			public void afterclass() {
				System.out.println("After class Method");
			}
			@AfterMethod
			public void aftermethod() {
				System.out.println("After  Method");
			}

	}



