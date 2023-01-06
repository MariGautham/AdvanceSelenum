package listeners;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
@Listeners(genericUtility.ListnerImplementation.class)
public class ListenersPracticeWithAnnotation extends BaseClass{
	@Test
	
	public void demo() {
		Reporter.log("@Test method", true);
		
	}
	

}
