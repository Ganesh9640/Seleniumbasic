package webElement;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.handler.timeout.TimeoutException;

public class UsageOfPageLoadTimeOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(7));
		  //driver.get("https://www.flipkart.com/");
		 try { 
			 driver.get("https://www.flipkart.com/");
		 }
		 catch(TimeoutException obj)
		 {
			 System.out.println("the application is not able to load within the given time");
		 }
		 driver.manage().window().minimize();
		driver.quit(); 
	}

}
