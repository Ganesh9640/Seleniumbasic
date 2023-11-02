package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfgetSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement emailtextfield=driver.findElement(By.id("email"));
		WebElement passContainer=driver.findElement(By.id("passContainer"));
		Dimension getsize=emailtextfield.getSize();
		int height1=getsize.height;
		System.out.println(height1);
		int width1=getsize.width;
		System.out.println(width1);
		Dimension getsize1=passContainer.getSize();
		int height2=getsize1.height;
		System.out.println(height2);
		int width2=getsize1.width;
		System.out.println(width2);
		//if( height1==height2)
			
		//{
		//	System.out.println("pass");
		//}
		//else 
		//{
		//	System.out.println("pass");
		//}
			if( width1==width2)
				
			{
			System.out.println("pass");
				}
				else 
				{
					System.out.println("pass");
				}
		driver.quit();
		
		
		
		
	}

}
