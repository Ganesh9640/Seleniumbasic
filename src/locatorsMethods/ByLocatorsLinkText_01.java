package locatorsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLocatorsLinkText_01 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
//pass the URL
driver.get("https://www.facebook.com/");

//identify the linktext link
  WebElement  LinkText=driver.findElement(By.linkText("Forgotten password?"));
  LinkText.click();
 Thread.sleep(5000);
  driver.manage().window().minimize();
  driver.quit();
  
		
		
		
	}

}
