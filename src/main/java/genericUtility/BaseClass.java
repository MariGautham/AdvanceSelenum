package genericUtility;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	@BeforeSuite
	public void suiteSetup() {
		System.out.println("Suite Setup");
	}
	@BeforeTest
	public void testSetup() {
		System.out.println("Test Setup");
	}
	@BeforeClass
	public void classSetup() {
		System.out.println("Class Setup");
	}
	@BeforeMethod
	public void methodSetup() {
		System.out.println("Method Setup");
	}
	@AfterMethod
	public void methodTeardown() {
		System.out.println("Method Teardown");
	}
	@AfterClass
	public void classTeardown() {
		System.out.println("Class Teardown");
	}
	@AfterTest
	public void testTeardown() {
		System.out.println("Test Teardown");
	}
	@AfterSuite
	public void suiteTeardown() {
		System.out.println("Suite Teardwon");
	}
	
}
