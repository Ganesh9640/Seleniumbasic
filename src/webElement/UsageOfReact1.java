package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfReact1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		//username
		WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
		Rectangle usernam1=username.getRect();
		int usernameX=usernam1.getX();
		System.out.println(usernameX);
		int usernameW= usernam1.getWidth();
		System.out.println(usernameW);
		int leftalignment = usernameX+usernameW;
		System.out.println(leftalignment);
		//password
		WebElement password=driver.findElement(By.xpath("//input[@name='pwd']"));
		Rectangle  password1= password.getRect();
		 int passwordX=password1.getX();
		 System.out.println(passwordX);
		 int passwordW= password1.getWidth();
		 System.out.println(passwordW);
		 int leftalignmentpassword=passwordX+passwordW;
		 System.out.println(leftalignmentpassword);
		 driver.quit();
		
		
	}

}
