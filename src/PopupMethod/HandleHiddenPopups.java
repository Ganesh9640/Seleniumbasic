package PopupMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleHiddenPopups {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://www.flipkart.com/");
Thread.sleep(2000);
Actions actions = new Actions(driver);
actions.click().perform();
//handling the popup
//WebElement closeoption = driver.findElement(By.xpath("//button[text()='✕']"));
//closeoption.click();
	}

}
