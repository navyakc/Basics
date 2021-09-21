package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.id("course")).click();
		driver.findElement(By.xpath("(//a[text()='Selenium Training'])[2]")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Alert ele = driver.switchTo().alert();
		System.out.println(ele.getText());
		ele.dismiss();
		

	}

}
