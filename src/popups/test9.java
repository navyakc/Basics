package popups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test9 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		System.out.println(child.size());
		String exp = "Tech Mahindra";
		
		for(String allwin:child)
		{
			driver.switchTo().window(allwin);
			String title = driver.getTitle();
			System.out.println(title);
			
			if(title.equals(exp))
			{
				driver.close();
		}
		}
		

	}

}
