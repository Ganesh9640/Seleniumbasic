package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfRect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//email
		WebElement emailtextfield=driver.findElement(By.id("email"));
		Rectangle emailtextfield1=emailtextfield.getRect();
		int emailX=emailtextfield1.getX();
		 System.out.println(emailX);
		int emailw=emailtextfield1.getWidth();
		 System.out.println(emailw);
		int  leftaligment= emailX+emailw;
		System.out.println(leftaligment);
		//password
		WebElement passContainer=driver.findElement(By.id("passContainer"));
		Rectangle password=passContainer.getRect();
		int passwordX=password.getX();
		System.out.println(passwordX);
		int password1=password.getWidth();
		System.out.println( password1);
		int leftalignmentpass=passwordX+password1;
		System.out.println(leftalignmentpass);
		driver.quit();
		
		
		

	}

}
