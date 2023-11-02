package pratices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitTimeOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
//implicit time
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://demowebshop.tricentis.com/");
WebElement loginbutton = driver.findElement(By.xpath("//a[text()='Log in']"));
loginbutton.click();
WebElement emailtextfield = driver.findElement(By.id("Email"));
emailtextfield.sendKeys("ganeshlalapnoor@gmail.com");
WebElement passwordtetxfield = driver.findElement(By.id("Password"));
passwordtetxfield.sendKeys("Ganesh@98");
WebElement loginbutton1=driver.findElement(By.xpath("//input[@value='Log in']"));
loginbutton1.click();
WebElement logoutbutton = driver.findElement(By.xpath("//a[text()='Log out']"));
WebDriverWait waittime=new WebDriverWait (driver,Duration.ofSeconds(5));
if(waittime.until(ExpectedConditions.urlToBe("https://demowebshop.tricentis.com/")));
{
	if(logoutbutton.isDisplayed())
	{
		logoutbutton.click();
		System.out.println("logout button is displyed");
	}
	else
	{
		System.out.println("logout button is not displyed");
	}
}
	}

}
