package locatorsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLocatorsCssSelector {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://demo.actitime.com/");
   //identify the username textfeild
//  WebElement locatorscss=driver.findElement(By.cssSelector("input[name='username']"));
  WebElement locatorscss=driver.findElement(By.cssSelector("input[fdprocessedid='zhccad']"));
   //locatorscss.sendKeys("Ganesh");
   locatorscss.sendKeys("lalapnur");
   Thread.sleep(4000);
   driver.manage().window().minimize();
   driver.quit();
   
	}

}
