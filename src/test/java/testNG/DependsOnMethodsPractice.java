package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodsPractice {
	@Test
	public void test1() {
		Reporter.log("Test 1", true);
	}
	@Test(dependsOnMethods="test1")
	public void test2() {
		Reporter.log("Test 2", true);
	}
	@Test(dependsOnMethods= {"test1", "test2"})
	public void test3() {
		Reporter.log("Test 3", true);
	}
	@Test(dependsOnMethods= {"test2", "test3"})
	public void test4() {
		Reporter.log("Test 4", true);
	}

}
