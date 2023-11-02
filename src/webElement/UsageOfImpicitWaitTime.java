package webElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsageOfImpicitWaitTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	      driver.manage().window().maximize();
	      driver.get("https://demo.actitime.com/");
	      WebElement userTextField=driver.findElement(By.xpath("//input[@name='username']"));
	      userTextField.sendKeys("admin");
	      WebElement passwordTextField=driver.findElement(By.xpath("//input[@ name='pwd']"));
	      passwordTextField.sendKeys("manager");  
	     WebElement loginbuttonoption= driver.findElement(By.xpath("//a[@id='loginButton']"));
	     loginbuttonoption.click();
	    WebElement  logoutoption=driver.findElement(By.xpath("//a[@ id='logoutLink']"));
	     WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(3));
	     if(wait.until(ExpectedConditions.urlToBe("https://demo.actitime.com/user/submit_tt.do")))
	     {
	    	 if(logoutoption.isDisplayed())
	    	 logoutoption.click();
	    	 System.out.println("the logoutbutton is displayed");
	     }
	     else 
	     {
	    	 System.out.println("the logoutbutton is not displayed");
	     }
	     driver.manage().window().minimize();
	     driver.quit();
	}

}
