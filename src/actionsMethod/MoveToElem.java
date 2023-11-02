package actionsMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://www.myntra.com/");
WebElement mensOptions = driver.findElement(By.xpath("//div[@class='desktop-navLink']//a[text()='Men']"));
Actions actions = new Actions(driver);
actions.moveToElement(mensOptions, 0, 0).pause(2000).
moveToElement(mensOptions, 72, 0).pause(2000).
moveToElement(mensOptions, 146, 0).pause(2000)
.moveToElement(mensOptions, 243, 0).pause(2000).
moveToElement(mensOptions, 350, 0).pause(2000).
moveToElement(mensOptions, 436, 0).perform();


	}

}
//href="/shop/men"