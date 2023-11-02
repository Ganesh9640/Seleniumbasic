package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyToolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.actitime.com/login.do");
WebElement keeppasswordcheck = driver.findElement(By.id("keepLoggedInCheckBox"));
String outputtype = keeppasswordcheck.getAttribute("title");
System.out.println(outputtype);
driver.manage().window().minimize();
driver.quit();
	}

}
