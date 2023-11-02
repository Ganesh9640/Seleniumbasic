package javaScriptExecutorMethod;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfScrollTo {
//dynamic weboage 
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/doodles");
        JavascriptExecutor jsc = (JavascriptExecutor)driver;
       
        jsc.executeScript("window.scrollTo(0,2000)");
         Thread.sleep(2000);
        jsc.executeScript("window.scrollTo(0,4000)");
        Thread.sleep(2000);
        jsc.executeScript("window.scrollTo(0,-2000)");
        Thread.sleep(2000);   
        driver.manage().window().minimize();
        driver.quit();
	}

}
