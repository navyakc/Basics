package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement e = driver.findElement(By.id("course"));
		Actions a=new Actions(driver);
		a.moveToElement(e).perform();
driver.findElement(By.xpath("(//a[text()='Selenium Training'])[2]")).click();
		WebElement ele = driver.findElement(By.id("add"));
		
		a.doubleClick(ele).perform();

	}

}
