package locatorsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators_Name {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		  WebDriver driver=new ChromeDriver();//browser specific class object
	       driver.manage().window().maximize();
	       driver.get("https://demo.actitime.com/");//pass the Url
	       //identify the password text field
	       WebElement passwordTextField=driver.findElement(By.name("pwd"));
	       passwordTextField.sendKeys("manager");
	       Thread.sleep(5000);
	       driver.manage().window().minimize();
	       driver.quit();
	}

}
