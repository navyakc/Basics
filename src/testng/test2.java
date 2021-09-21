package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test2 {
	@Test(priority=1)
	public void calls()
	{
		Reporter.log("calls",true);
	}
	
	@Test
	public void status()
	{
		Reporter.log("status",true);
	}
	
	@Test(priority=-1)
	public void chats()
	{
		Reporter.log("chats",true);
	}

}
