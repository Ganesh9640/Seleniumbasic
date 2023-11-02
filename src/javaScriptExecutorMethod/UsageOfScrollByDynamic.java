package javaScriptExecutorMethod;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfScrollByDynamic {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/doodles");
        JavascriptExecutor jsc = (JavascriptExecutor)driver;
       Long Height = (Long) jsc.executeScript("return document.body.scrollHeight");
       System.out.println(Height);
        Thread.sleep(2000);
       Long Width = (Long)jsc.executeScript("return document.body.scrollWidth");
       System.out.println(Width);
        Thread.sleep(6000);
        driver.navigate().refresh();
        
       Long Height1 = (Long)jsc.executeScript("return document.body.scrollHeight");
       System.out.println(Height1);
       Thread.sleep(6000);
        driver.navigate().refresh();
       Long Height2 = (Long)jsc.executeScript("return document.body.scrollHeight");
       System.out.println(Height2);
       Thread.sleep(6000);
        driver.manage().window().minimize();
        driver.quit();
        
        
       
		
	}

}
