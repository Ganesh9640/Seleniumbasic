package webDriverMethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfNewWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		//driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		Set<String>allWindowId=driver.getWindowHandles();
		
		int CountOfWindowid=allWindowId.size();
		System.out.println(CountOfWindowid);
		System.out.println(allWindowId);
		
	}

}
