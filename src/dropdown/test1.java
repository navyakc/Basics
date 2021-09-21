package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.name("url"));
		
	Select s=new Select(ele);// for select import selenium one
	s.selectByIndex(3);
	s.selectByValue("search-alias=baby-products-intl-ship");
	s.selectByVisibleText("Computers");
	List<WebElement> op = s.getOptions(); //display list of drop down list
	System.out.println(op.size());
	for(WebElement b:op)
	{
		System.out.println(b.getText());
	}
	}
}
