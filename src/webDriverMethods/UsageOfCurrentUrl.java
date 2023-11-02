package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfCurrentUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String URL="https://www.facebook.com/";
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/");
		String currrnturl = driver.getCurrentUrl();
		System.out.println(currrnturl);
		if(currrnturl.equals(URL))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
