package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfsubmitMethod {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/user-signin");
		Thread.sleep(10000);
		 WebElement username=driver.findElement(By.cssSelector("input[name='Email']"));
		 Thread.sleep(4000);
		 username.clear();
		 username.sendKeys("ganeshlalapnoor@gmail.com");
		 Thread.sleep(4000);
		 WebElement password=driver.findElement(By.xpath("//input[@name='Password']"));
		 Thread.sleep(4000);
		 password.clear();
		 Thread.sleep(4000);
		 password.sendKeys("Ganesh@98");
		 Thread.sleep(4000);
		 password.submit();
		 
		 
		 
		 
	}

}
