package testNG;

import org.testng.annotations.Test;

import genericUtility.BaseClass;

public class FirstTest extends BaseClass{
	@Test
	public void firstTest() {
		System.out.println("First 1 Test");
	}
	@Test
	public void firstTest2() {
		System.out.println("First 2 Test");
	}

}
