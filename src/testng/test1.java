package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test1 {
	
	@Test
	public void demo()
	{
		Reporter.log("Hello java",true);//import reporter from testng
		Reporter.log("Hi",false);
	}

}
