package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instantiate the browser specific class
		 WebDriver driver =new ChromeDriver();
		 //pass the main URL of the
		 driver.get("https://demo.actitime.com/");
		String actualtitle= driver.getTitle();
		String expectedtitle= "actiTime-Login"
				+ "";
		if(expectedtitle.equals(actualtitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}


		
	}

}
