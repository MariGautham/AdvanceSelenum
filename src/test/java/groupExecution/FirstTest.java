package groupExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTest {
	@Test(groups="smoke")
	public void firstBuildTestCase1() {
		Reporter.log("Test 1", true);
	}
	@Test(groups="sanity")
	public void firstBuildTestCase2() {
		Reporter.log(" Test Case2", true);
	}
	@Test(groups= {"system","smoke"})
	public void firstBuildTestcase() {
		Reporter.log("Test Case3", true);
	}
	

}
