package groupExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ThirdTest {
	@Test(groups="smoke")
	public void thirdBuildTestcase1() {
		Reporter.log("Test Case7", true);
	}
	@Test(groups= {"system","sanity"})
	public void thirdBuildTestcase2() {
		Reporter.log("Test Case8", true);
	}

	@Test
	public void thirdBuildTestcase3() {
		Reporter.log("Test Case9", true);
	}


}


