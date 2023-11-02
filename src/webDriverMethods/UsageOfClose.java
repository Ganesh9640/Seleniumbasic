package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfClose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  //open the browser
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        //create the new window
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.facebook.com/");
        //close() will close the current window which the driver is currently focusing 
        //its dont not close the browser api
        driver.close();
	}

}
