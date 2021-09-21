package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://twitter.com/login");
		Thread.sleep(6000);
		driver.findElement(By.name("session[username_or_email]")).sendKeys("NavyaKaveri");
		driver.findElement(By.name("session[password]")).sendKeys("Krithish1!");
		driver.findElement(By.xpath("(//div[@dir='auto'])[5]")).click();
		Thread.sleep(6000);
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.close();
		if(title.equals("(17) Home / Twitter"))
			System.out.println("pass");
		else
			System.out.println("fail");
		
		
				
		

	}

}
