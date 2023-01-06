package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledPractice {
	@Test
	public void a() {
		Reporter.log("Test 1", true);
		
	}
	@Test(enabled=false)
	public void b() {
		Reporter.log("Test 2", true);
		
	}
	@Test(enabled=false)
	public void c() {
		Reporter.log("Test 3", true);
		
	}
	@Test
	public void d() {
		Reporter.log("Test 4", true);
		
	}

}
