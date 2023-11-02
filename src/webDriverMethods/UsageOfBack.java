package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfBack {

	public static void main(String[] args) throws Throwable {
		//instantiate the browser specific class
		 WebDriver driver =new ChromeDriver();
		 //pass the main URL of the
		 driver.get("https://www.facebook.com/");
		 Thread.sleep(2000);
		 //loginpage to empty browser
		 driver.navigate().back();
		 Thread.sleep(2000);
		// emptypage to login page
		 driver.navigate().forward();
		 Thread.sleep(2000);
		 //reload the same page
		 driver.navigate().refresh();
	}

}
