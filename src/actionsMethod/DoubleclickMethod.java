package actionsMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleclickMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://demo.guru99.com/test/simple_context_menu.html");
WebElement doubleclickele = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
Actions actions=new Actions(driver);
//Using the doubleclick method
//actions.doubleClick(doubleclickele).perform();
//using the click() from the actons class
actions.click(doubleclickele);
	}

}
