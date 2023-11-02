package activeElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfAutoSuggestion {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.google.com/");
       Thread.sleep(3000);
        //WebElement seletext = driver.findElement(By.xpath("selenium"));
       driver.switchTo().activeElement().sendKeys("Selenium");
       Thread.sleep(3000);
       List<WebElement> autosugg = driver.findElements(By.xpath("//div[@role='presentation']/ul/li"));
       for(WebElement opt:autosugg)
       {
    	   String opttext = opt.getText();
    	   System.out.println(opttext);
    	   if(opttext.contains(" testing"))
    	   {
    		   opt.click();
    		   Thread.sleep(3000);
    		   break;
    	   }
    	   
       }
       driver.manage().window().minimize();
       driver.quit();
	}

}
