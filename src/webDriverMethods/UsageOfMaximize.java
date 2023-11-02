package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfMaximize {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
//precondition for program
//maximize the window
driver.manage().window().maximize();
//pass the URl
driver.get("https://www.shoppersstack.com/");
//get the fullscreen
Thread.sleep(4000);
driver.manage().window().fullscreen();
Thread.sleep(4000);
driver.manage().window().minimize();
Thread.sleep(4000);
System.out.println(driver.manage().window().getSize());
Thread.sleep(4000);
driver.quit();

	}

}
