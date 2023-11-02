package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfgetLocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement emailtextfield=driver.findElement(By.id("email"));
		WebElement passContainer=driver.findElement(By.id("passContainer"));
		 Point email1 = emailtextfield.getLocation();
		 int email1x=email1.x;
		 System.out.println(email1x);
		int email1Y= email1.y;
		 System.out.println(email1Y);
		 Point password1 = passContainer.getLocation();
		int paassX =password1 .x;
		System.out.println(paassX);
		int paassy =password1 .y;
		System.out.println(paassy);
		
		if(email1x==paassX )
		{
			System.out.println("pass");
		}
		
			else
			{
				System.out.println("fail");
			}
		driver.quit();
		 
	
	
	
	}

}
