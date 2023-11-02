package locatorsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_01 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://shop-global.malaicha.com/");
     //identify the register button
     WebElement registerbutton= driver.findElement(By.xpath("//span[@class='loginRegister']"));
	Thread.sleep(4000);
	registerbutton.click();
	Thread.sleep(10000);
	driver.manage().window().minimize();
	driver.quit();
	}

}
