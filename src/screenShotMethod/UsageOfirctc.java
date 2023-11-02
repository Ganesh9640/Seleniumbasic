package screenShotMethod;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfirctc {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String timestamp = LocalDateTime.now().toString().replace(':', '-');
		driver.get("https://www.irctc.co.in/nget/train-search");
		WebElement logo=driver.findElement(By.xpath("//span[@class='pull-right hidden-xs']"));
		File temfile=logo.getScreenshotAs(OutputType.FILE);
		File perfile=new File("./bugsshots/"+timestamp+"logoircts.png");
		FileUtils.copyFile(temfile, perfile);
		driver.manage().window().minimize();
		driver.quit();
	}

}
