package waitstatements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");

		 WebDriverWait wait=new WebDriverWait(driver, 10);
		 
		WebElement ele = driver.findElement(By.id("email"));
		 wait.until(ExpectedConditions.visibilityOf(ele)).sendKeys("Navya");

		driver.findElement(By.id("pass")).sendKeys("Sweet");
		 
		
		WebElement button = driver.findElement(By.name("login"));
		wait.until(ExpectedConditions.elementToBeClickable(button)).click(); 
		
		
		
		 String title = driver.getTitle();
		 System.out.println(title);
		 String url = driver.getCurrentUrl();
		 System.out.println(url);
		 
		 if(url.equals("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjI3OTc0NTk3LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D")) {
			 System.out.println("Pass: Login page is dispalyed");
		 }
		 else
		 {
			 System.out.println("Fail:login page is not dispalyed");
		 }
	}

}
