package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		
		driver.findElement(By.xpath("//a[text()='login']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.id("userName")).sendKeys("12345");
		driver.findElement(By.id("close-pop")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.id("inputValEnter")).sendKeys("Computer");

	}

}
