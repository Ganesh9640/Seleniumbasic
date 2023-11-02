package locatorsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pratice {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
      driver.get("https://demo.actitime.com/");
      driver.manage().window().maximize();
      WebElement userTextField=driver.findElement(By.id("username" ));
      userTextField.sendKeys("admin");
      Thread.sleep(5000);
      WebElement passwordTextField=driver.findElement(By.name("pwd"));
      passwordTextField.sendKeys("manage");
      Thread.sleep(5000);
     
	}

}
