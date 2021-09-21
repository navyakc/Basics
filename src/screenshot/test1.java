package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//typecasting
		TakesScreenshot ts=(TakesScreenshot)driver; // import org.openqa.selenium.TakesScreenshot
		//access the method and photo is stored in RAM
		File src = ts.getScreenshotAs(OutputType.FILE);
		//specify the location
		File dest=new File("./photo/myntra.png");
		//copy paste from RAM to required loc
		FileUtils.copyFile(src, dest);//throws io exception
		
		driver.close();

	}

}
