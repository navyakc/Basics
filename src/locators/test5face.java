package locators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test5face {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("ap_email")).sendKeys("9980015884");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("abcd");
		driver.findElement(By.id("signInSubmit")).click();
		String t = driver.getTitle();
		System.out.println(t);
		if(t.equals("Amazon Sign-In"))
			System.out.println("pass");
		else
			System.out.println("fail");
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
