package javaScriptExecutorMethod;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfScrolBy {
	//it is used for the Dynamic

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.google.com/doodles");
        JavascriptExecutor jsc = (JavascriptExecutor)driver;
       // jsc.equals("window.scrollBy(0,2000)");
        jsc.executeScript("window.scrollBy(0,2000)");
         Thread.sleep(2000);
        jsc.executeScript("window.scrollBy(0,5000)");
        Thread.sleep(2000);
        jsc.executeScript("window.scrollBy(0,-7000)");
        Thread.sleep(2000);   
        driver.manage().window().minimize();
        driver.quit();
	}

}
