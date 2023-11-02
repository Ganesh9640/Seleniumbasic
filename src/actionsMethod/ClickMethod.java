package actionsMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://www.facebook.com/");
//WebElement loginbutton = driver.findElement(By.xpath("//button[@name='login']"));
Actions actions = new Actions(driver);
//Using the click(WebElement TargetElement)-return type is actions class
//Using the perform()-return type is void
//actions.click(loginbutton).perform();

//Using of the contextclick(WebElement) method
//actions.contextClick(loginbutton).perform();
//Usind of the contextclick()
//actions.contextClick();
WebElement passwordtextfield = driver.findElement(By.id("passContainer"));
//Using theSendkeys(charsequence,args)
//actions.sendKeys(passwordtextfield, "123@ganesh").perform();
//
driver.switchTo().activeElement();
actions.sendKeys("QspiderBTM").perform();

	}

}
