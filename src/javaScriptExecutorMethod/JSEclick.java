package javaScriptExecutorMethod;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSEclick {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver= new  ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

driver.get("https://demo.actitime.com/");
JavascriptExecutor jse = (JavascriptExecutor)driver;
Thread.sleep(2000);
jse.executeScript("document.getElementById(\"loginButton\").click()");

	}

}
