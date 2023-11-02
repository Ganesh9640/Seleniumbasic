package PopupMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandletheFiledownload {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		 JavascriptExecutor jse=(JavascriptExecutor)driver;
		 jse.executeScript("window.scrollBy(0,800)");
		WebElement downloadoptns = driver.findElement(By.xpath("//a[text()='4.10.0']"));
		downloadoptns.click();
		
	}

}
