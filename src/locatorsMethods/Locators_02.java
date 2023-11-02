package locatorsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_02 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.icc-cricket.com/");
//identify the menu button of the webpage
	WebElement menubutton=driver.findElement(By.cssSelector("button[class='hamburger js-sidebar-btn is-open']"));
	Thread.sleep(2000);
	menubutton.click();
	//identify the close button
	WebElement closebutton=driver.findElement(By.cssSelector("span[class='sidebar-nav__close js-sidebar-btn is-open']"));
	Thread.sleep(2000);
	closebutton.click();
	Thread.sleep(2000);
	driver.manage().window().minimize();
	driver.quit();
	
	
	}

}
