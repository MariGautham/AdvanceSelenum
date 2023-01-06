package groupExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SecondTest {
	@Test(groups="sanity")
	public void secondBuildTestcase1() {
		Reporter.log("Test case 4", true);
	}
	@Test(groups="system")
	public void secondBuildTestcase2() {
		Reporter.log("Test Case 5", true);
	}
	@Test(groups= {"sanity","system"})
	public void secondBuildTestcase3() {
		Reporter.log("Test case 6", true);
	}

}


