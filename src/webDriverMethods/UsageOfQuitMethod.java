package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfQuitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriver driver=new ChromeDriver();
	        driver.get("https://www.flipkart.com/");
	        //create the new window
	        driver.switchTo().newWindow(WindowType.WINDOW);
	        driver.get("https://www.facebook.com/");
	        //quit() will close the current window which the driver is currently focusing 
	        //it also close the browser API
	        driver.quit();
	}

}
