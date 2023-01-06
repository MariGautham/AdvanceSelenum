package mavenCMDPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterizationPractice {
	WebDriver driver;
	@Test
	public void VTigerLoginTest() {
		String browser=System.getProperty("browser");
		if(browser.equals("chrome")){
				WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
				
	}
	}
}
