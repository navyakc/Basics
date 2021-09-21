package dropdown;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@title='English (UK)']")).click();
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		WebElement ele = driver.findElement(By.id("month"));
		
		Select s=new Select(ele);
		s.selectByIndex(3);
		s.selectByValue("May");
		List<WebElement> op = s.getOptions();
		System.out.println(op.size());
		for(WebElement b:op)
		{
			String text = b.getText();
		
			System.out.println(text);
		}
driver.close();

	}

}
