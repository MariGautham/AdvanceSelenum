package genericUtility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerImplementation implements ITestListener {
	

	public void onTestStart(ITestResult result) {
		System.out.println("Test start");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test sucess");
	}


	public void onTestFailure(ITestResult result) {
		System.out.println("Test failure");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("test skipped");
	}

	public void onStart(ITestContext context) {
		System.out.println("On start");
	}

	public void onFinish(ITestContext context) {
		System.out.println("On finish");;
	}

}
