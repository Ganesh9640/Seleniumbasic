package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfClick {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		WebElement username=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		Thread.sleep(2000);
		//precondition for the sendkeys
		username.clear();
		Thread.sleep(2000);
		username.sendKeys("admin");
		WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		Thread.sleep(2000);
		password.clear();
		Thread.sleep(2000);
		password.sendKeys("manager");
		Thread.sleep(2000);
		WebElement loginbutton=driver.findElement(By.xpath("//a[@id='loginButton']"));
		Thread.sleep(2000);
		//Usage Of The Click Method 
		loginbutton.click();
	}

}
