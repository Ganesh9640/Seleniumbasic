package PopupMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandletheFileUpload {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.guru99.com/test/upload/");
		Thread.sleep(2000);
		WebElement uploadfile = driver.findElement(By.id("uploadfile_0"));
		uploadfile.sendKeys("C:\\Users\\ganes\\OneDrive\\Desktop");
		Thread.sleep(2000);

		WebElement checkbox = driver.findElement(By.xpath("//input[@class='field_check']"));
		checkbox.click();
		Thread.sleep(2000);

		WebElement submitbutton = driver.findElement(By.id("submitbutton"));
		submitbutton.click();
		driver.manage().window().minimize();
		driver.quit();
		
	}

}
