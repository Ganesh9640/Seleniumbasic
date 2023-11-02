package activeElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfDefaultSuu {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	       driver.get("https://www.google.com/");
	       Thread.sleep(2000);
	       driver.switchTo().activeElement().click();
	       Thread.sleep(2000);
	       List<WebElement> deafaultsugg = driver.findElements(By.xpath("//div[@role='presentation']/ul/li"));
	       for(WebElement dsugg:deafaultsugg)
	       {
	    	  String segg=dsugg.getText();
	    	  Thread.sleep(2000);
	    	  System.out.println(segg);
	       }
	      driver.manage().window().minimize();
	      driver.quit();
	}

}
