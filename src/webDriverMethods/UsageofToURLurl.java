package webDriverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageofToURLurl {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		//instantiate the browser specific class
		 WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 //pass the main URL of the app
		String url="https://www.dassault-aviation.com/en/";
		URL mainUrl=new URL(url);
		URL groupUrl=new URL(mainUrl,"group/");
		URL defenceUrl=new URL(mainUrl,"defence/");
		URL civilUrl=new URL(mainUrl,"civil/");
		URL passionUrl=new URL(mainUrl,"passion/");
		URL spaceUrl=new URL(mainUrl,"space/");
		driver.get("https://www.dassault-aviation.com/en/");
		System.out.println(driver.getTitle());
		driver.navigate().to(groupUrl);
		System.out.println(driver.getTitle());
		driver.navigate().to(defenceUrl);
		System.out.println(driver.getTitle());
		driver.navigate().to(civilUrl);
		System.out.println(driver.getTitle());
		driver.navigate().to(passionUrl);
		System.out.println(driver.getTitle());
		driver.navigate().to(spaceUrl);
		System.out.println(driver.getTitle());

		

	}

}
