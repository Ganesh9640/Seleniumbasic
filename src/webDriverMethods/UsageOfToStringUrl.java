package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfToStringUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instantiate the browser specific class
		 WebDriver driver =new ChromeDriver();
		 //pass the main URL of the
		 driver.get("https://www.dassault-aviation.com/en/");
		 //pass the group page subURL
		 driver.navigate().to("https://www.dassault-aviation.com/en/group/");
		 System.out.println(driver.getTitle());
		 //pass the group page defence subURL
		 driver.navigate().to("https://www.dassault-aviation.com/en/defence/");
		 System.out.println(driver.getTitle());
		 //pass the group page civil subURL
		 driver.navigate().to("https://www.dassault-aviation.com/en/civil/");
		 System.out.println(driver.getTitle());
		 //pass the group page passion subURL
		 driver.navigate().to("https://www.dassault-aviation.com/en/passion/");
		 System.out.println(driver.getTitle());
		 
		 
	}
	
	
	}


