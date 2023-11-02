package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfDisplayed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement emailtextfield=driver.findElement(By.id("email"));
		if(emailtextfield.isDisplayed())
		{
			System.out.println("emailtextfield is displayed");
		}
		else
		{
			emailtextfield.sendKeys("ganeshlalapnur@gmail.com");
			System.out.println("emailtextfield is not displayed");
		}
	}

}
