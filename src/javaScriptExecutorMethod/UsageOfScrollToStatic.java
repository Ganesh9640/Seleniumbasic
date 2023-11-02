package javaScriptExecutorMethod;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfScrollToStatic {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.instagram.com/");
        JavascriptExecutor jsc = (JavascriptExecutor)driver;
        jsc.executeScript("document.body.scrollTo(0,120)");
        Thread.sleep(2000);
        jsc.executeScript("document.body.scrollTo(0,200)");
        Thread.sleep(2000);
        jsc.executeScript("document.body.scrollTo(0,-140)");
        Thread.sleep(2000);
        driver.manage().window().minimize();
        driver.quit();
        
	}

}
