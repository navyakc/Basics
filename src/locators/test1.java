package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")). sendKeys("abcd");
		driver.findElement(By.name("pass")). sendKeys("123456");
		driver.findElement(By.name("login")).click();

	}

}
