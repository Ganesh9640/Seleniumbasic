package locatorsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WhenNotGoForId {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		  WebDriver driver=new ChromeDriver();//browser specific class object
	       driver.manage().window().maximize();
	       driver.get("https://www.facebook.com/");//pass the Url
	       //identify the login button
	       //NoSuchElementException-runtime -unchecked exception-selenium
	       WebElement loginButton=driver.findElement(By.id("u_0_5_Fa" ));
	       loginButton.click();
	       Thread.sleep(5000);
	       driver.manage().window().minimize();
	       driver.quit();
	}

}
