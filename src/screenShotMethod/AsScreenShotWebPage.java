package screenShotMethod;

import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AsScreenShotWebPage {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
String timestamp = LocalDateTime.now().toString().replace(':', '-');
driver.get("https://www.irctc.co.in/nget/train-search");
TakesScreenshot tsc=(TakesScreenshot)driver;
File terfile=tsc.getScreenshotAs(OutputType.FILE);
//File Absolute = Screentb.getAbsoluteFile();
//System.out.println(Absolute);
//Thread.sleep(60000);
//  ./ indicates the current location
File perfile=new File("./screenshots/"+timestamp+"irctcwebpage.png");
 FileUtils.copyFile(terfile, perfile);
driver.manage().window().minimize();
driver.quit();
	}

}
