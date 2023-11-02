package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pratice1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver =new ChromeDriver();
driver.get("https://www.facebook.com/");
String title1 = driver.getTitle();
System.out.println(title1);
String pagesource1 = driver.getPageSource();
System.out.println(pagesource1);
Thread.sleep(2000);
driver.navigate().back();
Thread.sleep(2000);
driver.navigate().refresh();
Thread.sleep(2000);
driver.navigate().forward();
Thread.sleep(2000);
String currenturl = driver.getCurrentUrl();
System.out.println(currenturl);
driver.manage().window().minimize();
driver.quit();
	}

}
