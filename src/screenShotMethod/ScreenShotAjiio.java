package screenShotMethod;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotAjiio {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       String timestamp = LocalDateTime.now().toString().replace(':', '-');
       driver.get("https://www.ajio.com/");
      TakesScreenshot tsc=(TakesScreenshot)driver;
      File temfile=tsc.getScreenshotAs(OutputType.FILE);
      File perfile=new File("./screenshots/"+timestamp+"ajiio.png");
      FileUtils.copyFile(temfile, perfile);
      driver.manage().window().minimize();
      driver.quit();
       
       
	}

}
