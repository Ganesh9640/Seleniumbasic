package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instantiate the browser specific class
		 WebDriver driver =new ChromeDriver();
		 //pass the main URL of the app
		 driver.get("https://www.cricbuzz.com/");
	}

}
