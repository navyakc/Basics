package webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.name("q"));
		if(ele.isDisplayed())
		{
			ele.sendKeys("abcd");
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		Thread.sleep(3000);
		driver.close();
		}

	}

