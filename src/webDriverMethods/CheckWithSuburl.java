package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckWithSuburl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instantiate the browser specific class
		 WebDriver driver =new ChromeDriver();
		 //pass the main URL of the 
		 driver.get("https://www.cricbuzz.com/cricket-schedule/upcoming-series/international");
	}

}
