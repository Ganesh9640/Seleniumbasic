package locatorsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NotToGoForClassNameLocators {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();//browser specific class object
	       driver.manage().window().maximize();
	       driver.get("https://www.facebook.com/");//pass the Url
	       //identify the password textfield by class as the locators
	       //InvalidSelectorException-runtime -unchecked exception-selenium
	       WebElement passwordTextField=driver.findElement(By.className("textField pwdfield" ));
	    //enter the password to the password text field
	       passwordTextField.sendKeys("manage");
	       Thread.sleep(5000);
	       driver.manage().window().minimize();
	       driver.quit();
	}

}
