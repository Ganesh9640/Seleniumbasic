package screenShotMethod;

import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AsScreenShotWebElement {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       
       driver.get("https://www.irctc.co.in/nget/train-search");
       
      String timestamp=LocalDateTime.now().toString().replace(':','-');
      TakesScreenshot tsc=(TakesScreenshot)driver;
      File tempfile = tsc.getScreenshotAs(OutputType.FILE);
      File perfile = new File("./screenshot/"+timestamp+"irct.png");
      FileUtils.copyFile(tempfile, perfile);
      driver.manage().window().minimize();
      driver.quit();
      
      
      
	}
	

}
