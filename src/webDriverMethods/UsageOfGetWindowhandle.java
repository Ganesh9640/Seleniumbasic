package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
//getWindowHandle() will always return the current window Id which the driver is focusing
public class UsageOfGetWindowhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        //open the browser
                WebDriver driver=new ChromeDriver();
                driver.get("https://www.flipkart.com/");
                //storing the Id in parentwindowId refernce
                String parentwindowId=driver.getWindowHandle();
                //get the windowId
                System.out.println(parentwindowId);
                //create the one window
               // driver.switchTo().newWindow(WindowType.WINDOW);
                driver.switchTo().newWindow(WindowType.TAB);
                //pass the URL to latest window
                driver.get("https://www.facebook.com/");
                String childwindowId=driver.getWindowHandle();
                //get the latest window ID
                System.out.println(childwindowId);
	}

}
