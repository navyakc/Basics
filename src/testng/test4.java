package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test4 {
	
	@Test(priority=1,enabled=false)
	public void calls()
	{
		Reporter.log("calls",true);
	}
	
	@Test(priority=-1,invocationCount=3)
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
