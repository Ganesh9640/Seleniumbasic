package webDriverMethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfgetWindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  //open the browser
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        //create the one window
       // driver.switchTo().newWindow(WindowType.WINDOW);
        driver.switchTo().newWindow(WindowType.TAB);
        //pass the URL to latest window
        driver.get("https://www.facebook.com/");
        Set<String> allwindowId=driver.getWindowHandles();
        System.out.println(allwindowId);
       for(String wid:allwindowId)
       {
    	   System.out.println(wid);
       }
	}

}
