package actionsMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingthroughAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://www.facebook.com/login/");
WebElement forgotlink = driver.findElement(By.xpath("//a[text()='Forgotten account?']"));
Actions actions = new Actions(driver);
//actions.scrollToElement(forgotlink).click(forgotlink).perform();
actions.scrollByAmount(0, 200).perform();
	}

}
