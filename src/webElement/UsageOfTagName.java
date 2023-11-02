package webElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfTagName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
	        driver.get("https://www.facebook.com/");
	    String Expectedtagname = "input";
	    System.out.println(Expectedtagname);
	   WebElement emailtextfield = driver.findElement(By.id("email"));
	  String ActualTagName = emailtextfield.getTagName();
	  System.out.println(ActualTagName); 
	  if(ActualTagName.equals(Expectedtagname))
	  {
		  emailtextfield.sendKeys("ganeshlalapnoor@gmail.com");
		  System.out.println("the actual tagname is similar to expectedtagname");
	  }
	  else
	  {
		  System.out.println("the actual tagname is not similar to expectedtagname");

	  }
	  driver.manage().window().minimize();
	  driver.quit();
	}

}
