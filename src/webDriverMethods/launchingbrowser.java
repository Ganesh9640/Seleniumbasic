package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchingbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ChromeDriver driver=new ChromeDriver();
		//here get() is coming  from RemoteWebdriver Imp Class
		//We are not Following OOAD Principle
		//driver.get("");
  WebDriver driver =new ChromeDriver();
  //trigger the mainURL
  //Network error-WebDriverException-get()-selenium-run-unchecked
  driver.get("https://www.facebook.com/");
	}

}